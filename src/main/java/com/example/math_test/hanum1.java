package com.example.math_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hanum1 extends AppCompatActivity implements View.OnClickListener {
    private TextView num11, num12, sbl1, sbl2, tx5, tx6;
    private EditText ansver;
    private Button btn16,btn17;
    int n11 =30;
    int n12=10;
    int k5;

    String h= "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hanum1);
        num11 = (TextView) findViewById(R.id.textView29);
        num12 = (TextView) findViewById(R.id.textView30);
        sbl1 = (TextView) findViewById(R.id.textView31);
        sbl2 = (TextView) findViewById(R.id.textView32);
        tx5 = (TextView) findViewById(R.id.textView33);
        ansver = (EditText) findViewById(R.id.editText6);
        btn16 = (Button) findViewById(R.id.button31);
        btn17 = (Button) findViewById(R.id.button30);
        btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);
        num11.setText(n11+"");
        num12.setText(n12+"");
        ansver.setText("");



    }
    @Override
    public  void onClick (View view){



        if (view.getId()==R.id.button30) {
            n11 =50+ ((int) (Math.random() * 100));
            n12 = 0+(int) (Math.random() * 50);
            num11.setText(n11 + "");
            num12.setText(n12 + "");
            ansver.setText("");
            tx5.setText("");

        }





        if (view.getId()==R.id.button31) {
            if (ansver.getText().toString().equals("")) {
                tx5.setText("Введите ответ");
            } else {
                h = (ansver.getText().toString());
                int patasxan = Integer.parseInt(h);

                if (n11 - n12 == patasxan) {


                    tx5.setText("Ответ правильный");

                } else {
                    k5 = n11 - n12;
                    tx5.setText("Ответ неправильный, правильный ответ" + "  " + k5);


                }

            }

        }


        // ansver.setText("");
    }
}
