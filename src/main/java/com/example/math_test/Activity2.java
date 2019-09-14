package com.example.math_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
public class Activity2 extends AppCompatActivity {
    private Button btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity7();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openxndirner();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentest();
            }
        });

    }
        public void openActivity3 () {
            Intent intent = new Intent(this, Activity3.class);
            startActivity(intent);
        }

        public void openActivity7 () {
            Intent intent = new Intent(this, Activity7.class);
            startActivity(intent);
        }

        public void openxndirner () {
            Intent intent = new Intent(this, xndirner.class);
            startActivity(intent);
        }
    public void opentest () {
        Intent intent = new Intent(this, test.class);
        startActivity(intent);
        }
    }