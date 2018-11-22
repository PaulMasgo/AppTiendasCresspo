package com.example.jeanramos.appteindascresspo.models;

import java.util.ArrayList;

public class Product {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ArrayList<String> getProductsAsString() {
        ArrayList<String> o = new ArrayList<>();
        o.add("Chompa Aerials");
        o.add("Chompa");
        o.add("Granolas con Miel");
        o.add("Granolas de Trigo");
        return o;
    }

}
