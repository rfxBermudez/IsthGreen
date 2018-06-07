package com.isthmus.rr.isthgreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResultActivity extends AppCompatActivity {

    private Button btnRecycle;
    private Button btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        btnRecycle = findViewById(R.id.btnRecycle);
        btnRecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goScanActivity();
            }
        });

        btnHome = findViewById(R.id.btnHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goHomeActivity();
            }
        });
    }

    private void goHomeActivity() {
        Intent i = new Intent(ResultActivity.this, HomeActivity.class);
        startActivity(i);
    }

    private void goScanActivity() {
        Intent i = new Intent(ResultActivity.this, ScanActivity.class);
        startActivity(i);
    }


}
