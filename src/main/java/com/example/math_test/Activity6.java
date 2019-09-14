package com.example.math_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Activity6 extends AppCompatActivity {
    private Button btn9, btn10, btn11, btn12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);
        btn9 = (Button) findViewById(R.id.button9);
        btn10 = (Button) findViewById(R.id.button10);
        btn11 = (Button) findViewById(R.id.button11);
        btn12 = (Button) findViewById(R.id.button12);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengum2();
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhanum2();
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbajanum2();
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbazmapatkum2();
            }
        });
    }
    public void opengum2() {
        Intent intent = new Intent(this, gum2.class);
        startActivity(intent);
    }

    public void openhanum2() {
        Intent intent = new Intent(this, hanum2.class);
        startActivity(intent);

    }
    public void openbajanum2() {
        Intent intent = new Intent(this, bajanum2.class);
        startActivity(intent);

    }
    public void openbazmapatkum2() {
        Intent intent = new Intent(this, bazmapatkum2.class);
        startActivity(intent);
    }
}
