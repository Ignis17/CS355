package com.example.basicaccessibility;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayPoem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_poem);

        Intent intent = getIntent();
        String message = intent.getStringExtra("poem");

        TextView tv = (TextView) findViewById(R.id.textView5);
        tv.setText(message);

    }
}
