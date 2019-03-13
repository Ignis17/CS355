package com.example.bmi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name") + " BMI and Health Report";
        String bmi =  "Your BMI is: " + intent.getStringExtra("bmi");
        String result = intent.getStringExtra("result");



        //display message in a TextView
        TextView nameTV = findViewById(R.id.nameTextView);
        TextView bmiTV = findViewById(R.id.bmiTextView);
        TextView status = findViewById(R.id.resultTextView);

        nameTV.setText(name);
        bmiTV.setText(bmi);
        status.setText(result);
    }

}
