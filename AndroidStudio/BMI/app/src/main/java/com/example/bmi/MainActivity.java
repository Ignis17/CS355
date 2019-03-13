package com.example.bmi;

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

    public void calBMI(View view){
        Intent intent = new Intent(this,Main2Activity.class);

        EditText userName =  findViewById(R.id.nameEditText);
        EditText userHeight = findViewById(R.id.heightEditText);
        EditText userWeight = findViewById(R.id.weightEditText);


        String name = userName.getText().toString();
        float height = Float.parseFloat(userHeight.getText().toString());
        float weight = Float.parseFloat(userWeight.getText().toString());
        float bmi = ((weight/(height*height))*703);
        String answer = Float.toString(bmi);

        intent.putExtra("name",name);
        intent.putExtra("bmi",answer);

         if(bmi < 18.5){
             intent.putExtra("result","You are considered underweight");
         }
         else if(bmi > 18.5 && bmi <24.9){
             intent.putExtra("result","You are considered healthy");
         }
         else if(bmi > 25 && bmi < 29.9){
            intent.putExtra("result","You are considered overweight");
        }
         else {
             intent.putExtra("result","You are considered obese");

         }

        startActivity(intent);

    }
}
