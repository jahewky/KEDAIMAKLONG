package com.example.aplikasimenumakanan;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailMakanan extends AppCompatActivity {

    private ImageView imgMakanan;
    private TextView detailMakanan, descMakanan, infoHarga, detailHarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getDetailActivity();
    }

    private void getDetailActivity()
    {
        imgMakanan = (ImageView) findViewById(R.id.imgDetail);
        detailMakanan = (TextView) findViewById(R.id.txtDetailNama);
        descMakanan = (TextView) findViewById(R.id.txtDesc);
        infoHarga = (TextView) findViewById(R.id.txtDetailHarga);

        int imageMakanan = getIntent().getIntExtra("ImageMakanan", 0);
        String namaMakanan = getIntent().getStringExtra("NamaMakanan");
        String ketMakanan = getIntent().getStringExtra("DeskripsiMakanan");
        String spillHarga = getIntent().getStringExtra("HargaMakanan");

        imgMakanan.setImageResource(imageMakanan);
        detailMakanan.setText(namaMakanan);
        descMakanan.setText(ketMakanan);
        infoHarga.setText(spillHarga);
    }
}