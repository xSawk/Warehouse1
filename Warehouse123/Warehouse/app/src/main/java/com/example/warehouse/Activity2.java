package com.example.warehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button bttAdd = (Button)findViewById(R.id.button2);
        Button bttList = (Button)findViewById(R.id.button3);

        bttList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
        bttAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

    }
    public void openActivity1()
    {
        Intent intent = new Intent(this, ActivityProductList.class);
        startActivity(intent);
    }
    public void openActivity2()
    {
        Intent intent = new Intent(this, ActivityAddProduct.class);
        startActivity(intent);
    }
}
