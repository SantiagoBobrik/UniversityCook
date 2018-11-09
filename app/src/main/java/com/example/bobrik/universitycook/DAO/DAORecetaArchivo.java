package com.example.bobrik.universitycook.DAO;

import com.example.bobrik.universitycook.Modelo.Receta;
import com.example.bobrik.universitycook.R;

import java.util.ArrayList;

public class DAORecetaArchivo {

    private ArrayList<Receta> list = new ArrayList<>();

    public ArrayList<Receta> obtenerRecetasArchivo() {

        list.add(new Receta("Choclo Torta", R.drawable.choclotorta, "Manteca 100 grs\n" +
                "Huevo 4\n" +
                "Choclo en grano 1 lata\n" +
                "Choclo natural 3\n" +
                "Sal\n" +
                "Pimienta\n" +
                "Crema de leche 100 cc\n" +
                "Queso rallado 100 grs\n" +
                "Queso fresco 200 grs\n" +
                "Harina leudante 300 grs", "Para la masa, en un bol, batir la manteca pomada con los huevos y el choclo en lata más los choclos naturales procesados en crudo, a crema de leche, el queso rallado y queso fresco en cubitos y la harina. Condimentar.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Para la cocción, volcar la mezcla en molde desmontable de 26 cm, enmantecado y enharinado y cocer al horno moderado por 35 minutos."));

        list.add(new Receta("SandWich de Atun", R.drawable.sandwich_atun, "Pan ciabatta 4\n" +
                "Atún 2 latas\n" +
                "Palta 1\n" +
                "Cebolla morada 1\n" +
                "Mayonesa 4 cdas\n" +
                "Ralladura de limón 1\n" +
                "Cilantro\n" +
                "Tomate cherry 1 puñado\n" +
                "Alcaparra 1 cdta\n" +
                "Huevo 2\n" +
                "Sal\n" +
                "Pimienta", "Para el sándwich, pelar la palta, cortarla en cubitos. Picar la cebolla y obtener la ralladura de limón y los huevos duros picados.\n" +
                "\n" +
                "En un bol colocar la mayonesa, atún, palta, cebolla, ralladura de limón, alcaparras, cherrys en mitades, cilantro picado y salpimentar.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Cortar la ciabatta a la mitad y rellenar con cantidad a gusto."));


        list.add(new Receta("Tortilla de Papas", R.drawable.tortilla_papas, "Aceite neutro\n" +
                "Pimienta\n" +
                "Sal\n" +
                "Curry\n" +
                "Papa 8\n" +
                "Huevo 25\n" +
                "Cebolla 4\n" +
                "Chorizo colorado 1", "Para la tortilla, pelar las papas y cortar en cubos. Freír en aceite caliente y reservar.\n" +
                "\n" +
                "Saltear la cebolla fileteada en aceite y pasar a un bol, dejar enfriar.\n" +
                "\n" +
                "Batir los huevos con sal y pimienta. Mezclar con la cebolla, las papas y el chorizo colorado en cubitos.\n" +
                "\n" +
                "Volcar sobre sartén con aceite bien caliente, cocer hasta dorar y dar vuelta. Terminar la cocción."));

        list.add(new Receta("Choclo Torta", R.drawable.choclotorta, "Manteca 100 grs\n" +
                "Huevo 4\n" +
                "Choclo en grano 1 lata\n" +
                "Choclo natural 3\n" +
                "Sal\n" +
                "Pimienta\n" +
                "Crema de leche 100 cc\n" +
                "Queso rallado 100 grs\n" +
                "Queso fresco 200 grs\n" +
                "Harina leudante 300 grs", "Para la masa, en un bol, batir la manteca pomada con los huevos y el choclo en lata más los choclos naturales procesados en crudo, a crema de leche, el queso rallado y queso fresco en cubitos y la harina. Condimentar.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Para la cocción, volcar la mezcla en molde desmontable de 26 cm, enmantecado y enharinado y cocer al horno moderado por 35 minutos."));
        list.add(new Receta("SandWich de Atun", R.drawable.sandwich_atun, "Pan ciabatta 4\n" +
                "Atún 2 latas\n" +
                "Palta 1\n" +
                "Cebolla morada 1\n" +
                "Mayonesa 4 cdas\n" +
                "Ralladura de limón 1\n" +
                "Cilantro\n" +
                "Tomate cherry 1 puñado\n" +
                "Alcaparra 1 cdta\n" +
                "Huevo 2\n" +
                "Sal\n" +
                "Pimienta", "Para el sándwich, pelar la palta, cortarla en cubitos. Picar la cebolla y obtener la ralladura de limón y los huevos duros picados.\n" +
                "\n" +
                "En un bol colocar la mayonesa, atún, palta, cebolla, ralladura de limón, alcaparras, cherrys en mitades, cilantro picado y salpimentar.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Cortar la ciabatta a la mitad y rellenar con cantidad a gusto."));
        list.add(new Receta("Choclo Torta", R.drawable.choclotorta, "Manteca 100 grs\n" +
                "Huevo 4\n" +
                "Choclo en grano 1 lata\n" +
                "Choclo natural 3\n" +
                "Sal\n" +
                "Pimienta\n" +
                "Crema de leche 100 cc\n" +
                "Queso rallado 100 grs\n" +
                "Queso fresco 200 grs\n" +
                "Harina leudante 300 grs", "Para la masa, en un bol, batir la manteca pomada con los huevos y el choclo en lata más los choclos naturales procesados en crudo, a crema de leche, el queso rallado y queso fresco en cubitos y la harina. Condimentar.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Para la cocción, volcar la mezcla en molde desmontable de 26 cm, enmantecado y enharinado y cocer al horno moderado por 35 minutos."));


        return list;
    }
}
