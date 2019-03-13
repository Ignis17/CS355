package com.example.gamesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayToast(View v){
        EditText text = findViewById(R.id.nameEditText);
        String name = text.getText().toString();
        Toast.makeText(getApplicationContext(), Games.fortuneTeller(name), Toast.LENGTH_LONG).show();
    }
}
