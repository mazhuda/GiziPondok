package com.example.irvan.gizipondok;

/**
 * Created by hellraizer on 06/10/2018.
 */
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

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

    private RecyclerView rvSensor;
    private List<ModelDataSensorDHT> mListSensor;
    private RecyclerAdapterDetailSensorDHT mSensorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_2125_ts);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String nilai_menu = spinner.getSelectedItem().toString();

//        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
//            // An item was selected. You can retrieve the selected item using
//            // parent.getItemAtPosition(pos)
//
//            TextView tv = (TextView)view;
//            String selection = tv.getText().toString();   // or you can use the position but I do this to do other things with the TextView
//        }
//
//        public void onNothingSelected(AdapterView<?> parent) {
//            // Another interface callback
//        }

        if (nilai_menu.equals("Menu_1")) {
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
        else if (nilai_menu.equals("Menu_2")) {
//        else {
            dm2 = new DB_menu2_2125_ts(this);
            //listview = (ListView) rootView.findViewById(R.id.listSensor);
            rvSensor = (RecyclerView) findViewById(R.id.RecyclerView_Sensor_dht);
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
//        else {
//
//        }

    }

    public void setup() {

    }

}