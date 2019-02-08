package com.example.jeanramos.appteindascresspo.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jeanramos.appteindascresspo.Fragments.productsFragment;
import com.example.jeanramos.appteindascresspo.R;
import com.example.jeanramos.appteindascresspo.models.Product;

import java.util.List;

public class Adaptador extends BaseAdapter {

    private static LayoutInflater inflater = null;

    Context contexto;
    String[][] datos;
    int[]datosImg;


    public Adaptador(Context contexto,String[][] datos,int[] imagenes)
    {
        this.contexto = contexto;
        this.datosImg = imagenes;
        this.datos = datos;
        inflater = (LayoutInflater)contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }

    private TextView tiutlo;
    private TextView precio;
    private TextView color;
    private ImageView imagen;

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        final View vista = inflater.inflate(R.layout.elemento_lista,null);
        tiutlo = (TextView) vista.findViewById(R.id.txtTitulo);
        precio = (TextView) vista.findViewById(R.id.txtprecio);
        color  = (TextView) vista.findViewById(R.id.txtColor);
        imagen = (ImageView) vista.findViewById(R.id.imgProduct);

        tiutlo.setText(datos[i][0]);
        precio.setText(datos[i][2]);
        color.setText("S/." +datos[i][1]);
        imagen.setImageResource(datosImg[i]);

        return vista;
    }

    @Override
    public int getCount() {
        return this.datosImg.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}
