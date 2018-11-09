package com.example.bobrik.universitycook.Vista;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.bobrik.universitycook.R;

import java.util.ArrayList;

public class DetalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        bundle.getInt(DetalleReceta.KEY_POSICION);


        final DetalleReceta detalleReceta = new DetalleReceta();
        detalleReceta.setArguments(bundle);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.containerId, detalleReceta);
        fragmentTransaction.commit();

    }
}
