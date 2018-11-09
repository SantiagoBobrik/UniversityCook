package com.example.bobrik.universitycook.Vista;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bobrik.universitycook.Controlador.Controlador;
import com.example.bobrik.universitycook.Modelo.Receta;
import com.example.bobrik.universitycook.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetalleReceta extends Fragment
{

    public static final String KEY_POSICION = "posicion";

    public DetalleReceta() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_detalle_receta, container, false);

        TextView textTitulo = view.findViewById(R.id.textTitulo);
        TextView ingredientes = view.findViewById(R.id.ingredientes);
        TextView procedimiento = view.findViewById(R.id.procedimiento);
        ImageView imageComida = view.findViewById(R.id.imageComida);

        Bundle bundle = getArguments();

        Integer posicion = bundle.getInt(KEY_POSICION);

        ArrayList<Receta> list = new ArrayList<>();
        Controlador controlador = new Controlador();
        list = controlador.obtenerRecetas();

        textTitulo.setText(list.get(posicion).getTitulo());
        ingredientes.setText(list.get(posicion).getIngredientes());
        procedimiento.setText(list.get(posicion).getPreparacion());
        imageComida.setImageResource(list.get(posicion).getImagen());

        return view;
    }

}
