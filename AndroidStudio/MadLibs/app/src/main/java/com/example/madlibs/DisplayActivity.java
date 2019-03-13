package com.example.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent  = getIntent();
        String msg = intent.getStringExtra("message");

        TextView msgDisplay = findViewById(R.id.displayTextView);
        msgDisplay.setText(msg);
    }

}
