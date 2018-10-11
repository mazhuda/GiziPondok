package com.example.irvan.gizipondok;

/**
 * Created by hellraizer on 06/10/2018.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.irvan.gizipondok.Adapter.RecyclerAdapterDetailSensorDHT;
import com.example.irvan.gizipondok.Modal.ModelDataSensorDHT;

import java.util.ArrayList;
import java.util.List;

public class menu_2125_ts extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    static DB_menu1_2125_ts dm;
    //static DB_menu2_2125_ts dm2;

    LinearLayout layout_loading;
    TextView text_load;
    ImageView icon_load;
    Spinner spinner1 ;


    private RecyclerView rvSensor, rvSensor2;
    private List<ModelDataSensorDHT> mListSensor,mListSensor2;
    private RecyclerAdapterDetailSensorDHT mSensorAdapter, mSensorAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_2125_ts);
        spinner1 = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.pilih_menu, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(this);
//


        menupagi();
        menusiang();

        }

        public void menupagi(){
            dm = new DB_menu1_2125_ts(this);

            rvSensor = (RecyclerView) findViewById(R.id.RecyclerView_Sensor_dht);
            mListSensor = new ArrayList<>();
            //passing to adapter
            mSensorAdapter = new RecyclerAdapterDetailSensorDHT(mListSensor, getApplication());
            rvSensor.setLayoutManager(new LinearLayoutManager(getApplication()));
            rvSensor.setItemAnimator(new DefaultItemAnimator());
            rvSensor.setAdapter(mSensorAdapter);
            mSensorAdapter.notifyDataSetChanged();
            ArrayList<ArrayList<Object>> data = dm.ambilSemuaBaris();
            //

            for (int posisi = 0; posisi < data.indexOf(11) && posisi < 10 ; posisi++) {

                ArrayList<Object> baris = data.get(posisi);
                ModelDataSensorDHT data2 = new ModelDataSensorDHT(
//                    baris.get(0).toString(),
                        baris.get(1).toString(),
                        baris.get(2).toString(),
                        baris.get(3).toString(),
                        baris.get(4).toString(),
                        baris.get(5).toString(),
                        baris.get(6).toString(),
                        baris.get(7).toString(),
                        baris.get(8).toString(),
                        baris.get(9).toString()
                );
                mListSensor.add(data2);
            }
            rvSensor.setVisibility(View.VISIBLE);
            mSensorAdapter = new RecyclerAdapterDetailSensorDHT (mListSensor,getApplication ());
            rvSensor.setAdapter(mSensorAdapter);

        }
        public void menusiang(){
            dm = new DB_menu1_2125_ts(this);
            rvSensor = (RecyclerView) findViewById(R.id.RecyclerView_Sensor_dht2);
            mListSensor = new ArrayList<>();
            //passing to adapter
            mSensorAdapter = new RecyclerAdapterDetailSensorDHT(mListSensor, getApplication());
            rvSensor.setLayoutManager(new LinearLayoutManager(getApplication()));
            rvSensor.setItemAnimator(new DefaultItemAnimator());
            rvSensor.setAdapter(mSensorAdapter);
            mSensorAdapter.notifyDataSetChanged();
            ArrayList<ArrayList<Object>> data3 = dm.ambilSemuaBaris();//

            for (int posisi1 = 10 ; posisi1 < data3.size() && posisi1 < 21 ; posisi1++) {

                ArrayList<Object> baris = data3.get(posisi1);
                ModelDataSensorDHT data4 = new ModelDataSensorDHT(
//                    baris.get(0).toString(),
                        baris.get(1).toString(),
                        baris.get(2).toString(),
                        baris.get(3).toString(),
                        baris.get(4).toString(),
                        baris.get(5).toString(),
                        baris.get(6).toString(),
                        baris.get(7).toString(),
                        baris.get(8).toString(),
                        baris.get(9).toString()
                );
                mListSensor.add(data4);
            }
            rvSensor.setVisibility(View.VISIBLE);
            mSensorAdapter = new RecyclerAdapterDetailSensorDHT (mListSensor,getApplication ());
            rvSensor.setAdapter(mSensorAdapter);
        }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        final Intent intent;
        switch (i){
            case 0:
                Toast.makeText(menu_2125_ts.this,"Menu Utama",Toast.LENGTH_LONG).show();
                break;
            case 2:
                intent = new Intent(menu_2125_ts.this, menu2_2125_ts.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}