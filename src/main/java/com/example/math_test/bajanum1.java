package com.example.math_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bajanum1 extends AppCompatActivity implements View.OnClickListener {
    private TextView num13, num14, sbl1, sbl2, tx5, tx6;
    private EditText ansver;
    private Button btn18,btn19;
    int n13 =10;
    int n14=50;
    int k6;

    String h= "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bajanum1);
        num13 = (TextView) findViewById(R.id.textView34);
        num14 = (TextView) findViewById(R.id.textView35);
        sbl1 = (TextView) findViewById(R.id.textView36);
        sbl2 = (TextView) findViewById(R.id.textView37);
        tx5 = (TextView) findViewById(R.id.textView38);
        ansver = (EditText) findViewById(R.id.editText7);
        btn18 = (Button) findViewById(R.id.button43);
        btn19 = (Button) findViewById(R.id.button42);
        btn18.setOnClickListener(this);
        btn19.setOnClickListener(this);
        num13.setText(n13+"");
        num14.setText(n14+"");
        ansver.setText("");



    }
    @Override
    public  void onClick (View view){



        if (view.getId()==R.id.button42) {
            n13 = 3 + (int) (Math.random() * 10);
            n14 = (3 + (int) (Math.random() * 10)) * n13;
            num13.setText(n13 + "");
            num14.setText(n14 + "");
            ansver.setText("");
            tx5.setText("");

        }





        if (view.getId()==R.id.button43) {
            if (ansver.getText().toString().equals("")) {
                tx5.setText("Введите ответ");
            } else {
                h = (ansver.getText().toString());
                int patasxan = Integer.parseInt(h);

                if (patasxan * n13 == n14) {


                    tx5.setText("Ответ правильный");

                } else {
                    k6 = n14 / n13;
                    tx5.setText("Неправильный ответ,   правильный ответ: " + " " + k6);


                }

            }

        }


        // ansver.setText("");
    }
}
