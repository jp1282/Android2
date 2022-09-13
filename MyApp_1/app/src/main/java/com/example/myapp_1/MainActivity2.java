package com.example.myapp_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;


public class MainActivity2 extends AppCompatActivity {
    String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

    ArrayList<String> listDatos;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       Spinner Meses = (Spinner) findViewById(R.id.spinnermeses);
       ArrayAdapter aa= new ArrayAdapter(this, android.R.layout.simple_spinner_item,meses);
       aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       Meses.setAdapter(aa);

       recycler=findViewById(R.id.Recycler1);
       recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
       listDatos=new ArrayList<String>();

       for (int i=0; i<20;i++){
           listDatos.add("Dato Nro"+i+" ");
       }

       AdapterDato adapter=new AdapterDato(listDatos);
       recycler.setAdapter(adapter);
    }
}