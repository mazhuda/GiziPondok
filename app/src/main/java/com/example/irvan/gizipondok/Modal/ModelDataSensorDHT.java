package com.example.irvan.gizipondok.Modal;

/**
 * Created by IQBAL on 03/12/2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelDataSensorDHT {

//    @SerializedName("id")
//    @Expose
//    private String id;

    @SerializedName("waktu")
    @Expose
    private String waktu;

    @SerializedName("menu")
    @Expose
    private String menu;

    @SerializedName("bahan")
    @Expose
    private String bahan;

    @SerializedName("urt")
    @Expose
    private String urt;

    @SerializedName("berat")
    @Expose
    private String berat;

    @SerializedName("enargi")
    @Expose
    private String energi;

    @SerializedName("protein")
    @Expose
    private String protein;

    @SerializedName("lemak")
    @Expose
    private String lemak;

    @SerializedName("karbohidrat")
    @Expose
    private String karbohidrat;

//    public static final String id_user = "ID_USER";
//    public static final String nama_mahasiswa = "ID_MAHASISWA";
//    public static final String jenis_mahasiswa = "ID_MAHASISWA";

    public ModelDataSensorDHT(String waktu, String menu, String bahan, String urt, String berat, String energi, String protein, String lemak, String karbohidrat) {
//        this.id = id;
        this.waktu = waktu;
        this.menu = menu;
        this.bahan = bahan;
        this.urt = urt;
        this.berat = berat;
        this.energi = energi;
        this.protein = protein;
        this.lemak = lemak;
        this.karbohidrat = karbohidrat;
    }

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getUrt() {
        return urt;
    }

    public void setUrt(String urt) {
        this.urt = urt;
    }

    public String getBerat() {
        return berat;
    }

    public void setBerat(String berat) {
        this.berat = berat;
    }

    public String getEnergi() {
        return energi;
    }

    public void setEnergi(String energi) {
        this.energi = energi;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getLemak() {
        return lemak;
    }

    public void setLemak(String lemak) {
        this.lemak = lemak;
    }

    public String getKarbohidrat() {
        return karbohidrat;
    }

    public void setKarbohidrat(String karbohidrat) {
        this.karbohidrat = karbohidrat;
    }
}

