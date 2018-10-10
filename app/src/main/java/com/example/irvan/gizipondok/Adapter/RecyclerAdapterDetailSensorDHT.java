package com.example.irvan.gizipondok.Adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.irvan.gizipondok.Modal.ModelDataSensorDHT;
import com.example.irvan.gizipondok.R;

import java.util.List;

/**
 * Created by putuguna on 22/11/16.
 */

public class RecyclerAdapterDetailSensorDHT extends RecyclerView.Adapter<RecyclerAdapterDetailSensorDHT.ViewHolder>{

    private List<ModelDataSensorDHT> mListSensor;
    private Context mContexl;

    public RecyclerAdapterDetailSensorDHT(List<ModelDataSensorDHT> mListSensor, Context mContexl) {
        this.mListSensor = mListSensor;
        this.mContexl = mContexl;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_sensor_dht,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //get the user by its position
        ModelDataSensorDHT user = mListSensor.get(position);

        //holder.tvSensorName.setText("Sensor Name : " + user.getName() +"\n" +
        //"Sensor Age : " + user.getAge());
//        holder.Id.setText(user.getId ());
        holder.Waktu.setText(user.getWaktu ());
        holder.Menu.setText(user.getMenu ());
        holder.Bahan.setText(user.getBahan ());
        holder.Urt.setText(user.getUrt ());
        holder.Berat.setText(user.getBerat ());
        holder.Energi.setText(user.getEnergi ());
        holder.Protein.setText(user.getProtein ());
        holder.Lemak.setText(user.getLemak ());
        holder.Karbohidrat.setText(user.getKarbohidrat ());
    }

    @Override
    public int getItemCount() {
        return mListSensor.size();
    }

    //@Override
    public void clear() {
        mListSensor.clear ();
    }

    /**
     * inner class
     * here we define all of attribute item in our layout
     */
    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvSensorName;
//        TextView Id;
        TextView Waktu;
        TextView Menu;
        TextView Bahan;
        TextView Urt;
        TextView Berat;
        TextView Energi;
        TextView Protein;
        TextView Lemak;
        TextView Karbohidrat;

        public ViewHolder(View itemView) {
            super(itemView);
            //tvSensorName = (TextView) itemView.findViewById(R.id.text_view_user_name);
//            Id = itemView.findViewById(R.id.Id);
            Waktu = itemView.findViewById(R.id.Waktu);
            Menu = itemView.findViewById(R.id.Menu);
            Bahan = itemView.findViewById (R.id.Bahan);
            Urt = itemView.findViewById(R.id.Urt);
            Berat = itemView.findViewById(R.id.Berat);
            Energi = itemView.findViewById(R.id.Energi);
            Protein = itemView.findViewById (R.id.Protein);
            Lemak = itemView.findViewById(R.id.Lemak);
            Karbohidrat = itemView.findViewById(R.id.Karbohidrat);
        }
    }
}