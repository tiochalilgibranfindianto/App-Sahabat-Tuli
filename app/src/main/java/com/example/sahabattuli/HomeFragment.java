package com.example.sahabattuli;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private CardView card1, card2, card3, card4, card5, card6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        card1 = (CardView) view.findViewById(R.id.c1);
        card2 = (CardView) view.findViewById(R.id.c2);
        card3 = (CardView) view.findViewById(R.id.c3);
        card4 = (CardView) view.findViewById(R.id.c4);
        card5 = (CardView) view.findViewById(R.id.c5);
        card6 = (CardView) view.findViewById(R.id.c6);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);

        return view;
    }

    private void setContentView(int fragmentHome) {
    }

    @Override
    public void onClick(View v) {
        Intent i;
        int getId = v.getId();

        if (getId == R.id.c1) {
            i = new Intent(getActivity(),ABC.class);
            startActivity(i);
        } else if (getId == R.id.c2) {
            i = new Intent(getActivity(),Angka.class);
            startActivity(i);
        } else if (getId == R.id.c3) {
            i = new Intent(getActivity(),KataSapaan.class);
            startActivity(i);
        } else if (getId == R.id.c4) {
            i = new Intent(getActivity(),KataTanya.class);
            startActivity(i);
        } else if (getId == R.id.c5) {
            i = new Intent(getActivity(),KataKosaIsyarat.class);
            startActivity(i);
        } else if (getId == R.id.c6) {
            i = new Intent(getActivity(),KataNamaHariDanBulan.class);
            startActivity(i);
        }
    }
}
