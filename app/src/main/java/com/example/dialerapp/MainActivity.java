package com.example.dialerapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText phoneNo, text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneNo = findViewById(R.id.editText1);
        text = findViewById(R.id.editText2);
    }

    public void send (View v) {
        String phone = phoneNo.getText().toString();
        String message = text.getText().toString();

        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(phone, null, message, null, null);
        Toast.makeText(getApplicationContext(), "SMS sent.", Toast.LENGTH_LONG).show();
    }
}
