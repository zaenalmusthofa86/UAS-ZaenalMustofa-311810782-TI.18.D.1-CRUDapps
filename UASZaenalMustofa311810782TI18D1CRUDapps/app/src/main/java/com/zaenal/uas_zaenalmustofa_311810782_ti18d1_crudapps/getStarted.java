package com.zaenal.uas_zaenalmustofa_311810782_ti18d1_crudapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class getStarted extends AppCompatActivity {

    Button start, sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);
        start = findViewById(R.id.btnstart);
        sign = findViewById(R.id.btnsign);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getStarted.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getStarted.this, DaftarActivity.class);
                startActivity(intent);
            }
        });
    }
}