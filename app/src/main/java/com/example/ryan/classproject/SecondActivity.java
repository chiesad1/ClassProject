package com.example.ryan.classproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle a = getIntent().getExtras();
        TextView name = (TextView) findViewById(R.id.nameValue);
        TextView address = (TextView) findViewById(R.id.addressValue);
        TextView email = (TextView) findViewById(R.id.emailValue);
        TextView phone = (TextView) findViewById(R.id.phoneValue);
        TextView gender = (TextView) findViewById(R.id.genderValue);

        name.setText(a.getCharSequence("name"));
        address.setText(a.getCharSequence("address"));
        email.setText(a.getCharSequence("email"));
        phone.setText(a.getCharSequence("phone"));
        gender.setText(a.getCharSequence("gender"));
    }
}