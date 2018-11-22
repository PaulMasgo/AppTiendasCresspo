package com.example.jeanramos.appteindascresspo.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.jeanramos.appteindascresspo.R;
import com.example.jeanramos.appteindascresspo.generals.Settings;

public class Menu extends AppCompatActivity {

    private Button btnProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnProductos = (Button) findViewById(R.id.btnProductos);
        btnProductos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i(Settings.INFO, "Products");
                Intent i = new Intent(Menu.this,ListaProductos.class);
                startActivity(i);
            }
        });
    }
}
