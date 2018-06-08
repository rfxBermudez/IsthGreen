package com.isthmus.rr.isthgreen;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        LinearLayout linearLayout = findViewById(R.id.list1);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goListDetail();
            }
        });
        configurationMenu();
    }

    private void goListDetail() {
        Intent i = new Intent(ListActivity.this, ListDetailActivity.class);
        startActivity(i);
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
                        return true;
                    case R.id.menu_scan:
                        goScan();
                        return true;
                }
                return true;
            }
        });
    }

    private void goHome(){
        Intent i = new Intent(ListActivity.this, HomeActivity.class);
        startActivity(i);
    }

    private void goScan(){
        Intent i = new Intent(ListActivity.this, ScanActivity.class);
        startActivity(i);
    }
}
