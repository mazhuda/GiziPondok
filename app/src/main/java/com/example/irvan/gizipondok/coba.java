package com.example.irvan.gizipondok;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.irvan.gizipondok.Modal.Ss;
import com.itextpdf.xmp.impl.Utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class coba extends AppCompatActivity {

    private View main;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coba);
        //main = findViewById(R.id.main);


        /*cvt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PdfDocument pdfDocument = new PdfDocument();
                PdfDocument.PageInfo pageInfo = new PdfDocument.PageInfo.Builder(b.getWidth(),b.getHeight(),1).create();
                PdfDocument.Page page = pdfDocument.startPage(pageInfo);
                Canvas canvas = page.getCanvas();
                Paint paint = new Paint();
                paint.setColor(Color.parseColor("FFFFFFF"));
                canvas.drawPaint(paint);

                b = Bitmap.createScaledBitmap(b,b.getWidth(),b.getHeight(),true);
                paint.setColor(Color.BLUE);
                canvas.drawBitmap(b,0,0,null);
                pdfDocument.finishPage(page);

                // save pdf

                File root = new File(Environment.getExternalStorageDirectory(),"PDF 12");
                if (root.exists()){
                    root.mkdir();
                }
                File file = new File(root,"picture.pdf");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    pdfDocument.writeTo(fileOutputStream);
                }catch (IOException e){
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(),"wrng", Toast.LENGTH_LONG).show();
                }

                pdfDocument.close();

            }

        });*/

    }


}
