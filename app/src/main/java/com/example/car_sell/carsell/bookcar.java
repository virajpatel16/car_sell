package com.example.car_sell.carsell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import androidx.cardview.widget.CardView;

import com.example.car_sell.R;

public class bookcar extends AppCompatActivity {
CardView coustmize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookcar);

        coustmize=findViewById(R.id.coustmize);

        coustmize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(bookcar.this,com.example.car_sell.customize.class);
                startActivity(intent);
            }
        });
    }
}