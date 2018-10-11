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
import android.widget.AdapterView.OnItemSelectedListener;
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

public class menu_2125_ts extends AppCompatActivity {
    private Toolbar toolbar;
    ListView listview;
    static DB_menu1_2125_ts dm;
    static DB_menu2_2125_ts dm2;

    LinearLayout layout_loading;
    TextView text_load;
    ImageView icon_load;
    String ID_USER;
    //SharedPreferences sharedpreferences;
    View rootView;

    private Spinner spinner;
//    String[] SPINNERVALUES = {"Menu 1","Menu 2","Menu 3"};
//    String SpinnerValue;
//    Intent intent;
Intent intent;
    private RecyclerView rvSensor;
    private List<ModelDataSensorDHT> mListSensor;
    private RecyclerAdapterDetailSensorDHT mSensorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_2125_ts);
//        Spinner spinner = (Spinner) findViewById(R.id.spinner);
//        String nilai_menu = spinner.getSelectedItem().toString();
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(menu_2125_ts.this, R.array.pilih_menu, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View view, int position, long row_id) {
                String pilihan = arg0.getItemAtPosition(position).toString();
                switch(position){
                    case 1:
                        Intent a = new Intent(menu_2125_ts.this, menu_2125_ts.class);
                        startActivity(a);
                        Toast.makeText(menu_2125_ts.this, "menu1",Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        Intent b = new Intent(menu_2125_ts.this, menu2_2125_ts.class);
                        startActivity(b);
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }

        });
        setup();
    }



    public void setup() {
        dm = new DB_menu1_2125_ts(this);
        //listview = (ListView) rootView.findViewById(R.id.listSensor);
        rvSensor = (RecyclerView) findViewById(R.id.RecyclerView_Sensor_dht);
        mListSensor = new ArrayList<>();
        //passing to adapter
        mSensorAdapter = new RecyclerAdapterDetailSensorDHT(mListSensor, getApplication());
        rvSensor.setLayoutManager(new LinearLayoutManager(getApplication()));
        rvSensor.setItemAnimator(new DefaultItemAnimator());
        rvSensor.setAdapter(mSensorAdapter);
        mSensorAdapter.notifyDataSetChanged();
        ArrayList<ArrayList<Object>> data = dm.ambilSemuaBaris();//

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

}