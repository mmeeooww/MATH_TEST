package com.example.math_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Activity5 extends AppCompatActivity {
    private Button btn9, btn10, btn11, btn12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        btn9 = (Button) findViewById(R.id.button9);
        btn10 = (Button) findViewById(R.id.button10);
        btn11 = (Button) findViewById(R.id.button11);
        btn12 = (Button) findViewById(R.id.button12);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengum1();
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhanum1();
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbajanum1();
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbazmapatkum1();
            }
        });
    }

    public void opengum1() {
        Intent intent = new Intent(this, gum1.class);
        startActivity(intent);
    }

    public void openhanum1() {
        Intent intent = new Intent(this, hanum1.class);
        startActivity(intent);
    }

    public void openbajanum1() {
        Intent intent = new Intent(this, bajanum1.class);
        startActivity(intent);
    }

    public void openbazmapatkum1() {
        Intent intent = new Intent(this, bazmapatkum1.class);
        startActivity(intent);
    }
}
