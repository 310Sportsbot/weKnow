package com.example.weknow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

import java.util.ArrayList;

public class Outdoors extends AppCompatActivity {
    Switch fishing, kayaking, horse, foraging, wildlifephoto, bike;
    Switch[] all_hobbies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outdoors);
        fishing = findViewById(R.id.fishing);
        kayaking = findViewById(R.id.kayaking);
        foraging = findViewById(R.id.foraging);
        bike = findViewById(R.id.bike);
        wildlifephoto = findViewById(R.id.wildlifephoto);
        horse = findViewById(R.id.horse);
        all_hobbies=new Switch[]{fishing,kayaking,foraging,bike,wildlifephoto,horse};
        SharedPreferences sharedPreferences=getSharedPreferences("save",MODE_PRIVATE);
        fishing.setChecked(sharedPreferences.getBoolean("fishing",false));
        kayaking.setChecked(sharedPreferences.getBoolean("kayaking",false));
        foraging.setChecked(sharedPreferences.getBoolean("foraging",false));
        bike.setChecked(sharedPreferences.getBoolean("bike",false));
        wildlifephoto.setChecked(sharedPreferences.getBoolean("wildlifephoto",false));
        horse.setChecked(sharedPreferences.getBoolean("horse",false));
    }


    public void onClickHome(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }


    public void onClickSave(View view) {

            SharedPreferences.Editor editor=getSharedPreferences("save",MODE_PRIVATE).edit();
            editor.putBoolean("fishing",fishing.isChecked());
            editor.putBoolean("kayaking",kayaking.isChecked());
            editor.putBoolean("foraging",foraging.isChecked());
            editor.putBoolean("bike",bike.isChecked());
            editor.putBoolean("wildlifephoto",wildlifephoto.isChecked());
            editor.putBoolean("horse",horse.isChecked());
            editor.apply();
        }


    public void onClickProfile(View view) {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    public void onClickReset(View view) {

        for (int i = 0;i<all_hobbies.length;i++) {
            if (all_hobbies[i].isChecked())
                all_hobbies[i].setChecked(false);
        }
    }

    public void onClickMenu(View view){
        Intent intent = new Intent(this, Provisional_hamburger.class);
        startActivity(intent);
    }
}