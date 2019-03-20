package com.example.toastsdialogs;

import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class    MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayToast(View v){
        EditText text = findViewById(R.id.messageEditText);
        String msg = text.getText().toString();
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
    public void displayAlert(View v) {
        EditText text = findViewById(R.id.messageEditText);
        String msg = text.getText().toString();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Alert Dialog");
        builder.setMessage(msg).setIcon(R.mipmap.ic_launcher);
    // Setting OK Button
        builder.setPositiveButton("ACCEPT", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
        // Write your code here to execute after dialog closed
                Toast.makeText(getApplicationContext(), "You clicked on ACCEPT.",
                        Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("REJECT", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to execute after dialog closed
                Toast.makeText(getApplicationContext(), "You clicked on REJECTED.",
                        Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void displayNotification(View v){
        final int NOTIF_ID = 1111;
        NotificationManager notifManager =(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        PendingIntent intent = PendingIntent.getActivity (this, 0, new Intent(this, GreetingActivity.class), 0);
        NotificationCompat.Builder note = new NotificationCompat.Builder(this, "my_channel_id");
        note.setSmallIcon(R.mipmap.ic_launcher);
        note.setContentTitle("New Greeting");
        note.setContentText("You have one unread message.");
        note.setContentIntent(intent);
        note.setAutoCancel(true);
        Notification notif = note.build();
        notifManager.notify(NOTIF_ID, notif);
    }
}
