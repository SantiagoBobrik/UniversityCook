package com.example.bobrik.universitycook.Controlador;

import com.example.bobrik.universitycook.DAO.DAORecetaArchivo;
import com.example.bobrik.universitycook.Modelo.Receta;

import java.util.ArrayList;

public class Controlador {

    public ArrayList<Receta> obtenerRecetas() {

        ArrayList<Receta> recetas = new ArrayList<>();

        DAORecetaArchivo daoRecetaArchivo = new DAORecetaArchivo();
        recetas = daoRecetaArchivo.obtenerRecetasArchivo();

        return recetas;
    }
}
