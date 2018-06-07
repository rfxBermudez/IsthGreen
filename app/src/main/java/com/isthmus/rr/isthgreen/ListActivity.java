package com.isthmus.rr.isthgreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    }

    private void goListDetail() {
        Intent i = new Intent(ListActivity.this, ListDetailActivity.class);
        startActivity(i);
    }


}
