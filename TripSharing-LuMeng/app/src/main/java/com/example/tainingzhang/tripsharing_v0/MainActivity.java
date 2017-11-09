package com.example.tainingzhang.tripsharing_v0;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClickSearch(View v) {
        // in this function you need get the place id from Meng lu
        // transmit this place id to info activity

        // You need transfer the bitmap you get into the info class
        String placeId = "";
        Intent i = new Intent(MainActivity.this, info.class);




        i.putExtra("PlaceId", placeId);

        //Ask Menglu how to pass the bitmaps she get in this activity to info activity


        startActivity(i);
    }

}
