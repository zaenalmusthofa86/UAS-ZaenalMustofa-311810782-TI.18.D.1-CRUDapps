package com.zaenal.uas_zaenalmustofa_311810782_ti18d1_crudapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.OvershootInterpolator;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    FloatingActionButton fmain,fone,ftwo,fthree;
    Float translationYaxis = 100f;
    Boolean menuOpen = false;
    OvershootInterpolator interpolator = new OvershootInterpolator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setBackground(null);
        bottomNavigationView.getMenu().getItem(2).setEnabled(true);
        showmenu();
    }

    private void showmenu() {
        fmain = findViewById(R.id.fabmain);
        fone = findViewById(R.id.fab1);
        ftwo = findViewById(R.id.fab2);
        fthree = findViewById(R.id.fab3);
        fone.setAlpha(0f);
        ftwo.setAlpha(0f);
        fthree.setAlpha(0f);
        fone.setTranslationY(translationYaxis);
        ftwo.setTranslationY(translationYaxis);
        fthree.setTranslationY(translationYaxis);

        fmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(menuOpen) {
                    closeMenu();
                } else {
                    openMenu();
                }
            }
        });
        fthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScanActivity.class);
                startActivity(intent);
            }
        });
        ftwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DataActivity.class);
                startActivity(intent);
            }
        });

    }

    private void closeMenu() {
        menuOpen = ! menuOpen;
        fone.animate().translationY(translationYaxis).alpha(0f).setInterpolator(interpolator).setDuration(300).start();
        ftwo.animate().translationY(translationYaxis).alpha(0f).setInterpolator(interpolator).setDuration(300).start();
        fthree.animate().translationY(translationYaxis).alpha(0f).setInterpolator(interpolator).setDuration(300).start();

    }
    private void openMenu() {
        menuOpen = ! menuOpen;
        fone.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
        ftwo.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
        fthree.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
    }
}