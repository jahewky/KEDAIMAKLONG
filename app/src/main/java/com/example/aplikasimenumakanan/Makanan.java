package com.example.aplikasimenumakanan;

import java.io.Serializable;

public class Makanan implements Serializable {
    private String makanan, harga, deskripsi;
    private int id_gambar;

    public Makanan(String makanan, String harga, String deskripsi, int id_gambar) {
        this.makanan = makanan;
        this.harga = harga;
        this.deskripsi = deskripsi;
        this.id_gambar = id_gambar;
    }

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getId_gambar() {
        return id_gambar;
    }

    public void setId_gambar(int id_gambar) {
        this.id_gambar = id_gambar;
    }
}
