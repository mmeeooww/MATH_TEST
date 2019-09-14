package com.example.math_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Activity4 extends AppCompatActivity {
    private Button btn9, btn10, btn11, btn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        btn9 = (Button) findViewById(R.id.button9);
        btn10 = (Button) findViewById(R.id.button10);
        btn11 = (Button) findViewById(R.id.button11);
        btn12 = (Button) findViewById(R.id.button12);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengum();
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhanum();
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbajanum();
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbazmapatkum();
            }
        });
    }
    public void opengum() {
        Intent intent = new Intent(this, gum.class);
        startActivity(intent);

    }
    public void openhanum() {
        Intent intent = new Intent(this, hanum.class);
        startActivity(intent);
    }

    public void openbajanum() {
        Intent intent = new Intent(this, bajanum.class);
        startActivity(intent);
    }

    public void openbazmapatkum() {
        Intent intent = new Intent(this, bazmapatkum.class);
        startActivity(intent);
    }
}