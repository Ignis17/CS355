package com.example.loginmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Intent intent = getIntent();
        String usern = intent.getStringExtra("user");
        TextView msg = (TextView) findViewById(R.id.text1);
        msg.setText("Welcome " + usern);

    }
}
