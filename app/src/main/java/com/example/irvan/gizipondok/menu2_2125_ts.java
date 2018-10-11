package com.example.irvan.gizipondok;

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
import android.widget.TextView;
import android.widget.Toast;

import com.example.irvan.gizipondok.Adapter.RecyclerAdapterDetailSensorDHT;
import com.example.irvan.gizipondok.Modal.ModelDataSensorDHT;

import java.util.ArrayList;
import java.util.List;

public class menu2_2125_ts extends AppCompatActivity implements OnItemSelectedListener {
    ListView listview;
    //static DB_menu1_2125_ts dm;
    static DB_menu2_2125_ts dm2;

    LinearLayout layout_loading;
    TextView text_load;
    ImageView icon_load;

    Spinner spinner;
    private RecyclerView rvSensor;
    private List<ModelDataSensorDHT> mListSensor;
    private RecyclerAdapterDetailSensorDHT mSensorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2_2125_ts);
<<<<<<< Updated upstream
//        Spinner spinner = (Spinner) findViewById(R.id.spinner);
//
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(menu2_2125_ts.this, R.array.pilih_menu, R.layout.support_simple_spinner_dropdown_item);
//        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//
//            @Override
//            public void onItemSelected(AdapterView<?> arg0, View view, int position, long row_id) {
//                String pilihan = arg0.getItemAtPosition(position).toString();
//                switch(position){
//                    case 1:
//                        Intent a = new Intent(menu2_2125_ts.this, menu_2125_ts.class);
//                        menu2_2125_ts.this.startActivity(a);
//                        break;
//                    case 2:
//                        Intent b = new Intent(menu2_2125_ts.this, menu2_2125_ts.class);
//                        menu2_2125_ts.this.startActivity(b);
//                        break;
//                }
//
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> arg0) {
//                // TODO Auto-generated method stub
//
//            }
//
//        });
//
//        setup();
//        String nilai_menu = spinner.getSelectedItem().toString();
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(menu2_2125_ts.this, R.array.pilih_menu, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View view, int position, long row_id) {
                String pilihan = arg0.getItemAtPosition(position).toString();
                switch(position){
                    case 1:
                        Intent a = new Intent(menu2_2125_ts.this, menu1_2125_ts.class);
                        menu2_2125_ts.this.startActivity(a);
                        break;
                    case 2:
                        Intent b = new Intent(menu2_2125_ts.this, menu2_2125_ts.class);
                        menu2_2125_ts.this.startActivity(b);
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }

        });

        setup();
=======

        spinner = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.pilih_menu, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

>>>>>>> Stashed changes
    }



    public void setup() {
        dm2 = new DB_menu2_2125_ts(this);
        //listview = (ListView) rootView.findViewById(R.id.listSensor);
        rvSensor = (RecyclerView) findViewById(R.id.RecyclerView_Sensor_dht1);
        mListSensor = new ArrayList<>();
        //passing to adapter
        mSensorAdapter = new RecyclerAdapterDetailSensorDHT(mListSensor, getApplication());
        rvSensor.setLayoutManager(new LinearLayoutManager(getApplication()));
        rvSensor.setItemAnimator(new DefaultItemAnimator());
        rvSensor.setAdapter(mSensorAdapter);
        mSensorAdapter.notifyDataSetChanged();
        ArrayList<ArrayList<Object>> data = dm2.ambilSemuaBaris();//

        for (int posisi = 0; posisi < data.size(); posisi++) {

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

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        final Intent intent;
        switch (i){
            case 0:
                intent = new Intent(menu2_2125_ts.this, menu_2125_ts.class);
                startActivity(intent);
                break;
            case 1:
                Toast.makeText(menu2_2125_ts.this,"Menu Utama",Toast.LENGTH_LONG).show();
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
