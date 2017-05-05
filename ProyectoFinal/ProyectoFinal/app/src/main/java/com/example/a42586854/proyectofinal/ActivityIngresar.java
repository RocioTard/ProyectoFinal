package com.example.a42586854.proyectofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ActivityIngresar extends AppCompatActivity {

    public void Ingresar (View VistaIngresar)
    {
        Intent LlamadaAActivityPrimeraEdicion;
        LlamadaAActivityPrimeraEdicion=new Intent(this, ActivityPrimeraEdicion.class);
        startActivity(LlamadaAActivityPrimeraEdicion);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);
    }
}
