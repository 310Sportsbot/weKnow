package com.example.weknow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
    TextView name;
    TextView description;
    TextView link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        name = findViewById(R.id.name_profile);
        description = findViewById(R.id.description_profile);
        link = findViewById(R.id.link_profile);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
             name.setText(bundle.getString("new_name"));
             description.setText(bundle.getString("new_description"));
             link.setText(bundle.getString("new_link"));
        }
    }

    public void onClickHome(View view){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void onClickEdit(View view){
        Intent intent = new Intent(this,Edit.class);
        Bundle b = new Bundle();
        b.putString("current_name",name.getText().toString());
        b.putString("current_description",description.getText().toString());
        b.putString("current_link",link.getText().toString());
        intent.putExtras(b);
        startActivity(intent);
    }

    public void onClickMenu(View view){
        Intent intent = new Intent(this, Provisional_hamburger.class);
        startActivity(intent);
    }

}