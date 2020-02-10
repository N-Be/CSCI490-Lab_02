package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    private ImageView supermoon;
    private ImageView waterfall;

    private int imgId;

    private int RESPONSE_CODE = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        supermoon = findViewById(R.id.supermoon);
        waterfall = findViewById(R.id.waterfall);

        final Intent intent = new Intent();

        supermoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgId = R.drawable.supermoon;

                intent.putExtra("imgId", imgId);
                setResult(RESPONSE_CODE,intent);
                finish();
            }
        });

        waterfall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgId = R.drawable.waterfall;

                intent.putExtra("imgId", imgId);
                setResult(RESPONSE_CODE,intent);
                finish();
            }
        });


    }


}
