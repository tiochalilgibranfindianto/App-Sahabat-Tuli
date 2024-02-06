package com.example.sahabattuli;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KataNamaHariDanBulan extends AppCompatActivity implements View.OnClickListener{

    private CardView card1, card2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kata_nama_hari_dan_bulan);

        card1 = (CardView) findViewById(R.id.hari);
        card2 = (CardView) findViewById(R.id.bulan);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        int getId = v.getId();

        if (getId == R.id.hari) {
            i = new Intent(this,NamaHari.class);
            startActivity(i);
        } else if (getId == R.id.bulan) {
            i = new Intent(this,NamaBulan.class);
            startActivity(i);
        }
    }
}