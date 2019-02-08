package com.example.jeanramos.appteindascresspo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.jeanramos.appteindascresspo.models.Product;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import com.example.jeanramos.appteindascresspo.Fragments.APIrest;
import com.example.jeanramos.appteindascresspo.Fragments.AboutFragment;
import com.example.jeanramos.appteindascresspo.Fragments.productsFragment;

import java.util.ArrayList;

public class menuActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    FirebaseDatabase databaseFireBase;
    DatabaseReference productsReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_gallery) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {
            Toast.makeText(this,"Haz hecho clik",Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_slideshow) {
            fragmentChange("product_list");
        } else if (id == R.id.nav_manage) {
            fragmentChange("about");
        } else if (id == R.id.nav_api) {
            fragmentChange("apirest");
        } else if (id == R.id.send_mesasage) {
            ArrayList<Product> products=new ArrayList<>();
            Float x= new Float(20);
            Product myNewProducto = new Product("camisa" ,"dsdad",x,"red");
            products.add(myNewProducto);
            productsReference.setValue(products);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void fragmentChange (String _Fragment){
        if(_Fragment.equals("product_list")){
            getFragmentManager().beginTransaction()
                    .replace(R.id.mainFragment,new productsFragment())
                    .addToBackStack(null).commit();
        }else if (_Fragment.equals("about")) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.mainFragment, new AboutFragment())
                    .addToBackStack(null).commit();
        }else if (_Fragment.equals("apirest")) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.mainFragment, new APIrest())
                    .addToBackStack(null).commit();
        }

    }
}
