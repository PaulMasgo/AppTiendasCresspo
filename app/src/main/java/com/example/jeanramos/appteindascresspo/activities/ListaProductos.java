package com.example.jeanramos.appteindascresspo.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.jeanramos.appteindascresspo.R;
import com.example.jeanramos.appteindascresspo.models.Product;

import java.util.ArrayList;

import static android.R.layout.simple_list_item_1;

public class ListaProductos extends AppCompatActivity {

    ListView ListaProductos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_productos);

//     ListaProductos = (ListView) findViewById(R.id.lstvProductos);
//        ArrayList<String> items =   Product.getProductsAsString();
//
//        ArrayAdapter<String> itemsAdapter =
//                new ArrayAdapter<String>(this, simple_list_item_1, items);
//
//        ListaProductos.setAdapter(itemsAdapter);
    }
}
