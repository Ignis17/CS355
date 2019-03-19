package com.example.toastsdialogs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
        EditText text = findViewById(R.id.messageEditText);
        String msg = text.getText().toString();
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }
}
