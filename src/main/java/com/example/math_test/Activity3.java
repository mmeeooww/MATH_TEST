package com.example.math_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public class Activity3 extends AppCompatActivity {
    private TextView tx1;
    private Button btn6, btn7, btn8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });
    }


    public void openActivity4() {
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }

    public void openActivity5() {
        Intent intent = new Intent(this, Activity5.class);
        startActivity(intent);
    }

    public void openActivity6() {
        Intent intent = new Intent(this, Activity6.class);
        startActivity(intent);
    }
}