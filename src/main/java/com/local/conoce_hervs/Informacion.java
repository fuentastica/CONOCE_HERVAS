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

public class Informacion extends Fragment {

    //Creamos el constructor de la clase (se utiliza en el switch del main)
    public Informacion() {

    }


    //Creamos fragment de dicha clase para poder nombrarlo en el main
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.info_layout, container, false);

        // Devolvemos la vista al fragment
        return view;

    }
}
