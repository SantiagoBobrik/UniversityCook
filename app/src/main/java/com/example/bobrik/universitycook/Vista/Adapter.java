package com.example.bobrik.universitycook.Vista;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bobrik.universitycook.R;
import com.example.bobrik.universitycook.Modelo.Receta;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.RecetaViewHolder> {

    private List<Receta> datos;
    private Comunicacion comunicacion;
    private Context context;

    public Adapter(Context context, Comunicacion comunicacion, List<Receta> datos) {
        this.context = context;
        this.comunicacion = comunicacion;
        this.datos = datos;
    }

    @NonNull
    @Override
    public RecetaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_receta,viewGroup,false);

        RecetaViewHolder viewHolder = new RecetaViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecetaViewHolder recetaViewHolder , int i) {

        Receta receta = datos.get(i);
        recetaViewHolder.cargarDatos(receta);

    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public  interface Comunicacion{
        void irDetalle(Integer posicion);
    }

    public class RecetaViewHolder extends  RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView textView;

        public RecetaViewHolder(@NonNull final View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.fotocomida);
            textView = itemView.findViewById(R.id.nombrecomida);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    comunicacion.irDetalle(getAdapterPosition());

                }
            });

        }

        public void cargarDatos(Receta receta){
            imageView.setImageResource(receta.getImagen());
            textView.setText(receta.getTitulo());

        }


    }
}
