package com.example.irvan.gizipondok;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

public class Perhitungan extends AppCompatActivity {
    EditText usia1, usia2, usia3, usia4, usia5, usia6;
    TextView hasil, hasil_kali, ratarata;
    Double hasil_koma, Ratarata;
    RadioButton L, P;
    Integer jumlah_total_anak, jumlah_total_usia;
    Button hitung, tampil;
    FrameLayout view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perhitungan);

        usia1 = (EditText) findViewById(R.id.usia1);
        usia2 = (EditText) findViewById(R.id.usia2);
        usia3 = (EditText) findViewById(R.id.usia3);
        usia4 = (EditText) findViewById(R.id.usia4);
        usia5 = (EditText) findViewById(R.id.usia5);
        usia6 = (EditText) findViewById(R.id.usia6);
        hasil = (TextView) findViewById(R.id.hasil);
        hasil_kali = (TextView) findViewById(R.id.hasil_kali);
        L = (RadioButton) findViewById(R.id.L);
        P = (RadioButton) findViewById(R.id.P);
        ratarata = (TextView) findViewById(R.id.rata_rata);
        hitung = (Button) findViewById(R.id.hitung);
        tampil = (Button) findViewById(R.id.menu);


        /*L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (L.isChecked() == true){
                    linier1.setVisibility(View.GONE);
                }else{
                    linier1.setVisibility(View.VISIBLE);
                }
            }
        });*/

        tampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Jumlah_anak();
                jumlah_usia();
                Ratarata = (double)jumlah_total_usia / (double)jumlah_total_anak;
                ratarata.setText(String.format("%.1f",Ratarata));
            }
        });

    }

    public void Jumlah_anak(){
        int a,b,c,d,e,f;
        if (usia1.length() == 0){
            a = 0;
        }else{
            a = Integer.parseInt(usia1.getText().toString());
        }
        if (usia2.length() == 0){
            b = 0;
        }else {
            b = Integer.parseInt(usia2.getText().toString());
        }
        if (usia3.length() == 0){
            c = 0;
        }else{
            c = Integer.parseInt(usia3.getText().toString());
        }
        if (usia4.length() == 0){
            d = 0;
        }else{
            d = Integer.parseInt(usia4.getText().toString());
        }
        if (usia5.length() == 0){
            e = 0;
        }else{
            e = Integer.parseInt(usia5.getText().toString());
        }
        if (usia6.length() == 0){
            f = 0;
        }else{
            f = Integer.parseInt(usia6.getText().toString());
        }

        jumlah_total_anak = a + b + c + d + e + f;
        hasil.setText(jumlah_total_anak.toString());
    }

    public void jumlah_usia(){
        int a,b,c,d,e,f;
        if (usia1.length() == 0){
            a = 0;
        }else{
            a = Integer.parseInt(usia1.getText().toString());
        }
        if (usia2.length() == 0){
            b = 0;
        }else {
            b = Integer.parseInt(usia2.getText().toString());
        }
        if (usia3.length() == 0){
            c = 0;
        }else{
            c = Integer.parseInt(usia3.getText().toString());
        }
        if (usia4.length() == 0){
            d = 0;
        }else{
            d = Integer.parseInt(usia4.getText().toString());
        }
        if (usia5.length() == 0){
            e = 0;
        }else{
            e = Integer.parseInt(usia5.getText().toString());
        }
        if (usia6.length() == 0){
            f = 0;
        }else{
            f = Integer.parseInt(usia6.getText().toString());
        }

        jumlah_total_usia = (13*a) + (14*b) + (15*c) + (16*d) + (17*e) + (18*f);
        hasil_kali.setText(jumlah_total_usia.toString());

    }
}
