package com.example.jeanramos.appteindascresspo.Services;


import com.example.jeanramos.appteindascresspo.models.Product;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;


public interface ProductoService {

    @GET("producto")
    Call<List<Product>> getProducto();

}
