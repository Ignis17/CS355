package com.example.dayslived;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class DaysLivedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days_lived);
    }

    public void CalculateDays(View v){
        Intent intent = getIntent();
        String usern = intent.getStringExtra("user");
        TextView msg =  findViewById(R.id.msgTextView);
        DatePicker p =  findViewById(R.id.simpleDatePicker);
        int day = p.getDayOfMonth();
        int month = p.getMonth();
        int year = p.getYear();
        Calendar c = Calendar.getInstance();
        int currentYear = c.get(Calendar.YEAR);
        int currentMonth = c.get(Calendar.MONTH) + 1;
        int currentDay = c.get(Calendar.DAY_OF_MONTH);
        int [] rd = {0,31,59,90,120,151,181,212,243,273,304,334,365};

        if(month <= 2)
        {
           month = month + 12;
            year = year - 1;
        }

        long days1 = ((365*(year-1900))+(rd[month-1])+day+((year-1900)/4) - ((year-1900)/100) + ((year-1900)/400));
        long days2 = ((365*(currentYear-1900))+(rd[currentMonth-1])+currentDay+((currentYear-1900)/4) - ((currentYear-1900)/100) + ((currentYear-1900)/400));
        long result = days2 - days1 - 30;

        String msgDisplay = "Today is " + currentMonth + "/" + currentDay + "/" + currentYear + "\n"  + usern + " you have lived " + result + " days!!!";

        msg.setText(msgDisplay);
    }
}
