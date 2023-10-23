package com.example.ecostore.actvities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ecostore.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    EditText email,password;
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        auth = FirebaseAuth.getInstance();

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
    }

    public void signIn(View view){

        String userEmail = email.getText().toString();
        String userPassword = password.getText().toString();
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

        auth.signInWithEmailAndPassword(userEmail,userPassword)
                        .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()){
                                    Toast.makeText(LoginActivity.this, "Login successfully", Toast.LENGTH_SHORT).show();
                                    startActivity(new Intent(LoginActivity.this,MainActivity.class));
                                }else{
                                    Toast.makeText(LoginActivity.this, "Errors"+task.getException(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        });

    }
    public void signUp(View view){
        startActivity(new Intent(LoginActivity.this,RegistrationActivity.class));

    }
}