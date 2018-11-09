package com.example.bobrik.universitycook.Vista;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.ImageButton;

import com.example.bobrik.universitycook.R;

public class MainActivity extends AppCompatActivity implements com.example.bobrik.universitycook.Vista.Adapter.Comunicacion {

    private DrawerLayout drawerLayout;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.drawer);
        final About_us about_us = new About_us();
        final Recycler recycler= new Recycler();
        ImageButton hambur = findViewById(R.id.hamburguesa);




        final NavigationView navigationView = findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                drawerLayout.closeDrawers();
                switch (menuItem.getItemId()) {
                    case R.id.item_receta:
                        reemplazarFragment(recycler);

                        return true;
                    case R.id.item_about:
                        reemplazarFragment(about_us);

                        return true;

                    default:
                        return true;
                }
            }
        });
        hambur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                drawerLayout.openDrawer(Gravity.START);

            }
        });
    }





    public void reemplazarFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.commit();


    }

    public void onBackPressed() {


        if (drawerLayout.isDrawerOpen(Gravity.START)) {
            drawerLayout.closeDrawers();


        } else {
            super.onBackPressed();

        }
    }


    @Override
    public void irDetalle(Integer posicion){

        Intent intent = new Intent(MainActivity.this, DetalleActivity.class);

        Bundle bundle = new Bundle();
        bundle.putInt(DetalleReceta.KEY_POSICION, posicion);

        intent.putExtras(bundle);
        startActivity(intent);
    }

}
