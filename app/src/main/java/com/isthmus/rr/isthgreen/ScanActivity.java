package com.isthmus.rr.isthgreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    }

    private void goFormActivity() {
        Intent i = new Intent(ScanActivity.this, FormActivity.class);
        startActivity(i);
    }
}
