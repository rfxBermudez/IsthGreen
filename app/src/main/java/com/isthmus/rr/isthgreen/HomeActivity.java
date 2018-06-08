package com.isthmus.rr.isthgreen;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //Iniciliacion del Card
        imageView = findViewById(R.id.card_view_image);
        Drawable myDrawable = getResources().getDrawable(R.drawable.recicle);
        imageView.setImageDrawable(myDrawable);
        textView =  findViewById(R.id.card_view_image_title);
        textView.setText("Duplica tus puntos al reciclar!");
        configurationMenu();
    }

    private void configurationMenu(){
        //Configuracion del menú
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_home:
                        return true;
                    case R.id.menu_list:
                        goList();
                        return true;
                    case R.id.menu_scan:
                        goScan();
                        return true;
                }
                return true;
            }
        });
    }

    private void goList(){
        Intent i = new Intent(HomeActivity.this, ListActivity.class);
        startActivity(i);
    }

    private void goScan(){
        Intent i = new Intent(HomeActivity.this, ScanActivity.class);
        startActivity(i);
    }
}
