package com.example.irvan.gizipondok;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import java.util.ArrayList;

public class DB_menu1_2125_ts {
    //mendeklarasikan ROW
    private static final String ROW_ID = "id";
    private static final String ROW_WAKTU = "waktu";
    private static final String ROW_MENU = "menu";
    private static final String ROW_BAHAN = "bahan";
    private static final String ROW_URT = "urt";
    private static final String ROW_BERAT = "berat";
    private static final String ROW_ENERGI = "energi";
    private static final String ROW_PROTEIN = "protein";
    private static final String ROW_LEMAK = "lemak";
    private static final String ROW_KARBOHIDRAT = "karbohidrat";
    //private static final String ROW_SANGATTINGGI = "sangat_tinggi";
    //mendeklarasikan NAMA_DB DAN TABLE DAN DATABASE VERSION
    private static final String NAMA_DB ="employment";
    private static final String NAMA_TABEL="employment_data";
    private static final int DB_VERSION=1;
    //mendeklarasikan CREATE_TABLE = MEMBUAT TABLE"
    private static final String CREATE_TABLE =
            "create table "+NAMA_TABEL+" ("+ROW_ID+" Integer PRIMARY KEY AUTOINCREMENT,"+ROW_WAKTU+" String, "+ROW_MENU+" String,"+ROW_BAHAN+" String,"+ROW_URT+" String, "+ROW_BERAT+ " String, "+ROW_ENERGI+" String, "+ROW_PROTEIN+" String, "+ROW_LEMAK+" String, "+ROW_KARBOHIDRAT+" String)";
    //membuat mendeklarasikan itu adalah context
    private final Context context;
    //membuat mendeklarasikan DatabaseOpenHelper itu adalah dbhelper
    private DatabaseOpenHelper dbhelper;
    //membuat mendeklarasikan SQLiteDatabase itu adalah db
    private SQLiteDatabase db;

    //mengambil context untuk mengakses system di android
    public DB_menu1_2125_ts(Context ctx) {
        //mendeklarasikan ctx adalah context ( context context di ganti ctx )
        this.context = ctx;
        // membuat DatabaseOpenHelper
        dbhelper = new DatabaseOpenHelper(context);
        //menuliskan DatabaseOpenHelper = SQLiteDatabase
        db = dbhelper.getWritableDatabase();
    }
    private static class DatabaseOpenHelper extends SQLiteOpenHelper {
        //membuat database
        public DatabaseOpenHelper(Context context) {
            super(context, NAMA_DB, null, DB_VERSION);
            // TODO Auto-generated constructor stub
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            // TODO Auto-generated method stub

            String sql = "create table employment_data(id int(3) primary key, waktu varchar(50) null, menu varchar(50) null, bahan varchar(50) null, urt varchar(50) null, berat varchar(50) null, energi varchar(50) null, protein varchar(50) null, lemak varchar(50) null, karbohidrat varchar(50) null);";
            Log.d("Data", "onCreate: " + sql);
            db.execSQL(sql);
            db.execSQL("INSERT INTO employment_data(id, waktu, menu, bahan, urt, berat, energi, protein, lemak, karbohidrat) VALUES ('1', '06.00', 'NASI', 'Nasi Putih', '1,5 Centong Datar', '150', '262,5', '6', '0', '60');");
            db.execSQL("INSERT INTO employment_data(id, waktu, menu, bahan, urt, berat, energi, protein, lemak, karbohidrat) VALUES ('2', '', 'PEPES IKAN', 'Ikan', '1 potong sedang', '40', '50', '7', '2', '0');");
            db.execSQL("INSERT INTO employment_data(id, waktu, menu, bahan, urt, berat, energi, protein, lemak, karbohidrat) VALUES ('3', '', 'TAHU BUMBU BALADO', 'Tahu', '1 biji besar', '110', '75', '5', '3', '7');");
            db.execSQL("INSERT INTO employment_data(id, waktu, menu, bahan, urt, berat, energi, protein, lemak, karbohidrat) VALUES ('4', '', '', 'Minyak', '1 sendok teh', '5', '50', '0', '5', '0');");
            db.execSQL("INSERT INTO employment_data(id, waktu, menu, bahan, urt, berat, energi, protein, lemak, karbohidrat) VALUES ('5', '', 'SAYUR LODEH', 'Terong', '1/2 gelas', '50', '12,5', '0,5', '0', '2,5');");
            db.execSQL("INSERT INTO employment_data(id, waktu, menu, bahan, urt, berat, energi, protein, lemak, karbohidrat) VALUES ('6', '', '', 'Kacang panjang', '1/2 gelas', '50', '12,5', '0,5', '0', '2,5');");
            db.execSQL("INSERT INTO employment_data(id, waktu, menu, bahan, urt, berat, energi, protein, lemak, karbohidrat) VALUES ('7', '', '', 'Santan', '1/3 gelas', '40', '50', '0', '5', '0');");
            db.execSQL("INSERT INTO employment_data(id, waktu, menu, bahan, urt, berat, energi, protein, lemak, karbohidrat) VALUES ('8', '', 'BUAH SALAK', 'Salak', '2 buah sedang', '65', '50', '0', '0', '12');");
            db.execSQL("INSERT INTO employment_data(id, waktu, menu, bahan, urt, berat, energi, protein, lemak, karbohidrat) VALUES ('9', '', 'AIR MINERAL', 'Air mineral', '1 gelas', '200 ml', '0', '0', '0', '0');");
            db.execSQL("INSERT INTO employment_data(id, waktu, menu, bahan, urt, berat, energi, protein, lemak, karbohidrat) VALUES ('10', '', '', '', '', '', '562,5', '19', '15', '84');");
            db.execSQL("INSERT INTO employment_data(id, waktu, menu, bahan, urt, berat, energi, protein, lemak, karbohidrat) VALUES ('11', '09.00', 'NASI', 'Nasi Putih', '1,5 Centong Datar', '150', '262,5', '6', '0', '60');");
            db.execSQL("INSERT INTO employment_data(id, waktu, menu, bahan, urt, berat, energi, protein, lemak, karbohidrat) VALUES ('12', '', 'PEPES IKAN', 'Ikan', '1 potong sedang', '40', '50', '7', '2', '0');");
            db.execSQL("INSERT INTO employment_data(id, waktu, menu, bahan, urt, berat, energi, protein, lemak, karbohidrat) VALUES ('13', '', 'TAHU BUMBU BALADO', 'Tahu', '1 biji besar', '110', '75', '5', '3', '7');");
            db.execSQL("INSERT INTO employment_data(id, waktu, menu, bahan, urt, berat, energi, protein, lemak, karbohidrat) VALUES ('14', '', '', 'Minyak', '1 sendok teh', '5', '50', '0', '5', '0');");
            db.execSQL("INSERT INTO employment_data(id, waktu, menu, bahan, urt, berat, energi, protein, lemak, karbohidrat) VALUES ('15', '', 'SAYUR LODEH', 'Terong', '1/2 gelas', '50', '12,5', '0,5', '0', '2,5');");
            db.execSQL("INSERT INTO employment_data(id, waktu, menu, bahan, urt, berat, energi, protein, lemak, karbohidrat) VALUES ('16', '', '', 'Kacang panjang', '1/2 gelas', '50', '12,5', '0,5', '0', '2,5');");
            db.execSQL("INSERT INTO employment_data(id, waktu, menu, bahan, urt, berat, energi, protein, lemak, karbohidrat) VALUES ('17', '', '', 'Santan', '1/3 gelas', '40', '50', '0', '5', '0');");
            db.execSQL("INSERT INTO employment_data(id, waktu, menu, bahan, urt, berat, energi, protein, lemak, karbohidrat) VALUES ('18', '', 'BUAH SALAK', 'Salak', '2 buah sedang', '65', '50', '0', '0', '12');");
            db.execSQL("INSERT INTO employment_data(id, waktu, menu, bahan, urt, berat, energi, protein, lemak, karbohidrat) VALUES ('19', '', 'AIR MINERAL', 'Air mineral', '1 gelas', '200 ml', '0', '0', '0', '0');");
            db.execSQL("INSERT INTO employment_data(id, waktu, menu, bahan, urt, berat, energi, protein, lemak, karbohidrat) VALUES ('20', '', '', '', '', '', '562,5', '19', '15', '84');");
        }
        //memperbarui database bila sudah ada
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVer, int newVer) {
            // TODO Auto-generated method stub
            db.execSQL("DROP TABLE IF EXISTS "+NAMA_DB);
            onCreate(db);

        }
    }
    //menutup DatabaseOpenHelper
    public void close() {
        dbhelper.close();
    }
    //menambahkan pada row
    public void addRow(String waktu, String menu, String bahan, String urt, String berat, String energi, String protein, String lemak, String karbohidrat) {
        ContentValues values = new ContentValues();
        values.put(ROW_WAKTU, waktu);
        values.put(ROW_MENU, menu);
        values.put(ROW_BAHAN, bahan);
        values.put(ROW_URT, urt);
        values.put(ROW_BERAT, berat);
        values.put(ROW_ENERGI, energi);
        values.put(ROW_PROTEIN, protein);
        values.put(ROW_LEMAK, lemak);
        values.put(ROW_KARBOHIDRAT, karbohidrat);
        //values.put(ROW_SANGATTINGGI, sangattinggi);

        try {
            //menambahkan nama tabel bila tidak akan error
            // db.delete(NAMA_TABEL, null, null);
            db.insert(NAMA_TABEL, null, values);
        } catch (Exception e) {
            Log.e("DB ERROR", e.toString());
            e.printStackTrace();
        }
    }
    //membuat array pada table layout
    public ArrayList<ArrayList<Object>> ambilSemuaBaris() {
        ArrayList<ArrayList<Object>> dataArray = new ArrayList<ArrayList<Object>>();
        Cursor cur;
        try {
            cur = db.query(NAMA_TABEL,
                    new String[] { ROW_ID, ROW_WAKTU, ROW_MENU, ROW_BAHAN, ROW_URT, ROW_BERAT, ROW_ENERGI, ROW_PROTEIN, ROW_LEMAK, ROW_KARBOHIDRAT}, null, null,
                    null, null, null);
            cur.moveToFirst();
            if (!cur.isAfterLast()) {
                do {
                    ArrayList<Object> dataList = new ArrayList<Object>();
                    dataList.add(cur.getString(0));
                    dataList.add(cur.getString(1));
                    dataList.add(cur.getString(2));
                    dataList.add(cur.getString(3));
                    dataList.add(cur.getString(4));
                    dataList.add(cur.getString(5));
                    dataList.add(cur.getString(6));
                    dataList.add(cur.getString(7));
                    dataList.add(cur.getString(8));
                    dataList.add(cur.getString(9));
                    dataArray.add(dataList);

                } while (cur.moveToNext());

            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Log.e("DEBE ERROR", e.toString());
        }
        return dataArray;

    }
}