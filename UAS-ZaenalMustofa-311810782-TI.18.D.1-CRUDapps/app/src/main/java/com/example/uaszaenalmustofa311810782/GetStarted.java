package com.example.uaszaenalmustofa311810782;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.uaszaenalmustofa311810782.frontpage.LoginActivity;
import com.example.uaszaenalmustofa311810782.frontpage.RegisterActivity;

public class GetStarted extends AppCompatActivity {

    Button btnSignIn, btnGetStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);


        btnGetStarted = findViewById(R.id.btnGetStarted);
        btnSignIn = findViewById(R.id.btnSignIn);


        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToSignIn = new Intent(GetStarted.this, LoginActivity.class);
                startActivity(goToSignIn);
                finish();
            }
        });

        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToRegister = new Intent(GetStarted.this, RegisterActivity.class);
                startActivity(goToRegister);
                finish();
            }
        });




    }
}