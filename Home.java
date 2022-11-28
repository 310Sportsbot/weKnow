package com.example.weknow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


    public void onClickMusic(View view){
        Intent intent = new Intent(this, Music.class);
        startActivity(intent);
    }

    public void onClickOutdoors(View view){
        Intent intent = new Intent(this, Outdoors.class);
        startActivity(intent);
    }

    public void onClickSports(View view){
        Intent intent = new Intent(this, Sports.class);
        startActivity(intent);
    }

    public void onClickSportsMedia(View view){
        Intent intent = new Intent(this, Media.class);
        startActivity(intent);
    }

    public void onClickProfile(View view) {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    public void onClickMenu(View view){
        Intent intent = new Intent(this, Provisional_hamburger.class);
        startActivity(intent);
    }


}