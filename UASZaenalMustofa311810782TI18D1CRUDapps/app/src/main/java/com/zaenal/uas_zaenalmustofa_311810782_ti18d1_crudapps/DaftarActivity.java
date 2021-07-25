package com.zaenal.uas_zaenalmustofa_311810782_ti18d1_crudapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DaftarActivity extends AppCompatActivity {

    Button back, daftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        back = findViewById(R.id.btndaftar);
        daftar = findViewById(R.id.btndaftar);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DaftarActivity.this, getStarted.class);
                startActivity(intent);
            }
        });
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DaftarActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}