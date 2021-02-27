package com.numrah.onlineclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    EditText emailEt;
    EditText passEt;
    TextInputLayout emailTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();

    }

    private void getDetails() {

        String email = emailEt.getText().toString();
        String pass = passEt.getText().toString();

        if (email.isEmpty()) {
            emailTv.setError("Email Required");
        }
        else if (pass.isEmpty()) {
            passEt.setError("Password Required");
        }
        else {
            Intent homeIntent = new Intent(MainActivity.this, Home.class);
            startActivity(homeIntent);
        }

//
    }

    private void init() {

        emailEt = findViewById(R.id.emailEt);
        passEt = findViewById(R.id.passEt);
        emailTv=findViewById(R.id.emailTv);


    }

    public void login(View view) {

        getDetails();
    }


}
