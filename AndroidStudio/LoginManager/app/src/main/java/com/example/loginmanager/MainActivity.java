package com.example.loginmanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

class LoginManager {
    /** Are the given user name and password known to the system? */
    public static boolean isKnownUser(String name, String psswd) {
        if(name.equals("joelt88") && psswd.equals("123456je")) {
            return true;
        }
        return false;
    }
}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void validateUser(View view){
        Intent intent = new Intent(this, WelcomeActivity.class);
        EditText name = (EditText) findViewById(R.id.editTextUserName);
        EditText passw = (EditText) findViewById(R.id.editTextPsswd);
        String username = (String) name.getText().toString();
        String password = (String) passw.getText().toString();

        if(LoginManager.isKnownUser(username, password)){
            intent.putExtra("user",username);
            startActivity(intent);
        }
        else{
            Toast.makeText(getApplicationContext(),"Wrong Credentials. Try Again.",Toast.LENGTH_LONG).show();
        }
    }
}
