package com.example.controlselectorricardo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ControlesSeleccion extends AppCompatActivity {
    Spinner spEquipos;
    ListView listaJugadores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controles_seleccion);

        spEquipos = (Spinner) findViewById(R.id.spEquipos);
        listaJugadores = (ListView) findViewById(R.id.listaJugadores);

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this, R.array.combo_equipos, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adaptadorJugadores = ArrayAdapter.createFromResource(this, R.array.combo_jugadores, android.R.layout.simple_spinner_item);

        spEquipos.setAdapter(adaptador);
        listaJugadores.setAdapter(adaptadorJugadores);

        listaJugadores.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ControlesSeleccion.this, "Seleccionaste: "+parent.getItemAtPosition(position)+ " posicion: " +id, Toast.LENGTH_SHORT).show();
                if(position == 0){
                    Intent intent = new Intent(ControlesSeleccion.this, James.class);
                    startActivity(intent);
                }else if (position == 1){
                    Intent intent = new Intent(ControlesSeleccion.this, AlejandroArarat.class);
                    startActivity(intent);
                }else if (position == 2){
                    Intent intent = new Intent(ControlesSeleccion.this, GuillermoCelis.class);
                    startActivity(intent);
                }else if (position == 3){
                    Intent intent = new Intent(ControlesSeleccion.this, MarcusVinicius.class);
                    startActivity(intent);
                }else if (position == 4){
                    Intent intent = new Intent(ControlesSeleccion.this, Quintero.class);
                    startActivity(intent);
                }else if (position == 5){
                    Intent intent = new Intent(ControlesSeleccion.this, Falcao.class);
                    startActivity(intent);
                }else if (position == 6){
                    Intent intent = new Intent(ControlesSeleccion.this, Ospina.class);
                    startActivity(intent);
                }
            }
        });

        spEquipos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(position != 0){
                    Toast.makeText(ControlesSeleccion.this, "Seleccionaste: "+parent.getItemAtPosition(position)+" posicion: "+position, Toast.LENGTH_SHORT).show();
                }


                if(position == 1){
                    Intent intent = new Intent(ControlesSeleccion.this, America.class);
                    startActivity(intent);
                }else if(position == 2){
                    Intent intent = new Intent(ControlesSeleccion.this, Cali.class);
                    startActivity(intent);
                }else if(position == 3){
                    Intent intent = new Intent(ControlesSeleccion.this, Millonarios.class);
                    startActivity(intent);
                }else if(position == 4){
                    Intent intent = new Intent(ControlesSeleccion.this, Huila.class);
                    startActivity(intent);
                }else if(position == 5){
                    Intent intent = new Intent(ControlesSeleccion.this, Aguilas.class);
                    startActivity(intent);
                }else if(position == 6){
                    Intent intent = new Intent(ControlesSeleccion.this, Medellin.class);
                    startActivity(intent);
                }else if(position == 7){
                    Intent intent = new Intent(ControlesSeleccion.this, Nacional.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}