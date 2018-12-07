package com.example.jeanramos.appteindascresspo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.jeanramos.appteindascresspo.activities.Menu;
import com.example.jeanramos.appteindascresspo.activities.RegisterActivity;
import com.example.jeanramos.appteindascresspo.generals.Settings;




public class MainActivity extends AppCompatActivity {

    private Button btnIngresar;
    private EditText Usuario;
    private EditText Contrasenia;
    private Button  btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIngresar = (Button) findViewById(R.id.btnIngresar);
        Usuario = (EditText) findViewById(R.id.txtUsuario);
        Contrasenia = (EditText) findViewById(R.id.txtContraseña);
        btnRegistrar=(Button)findViewById(R.id.btnRegistrar);


        btnRegistrar.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Log.i(Settings.INFO, "Registrar");
                Intent i = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(i);

            }
        });
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i(Settings.INFO, "Products");
                Intent i = new Intent(MainActivity.this, Menu.class);
                if (Usuario.getText().toString().equals("grupocresspo") && Contrasenia.getText().toString().equals("cresspo") )
                {
                    startActivity(i);
                }

            }
        });




    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Settings.DEBUG, "La aplicacion entró en start");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d(Settings.DEBUG, "La aplicacion entró en resume");
        // put your code here...

    }
    @Override
    protected void onStop() {
        // call the superclass method first
        super.onStop();
        Log.d(Settings.DEBUG, "La aplicacion entró en stop");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.v(Settings.DEBUG, "La aplicacion entró en pause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Settings.DEBUG, "La aplicacion entró en destroy");
    }
}
