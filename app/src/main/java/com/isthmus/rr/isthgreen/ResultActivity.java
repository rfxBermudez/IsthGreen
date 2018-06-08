package com.isthmus.rr.isthgreen;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ResultActivity extends AppCompatActivity {

    private Button btnRecycle;
    private Button btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
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
                        goScan();
                        return true;
                }
                return true;
            }
        });
    }

    private void goHome(){
        Intent i = new Intent(ResultActivity.this, HomeActivity.class);
        startActivity(i);
    }

    private void goScan(){
        Intent i = new Intent(ResultActivity.this, ScanActivity.class);
        startActivity(i);
    }

    private void goList(){
        Intent i = new Intent(ResultActivity.this, ListActivity.class);
        startActivity(i);
    }


}
