package com.example.math_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Testiardyunq extends AppCompatActivity {
    private TextView mText,tx1;
    private Button btn1, btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testiardyunq);

        Intent myIntent = getIntent();
        if (myIntent.hasExtra("chjnjel")) {
            tx1 = (TextView) findViewById(R.id.textView78);
            btn1 = (Button) findViewById(R.id.button56);
            btn2 = (Button) findViewById(R.id.button57);
            mText = (TextView) findViewById(R.id.testrezuls1);
            mText.setText("Из 10 Вы набрали " + myIntent.getStringExtra("chjnjel") + " баллов");
        }
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentest();
            }
        });
    }
    public void  openMainActivity() {
        Intent intent = new Intent(this,  MainActivity.class);
        startActivity (intent);
    }
    public void opentest () {
        Intent intent = new Intent(this, test.class);
        startActivity(intent);
    }
}
