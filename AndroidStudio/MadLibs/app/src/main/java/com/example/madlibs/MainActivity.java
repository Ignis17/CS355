package com.example.madlibs;

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
    public void displayMadLibs(View view){
        Intent intent = new Intent(this,DisplayActivity.class);
        // EditTexts definitions:
        EditText verb1 = findViewById(R.id.verb1EditText);
        EditText adj1 = findViewById(R.id.adjective1EditText);
        EditText noun1 = findViewById(R.id.noun1EditText);
        EditText noun2 = findViewById(R.id.noun2EditText);
        EditText verb2 = findViewById(R.id.verb2EditText);
        EditText body = findViewById(R.id.bodyEditText);
        EditText verb3 = findViewById(R.id.verb3EditText);
        EditText adj2 = findViewById(R.id.adjective2EditText);
        EditText noun3 = findViewById(R.id.noun3EditText);
        EditText noun4 = findViewById(R.id.noun4EditText);
        EditText noun5 = findViewById(R.id.noun5EditText);
        EditText adj3 = findViewById(R.id.adjective3EditText);
        EditText noun6 = findViewById(R.id.noun6EditText);
        EditText silly = findViewById(R.id.sillyEditText);
        EditText noun7 = findViewById(R.id.noun7EditText);


        String [] out = new String[15];
        out[0] = verb1.getText().toString();
        out[1] = adj1.getText().toString();
        out[2] = noun1.getText().toString();
        out[3] = noun2.getText().toString();
        out[4] = verb2.getText().toString();
        out[5] = body.getText().toString();
        out[6] = verb3.getText().toString();
        out[7] = adj2.getText().toString();
        out[8] = noun3.getText().toString();
        out[9] = noun4.getText().toString();
        out[10] = noun5.getText().toString();
        out[11] = adj3.getText().toString();
        out[12] = noun6.getText().toString();
        out[13] = silly.getText().toString();
        out[14] = noun7.getText().toString();

        intent.putExtra("message",Games.madLibs(out));
        startActivity(intent);


    }
}
