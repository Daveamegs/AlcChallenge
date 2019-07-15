package com.example.alcchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button abtAlcBtn = (Button) findViewById(R.id.about_alc_btn);
        Button myProfileBtn = (Button) findViewById(R.id.my_profile_btn);

        abtAlcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutAlcActivity.class);
                startActivity(intent);
            }
        });
        myProfileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}
