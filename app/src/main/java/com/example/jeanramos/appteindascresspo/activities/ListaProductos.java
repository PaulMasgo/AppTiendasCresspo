package com.example.jeanramos.appteindascresspo.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.jeanramos.appteindascresspo.R;
import com.example.jeanramos.appteindascresspo.Services.ProductoService;
import com.example.jeanramos.appteindascresspo.models.Product;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.R.layout.simple_list_item_1;

public class ListaProductos extends AppCompatActivity {

    ListView lista;

    String[][] datos = {
            {"Pantalon Loke","20.5","Rojo"},{"Camisa","54.52","Azul"},
            {"Pantalon Loke","20.5","Rojo"},{"Camisa","54.52","Azul"},
            {"Pantalon Loke","20.5","Rojo"},{"Camisa","54.52","Azul"},
            {"Pantalon Loke","20.5","Rojo"},{"Camisa","54.52","Azul"},
            {"Pantalon Loke","20.5","Rojo"},{"Camisa","54.52","Azul"},
            {"Pantalon Loke","20.5","Rojo"},{"Camisa","54.52","Azul"},
            {"Pantalon Loke","20.5","Rojo"},{"Camisa","54.52","Azul"},
            {"Pantalon Loke","20.5","Rojo"},{"Camisa","54.52","Azul"},
            {"Pantalon Loke","20.5","Rojo"},{"Camisa","54.52","Azul"}
    };

    int[] datosImg = {R.drawable.casacamurray,R.drawable.pantalon,R.drawable.pantalomabesor,R.drawable.pantalaonrasagado};

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_productos);

        lista = (ListView) findViewById(R.id.lstvProductos);
       lista.setAdapter(new Adaptador(this,datos,datosImg));

    }
}
