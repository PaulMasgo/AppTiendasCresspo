package com.example.jeanramos.appteindascresspo.models;

import java.util.ArrayList;

public class Product {

    private String nombre;
    private String descripcion;
    private Float  precio;
    private String color;
    public Product(){

    }
    public Product( String nombre ,String descripcion){
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
    }
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Float getPrecio() {
        return precio;
    }



    public String getColor() {
        return color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
