package com.zaenal.uas_zaenalmustofa_311810782_ti18d1_crudapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // langsung pindah ke MainActivity atau activity lain
        // begitu memasuki splash screen ini
        Intent intent = new Intent(this, getStarted.class);
        startActivity(intent);
        finish();
    }
}
