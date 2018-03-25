package com.example.ryan.classproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class SecondActivity extends Activity {

    private Button startButton;

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

        startButton = (Button) findViewById(R.id.start_button);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                longToast("The quiz is about to begin...");
            }
        });


    }
    //Toast Method to display welcome message
    public void longToast(CharSequence message) {
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,150, 150); //Sets the toast in the center of the screen
        toast.show();//Displays toast message
    }

}