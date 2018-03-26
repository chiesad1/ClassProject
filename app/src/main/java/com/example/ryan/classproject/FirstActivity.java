package com.example.ryan.classproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;



public class FirstActivity extends Activity implements OnClickListener {
    Button button;
    RadioGroup genderRadioGroup;
    EditText name, email, phone, address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        findId();

        button.setOnClickListener(this);
    }

    private void findId(){
        button = (Button) findViewById(R.id.submit);
        name = (EditText) findViewById(R.id.name);
        address = (EditText) findViewById(R.id.address);
        email = (EditText) findViewById(R.id.email);
        phone = (EditText) findViewById(R.id.phone);

        genderRadioGroup = (RadioGroup) findViewById(R.id.gender);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

        //creates a bundle object to collect all the strings
        Bundle a = new Bundle();

        //strings for bundling
        a.putString("name", name.getText().toString());
        a.putString("address", address.getText().toString());
        a.putString("email", email.getText().toString());
        a.putString("phone", phone.getText().toString());

        int id = genderRadioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(id);
        a.putString("gender", radioButton.getText().toString());

        intent.putExtras(a);

        startActivity(intent);

    }


}
