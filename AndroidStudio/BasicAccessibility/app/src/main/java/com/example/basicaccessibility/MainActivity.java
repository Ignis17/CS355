package com.example.basicaccessibility;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayPoem(View v)
    {
        EditText editText = (EditText) findViewById(R.id.editText2);
        String name = editText.getText().toString();

        editText = (EditText) findViewById(R.id.editText3);
        String feel = editText.getText().toString();

        editText = (EditText) findViewById(R.id.editText4);
        String adj = editText.getText().toString();

        String poem = name + " standing " + feel + " is a " + adj + " example for the crowd";

        Intent intent = new Intent(this,DisplayPoem.class);
        intent.putExtra("poem", poem);
        startActivity(intent);

    }
}
