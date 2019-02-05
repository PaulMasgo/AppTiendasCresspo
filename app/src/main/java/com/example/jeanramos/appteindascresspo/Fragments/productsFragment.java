package com.example.jeanramos.appteindascresspo.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.jeanramos.appteindascresspo.R;
import com.example.jeanramos.appteindascresspo.Services.ProductoService;
import com.example.jeanramos.appteindascresspo.activities.Adaptador;
import com.example.jeanramos.appteindascresspo.models.Product;
import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link productsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link productsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class productsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public productsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment productsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static productsFragment newInstance(String param1, String param2) {
        productsFragment fragment = new productsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    private Retrofit retrofit;
    private ListView lista;
    List<Product> Lista;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_products, container, false);
        lista = (ListView) rootView.findViewById(R.id.ListaItems);
        retrofit = new Retrofit.Builder().baseUrl("http://192.168.1.36:3000/").addConverterFactory(GsonConverterFactory.create()).build();

        ProductoService productoservice = retrofit.create(ProductoService.class);

        Call<List<Product>> call = productoservice.getProducto();

        call.enqueue(new Callback<List<Product>>() {
            @Override
            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
                if(!response.isSuccessful()){
                    //textViewResultado.setText("Code: " + response.code());
                    return;
                }
                 Lista = response.body();

            }

            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {
                //textViewResultado.setText(t.getMessage());
            }
        });
        return rootView;

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}