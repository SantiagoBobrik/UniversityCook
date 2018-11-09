package com.example.bobrik.universitycook.Vista;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bobrik.universitycook.Controlador.Controlador;
import com.example.bobrik.universitycook.R;
import com.example.bobrik.universitycook.Modelo.Receta;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Recycler extends Fragment implements Adapter.Comunicacion {

    List<Receta> list;
    RecyclerView recyclerView;

    public Recycler() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment++

        View view = inflater.inflate(R.layout.fragment_recycler, container, false);
        list = new ArrayList<>();
        recyclerView = view.findViewById(R.id.recyclerid);


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this.getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        Controlador controlador = new Controlador();

        list = controlador.obtenerRecetas();

        Adapter adapter = new Adapter(getActivity(),this, list);
        recyclerView.setAdapter(adapter);
        return view;

    }

    @Override
    public void irDetalle(Integer posicion) {
        Context context = getContext();
        Adapter.Comunicacion listener = (Adapter.Comunicacion) context;

        listener.irDetalle(posicion);
    }
}
