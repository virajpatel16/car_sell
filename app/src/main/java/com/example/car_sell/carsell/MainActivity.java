package com.example.car_sell.carsell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.car_sell.R;
import com.example.car_sell.customize;

public class MainActivity extends AppCompatActivity {
Button book,customize,payment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        book=findViewById(R.id.book);
        customize=findViewById(R.id.customize);
        payment=findViewById(R.id.payment);


        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,bookcar.class);
                startActivity(intent);
            }
        });
        customize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(MainActivity.this, com.example.car_sell.customize.class);
                startActivity(intent);
            }
        });
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,payment.class);
                startActivity(intent);
            }
        });
    }
}