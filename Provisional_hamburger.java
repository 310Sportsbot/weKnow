package com.example.weknow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Provisional_hamburger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provisional_hamburger);
    }
    public void onClickHome(View view){
        Intent intent = new Intent(this,Home.class);
        startActivity(intent);
    }
}