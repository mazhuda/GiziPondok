package com.example.irvan.gizipondok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Menu_makan extends AppCompatActivity {

    private Button btnenglish;
    private Button btnindonesia;
    private CardView keluar;
    private CardView menubantuan;
    private CardView menudata;
    private CardView menukonsultasi;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_makan);
//        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        this.menudata = (CardView) findViewById(R.id.menudata);
        this.menukonsultasi = (CardView) findViewById(R.id.menukonsultasi);
        this.menubantuan = (CardView) findViewById(R.id.menubantuan);
        this.keluar = (CardView) findViewById(R.id.keluar);
//        this.tv1 = (TextView) findViewById(R.id.tv1);
//        this.btnindonesia = (Button) findViewById(R.id.btnindonesia);
//        this.btnenglish = (Button) findViewById(R.id.btnenglish);
        this.menudata.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Menu_makan.this.startActivity(new Intent(view.getContext(), menu_2125_ts.class));
            }
        });
        this.menubantuan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
//                MainActivity.this.startActivity(new Intent(view.getContext(), Help.class));
            }
        });
        this.menukonsultasi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
//                MainActivity.this.startActivity(new Intent(view.getContext(), Konsultasi_Gejala.class));
            }
        });
        this.keluar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
//                MainActivity.this.startActivity(new Intent(view.getContext(), Konsultasi_Gejala.class));
            }
        });

    }
}
