package com.example.sahabattuli;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KataKosaIsyarat extends AppCompatActivity implements View.OnClickListener{

    private CardView card1, card2, card3, card4, card5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kata_kosa_isyarat);

        card1 = (CardView) findViewById(R.id.keluarga);
        card2 = (CardView) findViewById(R.id.buah);
        card3 = (CardView) findViewById(R.id.mood);
        card4 = (CardView) findViewById(R.id.makan);
        card5 = (CardView) findViewById(R.id.minum);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        int getId = v.getId();

        if (getId == R.id.keluarga) {
            i = new Intent(this,Keluarga.class);
            startActivity(i);
        } else if (getId == R.id.buah) {
            i = new Intent(this,BuahBuahan.class);
            startActivity(i);
        } else if (getId == R.id.mood) {
            i = new Intent(this,Mood.class);
            startActivity(i);
        } else if (getId == R.id.makan) {
            i = new Intent(this,Makanan.class);
            startActivity(i);
        } else if (getId == R.id.minum) {
            i = new Intent(this,Minuman.class);
            startActivity(i);
        }
    }
}