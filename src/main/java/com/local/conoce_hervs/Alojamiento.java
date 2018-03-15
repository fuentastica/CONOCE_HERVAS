package com.local.conoce_hervs;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class Alojamiento extends Fragment {


    /*@Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonInsert:
                insertInto();
                break;
        }
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alojamiento_layout);

    }*/
    public Alojamiento(){
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.alojamiento_layout, container, false);

        /*editTextName = view.findViewById(R.id.editTextName);
        spinnerPosition = view.findViewById(R.id.spinnerPosition);
        editTextAge = view.findViewById(R.id.editTextAge);

        btnInsert = view.findViewById(R.id.buttonInsert);
        btnInsert.setOnClickListener(this);*/

        // Devolvemos la vista al fragment
        return view;

    }
}
