package com.example.aplikasimenumakanan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recMakanan;
    private ArrayList<Makanan> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMakanan =findViewById(R.id.rec_makanan);
        initData();

        recMakanan.setAdapter(new MakananAdapter(listMakanan));
        recMakanan.setLayoutManager(new LinearLayoutManager(this));

    }

    public void initData()
    {
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Makanan
                (
                        "Baso Ikan",
                        "Rp25.000,00",
                        "Bakso Ikan Tenggiri asli Puau Singkep",
                        R.drawable.basoikan
                )
        );

        listMakanan.add(new Makanan
                (
                        "Nasi Lemak",
                        "Rp15.000,00",
                        "Nasi Lemak Khas Kepulauan Riau",
                        R.drawable.nasilemak
                )
        );

        listMakanan.add(new Makanan
                (
                        "Lakse",
                        "Rp15.000,00",
                        "Lakse makanan khas Kepulauan Riau ",
                        R.drawable.lakse
                )
        );

        listMakanan.add(new Makanan
                (
                        "Gulai Ikan Pedas",
                        "Rp35.000,00",
                        "Gulai Ikan menggunakan Santan dengan kuah pedas",
                        R.drawable.gulaiikan
                )
        );

        listMakanan.add(new Makanan
                (
                        "Roti Jala Kuah Kari",
                        "Rp25.000,00",
                        "Roti Jala dengan siraman kuah Gulai yang lembut ",
                        R.drawable.rotijala
                )
        );

        listMakanan.add(new Makanan
                (
                        "Tepung Gomak",
                        "Rp2.000,00",
                        "Kue Tepung Gomak Khas Melayu yang lembut dan lezat ",
                        R.drawable.tepunggomak
                )
        );

        listMakanan.add(new Makanan
                (
                        "Bubur Lambuk",
                        "Rp25.000,00",
                        "Hidangan makanan khas pulau Lingga ini yaitu Bubur ditambah sayuran yang lezat dan pedas",
                        R.drawable.lambuk
                )
        );
    }
}
