package com.example.viachslav.financialapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button swith= (Button)findViewById(R.id.button2);
        swith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AddTr = new Intent(getApplicationContext(),AddTransaction.class);
                startActivity(AddTr);
            }
        });

        Button swith2= (Button)findViewById(R.id.button);
        swith2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AddCat = new Intent(getApplicationContext(),CategoryAdd.class);
                startActivity(AddCat);
            }
        });








    }
}
