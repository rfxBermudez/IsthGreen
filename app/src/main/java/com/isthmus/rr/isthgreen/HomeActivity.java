package com.isthmus.rr.isthgreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.AdapterView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater miMenu = getMenuInflater();
        miMenu.inflate(R.menu.menu_home,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_home:
                return true;
            case R.id.menu_list:
                goList();
                return true;
            case R.id.menu_scan:
                goScan();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
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
