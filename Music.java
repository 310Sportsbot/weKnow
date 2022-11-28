package com.example.weknow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

import java.util.ArrayList;

public class Music extends AppCompatActivity {
    Switch guitar, flute, piano, saxo, singing, banjo;
    Switch[] all_hobbies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        guitar = findViewById(R.id.fishing);
        flute = findViewById(R.id.horse);
        piano = findViewById(R.id.climbing);
        saxo = findViewById(R.id.bike);
        singing = findViewById(R.id.Kayaking);
        banjo = findViewById(R.id.wildlifephoto);
        all_hobbies = new Switch[]{guitar, flute, piano, singing, banjo, saxo};
    }


    public void onClickHome(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }


    public void onClickSave(View view) {
        ArrayList<Integer> value= new ArrayList<>();
        for (int i = 0;i<all_hobbies.length;i++) {
            if (all_hobbies[i].isChecked()) {
                value.add(all_hobbies[i].getId());
            }
        }
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