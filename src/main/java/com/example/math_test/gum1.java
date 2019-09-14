package com.example.math_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class gum1 extends AppCompatActivity implements View.OnClickListener {
    private TextView num9, num10, sbl1, sbl2, tx5, tx6;

    private EditText ansver;
    private Button btn14, btn15;
    int n9 = 30;
    int n10 = 35;
    int k4;

    String h = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gum1);
        num9 = (TextView) findViewById(R.id.textView24);
        num10 = (TextView) findViewById(R.id.textView26);
        sbl1 = (TextView) findViewById(R.id.textView25);
        sbl2 = (TextView) findViewById(R.id.textView27);
        tx5 = (TextView) findViewById(R.id.textView28);
        ansver = (EditText) findViewById(R.id.editText4);
        btn14 = (Button) findViewById(R.id.button27);
        btn15 = (Button) findViewById(R.id.button26);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {


        if (view.getId() == R.id.button26) {
            n9 = (int) (Math.random() * 100) + 20;
            n10 = (int) (Math.random() * 100) + 20;
            num9.setText(n9 + "");
            num10.setText(n10 + "");
            ansver.setText("");
            tx5.setText("");
        }


        if (view.getId() == R.id.button27) {
            if (ansver.getText().toString().equals("")){
                tx5.setText("Введите ответ");
            }
            else {
            h = (ansver.getText().toString());
            int patasxan = Integer.parseInt(h);

            if (n9 + n10 == patasxan) {


                tx5.setText("Ответ правильный");

            } else {
                k4 = n9 + n10;
                tx5.setText("Ответ неправильный, правильный ответ" + " " + k4);

            }
            }
        }
    }
}