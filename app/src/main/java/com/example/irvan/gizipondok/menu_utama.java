package com.example.irvan.gizipondok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu_utama extends AppCompatActivity {
    public static final String URL = "http://192.168.42.161/api/";
    Button hitung ,panduan ,menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        hitung = (Button) findViewById(R.id.perhitungan);
        menu = (Button) findViewById(R.id.menu);
        panduan =(Button) findViewById(R.id.panduan);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(menu_utama.this, Perhitungan.class);
                startActivity(a);
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(menu_utama.this, Menu_makan.class);
                startActivity(b);
            }
        });

       panduan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(menu_utama.this, cobbaa.class);
                startActivity(c);
            }
        });
    }
}
