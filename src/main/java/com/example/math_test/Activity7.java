package com.example.math_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity7 extends AppCompatActivity {
    private TextView tx1,tx2;
    private Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);
        tx1 = (TextView) findViewById(R.id.textView64);
        tx2=(TextView)findViewById(R.id.textView74);
        btn1 = (Button) findViewById(R.id.button17);
        btn2 = (Button) findViewById(R.id.button18);
        btn3 = (Button) findViewById(R.id.button19);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openerkarutyun();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openjamanak();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openzangvac();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openzangvac();
            }
        });
    }

    public void openerkarutyun() {
        Intent intent = new Intent(this, erkarutyun.class);
        startActivity(intent);
    }
    public void openjamanak() {
        Intent intent = new Intent(this, jamanak.class);
        startActivity(intent);}

    public void openzangvac() {
        Intent intent = new Intent(this, zangvac.class);
        startActivity(intent);
    }
}