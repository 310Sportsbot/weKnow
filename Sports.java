package com.example.weknow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

import java.util.ArrayList;

public class Sports extends AppCompatActivity {
    Switch football, cricket, baseball, luge, rugby, hockey;
    Switch[] all_sports;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outdoors);
        football = findViewById(R.id.football);
        cricket = findViewById(R.id.cricket);
        baseball = findViewById(R.id.baseball);
        luge = findViewById(R.id.luge);
        rugby = findViewById(R.id.rugby);
        hockey = findViewById(R.id.hockey);
        all_sports = new Switch[]{football, cricket, baseball, luge, rugby, hockey};
    }

    public void onClickHome(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }


    public void onClickSave(View view) {

        }



    public void onClickProfile(View view) {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    public void onClickReset(View view) {
        for (int i = 0;i<all_sports.length;i++) {
            if (all_sports[i].isChecked()) {
                all_sports[i].setChecked(false);
            }
        }
    }

    public void onClickMenu(View view){
        Intent intent = new Intent(this, Provisional_hamburger.class);
        startActivity(intent);
    }
}