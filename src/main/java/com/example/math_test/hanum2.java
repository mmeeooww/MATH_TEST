package com.example.math_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hanum2 extends AppCompatActivity implements View.OnClickListener {
    private TextView num19, num20, sbl1, sbl2, tx5, tx6;
    private EditText ansver;
    private Button btn24,btn25;
    int n19 =400;
    int n20=300;
    int k10;
    String h= "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hanum2);
        num19 = (TextView) findViewById(R.id.textView49);
        num20 = (TextView) findViewById(R.id.textView50);
        sbl1 = (TextView) findViewById(R.id.textView51);
        sbl2 = (TextView) findViewById(R.id.textView52);
        tx5 = (TextView) findViewById(R.id.textView53);
        ansver = (EditText) findViewById(R.id.editText10);
        btn24 = (Button) findViewById(R.id.button33);
        btn25 = (Button) findViewById(R.id.button32);
        btn24.setOnClickListener(this);
        btn25.setOnClickListener(this);

        num19.setText(n19+"");
        num20.setText(n20+"");
        ansver.setText("");


    }
    @Override
    public  void onClick (View view){



        if (view.getId()==R.id.button32) {
            n19 = 500+(int) (Math.random() * 900);
            n20 = 100+(int) (Math.random() * 500);
            num19.setText(n19 + "");
            num20.setText(n20 + "");
            ansver.setText("");
            tx5.setText("");

        }





        if (view.getId()==R.id.button33) {
            if (ansver.getText().toString().equals("")) {
                tx5.setText("Введите ответ");
            } else {
                h = (ansver.getText().toString());
                int patasxan = Integer.parseInt(h);

                if (n19 - n20 == patasxan) {


                    tx5.setText("Ответ правильный");

                } else {
                    k10 = n19 - n20;
                    tx5.setText("Ответ неправильный, " + " правильный ответ  " + k10);


                }

            }

        }


        // ansver.setText("");
    }
}
