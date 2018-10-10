package com.example.irvan.gizipondok.API;



import com.example.irvan.gizipondok.Modal.ModelDataSensorDHT;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by JhonDev on 05/10/2016.
 */

public interface ApiService {

//    @FormUrlEncoded
//    @POST("tambah_data.php")
//    Call<ResponseBody> tambahData(@Field("nama") String nama, @Field("jenis") String jenis, @Field("keterangan") String keterangan);
//
//    @FormUrlEncoded
//    @POST("edit_data.php")
//    Call<ResponseBody> editData(@Field("id_barang") String id, @Field("nama_barang") String nama, @Field("jenis_barang") String jenis, @Field("keterangan_barang") String keterangan);
//
//
//    @FormUrlEncoded
//    @POST("hapus_data.php")
//    Call<ResponseBody> hapusData(@Field("id_barang") String id_barang);

 //   @GET("lihat_data_sensor.php")
 //   Call<List<ModelData>> getSemuaSensor(@Query("id_user") String id_user);
     @GET("lihat_data_sensor.php")
     Call<List<ModelDataSensorDHT>> getSemuaSensor(@Query("id_user") String id_user);

    @GET("lihat_sensor.php")
    Call<List<ModelDataSensorDHT>> getSensor(@Query("id_user") String id_user, @Query("nama_jenis_sensor") String nama_jenis_sensor);

    @GET("lihat_data_sensor_dht.php")
    Call<List<ModelDataSensorDHT>> getDetailSensorDHT(@Query("id_sensor") String id_sensor);

    @GET("lihat_data_sensor_flame.php")
    Call<List<ModelDataSensorDHT>> getDetailSensorFlame(@Query("id_sensor") String id_sensor);

    @GET("lihat_data_sensor_pir.php")
    Call<List<ModelDataSensorDHT>> getDetailSensorPIR(@Query("id_sensor") String id_sensor);

    @GET("lihat_data_sensor_dht_notifikasi.php")
    Call<List<ModelDataSensorDHT>> getDetailSensorDHTNotifikasi(@Query("id_sensor") String id_sensor);

    @GET("lihat_data_sensor_flame_notifikasi.php")
    Call<List<ModelDataSensorDHT>> getDetailSensorFlameNotifikasi(@Query("id_sensor") String id_sensor);

    @GET("lihat_data_sensor_pir_notifikasi.php")
    Call<List<ModelDataSensorDHT>> getDetailSensorPIRNotifikasi(@Query("id_sensor") String id_sensor);


//    @GET("single_data.php")
//    Call<List<ModelData>> getSingleData(@Query("id_barang") String id);

}
