package com.isthmus.rr.isthgreen;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ScanActivity extends AppCompatActivity {

    private Button btnScan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
        btnScan = findViewById(R.id.btnScan);
        btnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goFormActivity();
            }
        });
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
                        goHome();
                        return true;
                    case R.id.menu_list:
                        goList();
                        return true;
                    case R.id.menu_scan:
                        return true;
                }
                return true;
            }
        });
    }

    private void goFormActivity() {
        Intent i = new Intent(ScanActivity.this, FormActivity.class);
        startActivity(i);
    }

    private void goHome(){
        Intent i = new Intent(ScanActivity.this, HomeActivity.class);
        startActivity(i);
    }

    private void goList(){
        Intent i = new Intent(ScanActivity.this, ListActivity.class);
        startActivity(i);
    }
}
