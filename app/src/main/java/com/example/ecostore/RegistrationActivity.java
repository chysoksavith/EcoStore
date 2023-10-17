package com.example.ecostore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    EditText name,email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
    }

    public void signup(View view){
        // condition if else validation  for login and register

        String userName = name.getText().toString();
        String userEmail = email.getText().toString();
        String userPassword = password.getText().toString();
        if (TextUtils.isEmpty(userName)){
            Toast.makeText(this, "Enter Your Nane!" , Toast.LENGTH_SHORT).show();
            return;
        }
        // email
        if (TextUtils.isEmpty(userEmail)){
            Toast.makeText(this, "Enter Your Email!" , Toast.LENGTH_SHORT).show();
            return;
        }
        // password
        if (TextUtils.isEmpty(userPassword)){
            Toast.makeText(this, "Enter Your Password!" , Toast.LENGTH_SHORT).show();
            return;
        }
        // check condition if its shorter than 6 and show errors
        if(userPassword.length() < 6){
            Toast.makeText(this, "Password to short", Toast.LENGTH_SHORT).show();
            return;
        }

        startActivity(new Intent(RegistrationActivity.this,MainActivity.class));
    }
    public void singin(View view){
        startActivity(new Intent(RegistrationActivity.this,LoginActivity.class));

    }
}