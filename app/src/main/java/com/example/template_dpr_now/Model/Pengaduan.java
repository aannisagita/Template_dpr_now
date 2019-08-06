package com.example.template_dpr_now.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Pengaduan {
    @SerializedName("id")
    private String id_pengaduan;
    @SerializedName("nama")
    @Expose
    private String nama;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("no_telepon")
    @Expose
    private String no_telepon;
    @SerializedName("isi_aduan")
    @Expose
    private String isi_aduan;
    @SerializedName("createdAt")
    @Expose
    private String tanggal;

    //dari Model GetPengaduan
    @SerializedName("status")
    String status;
    @SerializedName("result")
    List<Pengaduan> listDataPengaduan;
    @SerializedName("message")
    String message;
    public String getId_pengaduan() {
        return id_pengaduan;
    }

    public void setId_pengaduan(String id_pengaduan) {
        this.id_pengaduan = id_pengaduan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNo_telepon() {
        return no_telepon;
    }

    public void setNo_telepon(String no_telepon) {
        this.no_telepon = no_telepon;
    }

    public String getIsi_aduan() {
        return isi_aduan;
    }

    public void setIsi_aduan(String aduan) {
        this.isi_aduan = aduan;
    }
    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tgl) {
        this.tanggal = tgl;
    }
//    public String ambilTanggal() throws ParseException {
//        DateFormat outputFormat = new SimpleDateFormat("MM/yyyy");
//        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX");
//
//        //String inputText = "2012-11-17T00:00:00.000-05:00";
//        Date date = inputFormat.parse(tanggal);
//        String outputText = outputFormat.format(date);
//        return  outputText;
//
//
//    }
    //dari Model Get Pengaduan
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public List<Pengaduan> getListDataPengaduan() {
        return listDataPengaduan;
    }
    public void setListDataPengaduan(List<Pengaduan> listDataPengaduan) {
        this.listDataPengaduan = listDataPengaduan;
    }

    public Pengaduan(){}

    public Pengaduan(String id, String nama, String email, String nomor, String isi) {
        super();
        this.id_pengaduan = id;
        this.nama = nama;
        this.email = email;
        this.no_telepon = nomor;
        this.isi_aduan = isi;
    }



}
