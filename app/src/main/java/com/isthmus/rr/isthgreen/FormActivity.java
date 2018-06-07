package com.isthmus.rr.isthgreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormActivity extends AppCompatActivity {

    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        btnSend = findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goResultActivity();
            }
        });
    }

    private void goResultActivity() {
        Intent i = new Intent(FormActivity.this, ResultActivity.class);
        startActivity(i);
    }
}
