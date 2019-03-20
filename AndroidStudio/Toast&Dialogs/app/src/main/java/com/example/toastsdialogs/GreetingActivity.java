package com.example.toastsdialogs;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class GreetingActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
        TextView text =  findViewById(R.id.greetTextView);
        text.setText("HELLO FROM THE GREETING ACTIVITY OF MY TOAST AND DIALOGS APP");
    }
}
