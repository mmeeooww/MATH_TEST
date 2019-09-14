package com.example.math_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hanum extends AppCompatActivity implements View.OnClickListener{
    private TextView num3, num4, sbl1, sbl2, tx5, tx6;
    private EditText ansver;
    private Button btn10,btn11;
    int n3 =8;
    int n4=2;
    int k1;
    String h= "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hanum);
        num3 = (TextView) findViewById(R.id.textView10);
        num4 = (TextView) findViewById(R.id.textView12);
        sbl1 = (TextView) findViewById(R.id.textView11);
        sbl2 = (TextView) findViewById(R.id.textView13);
        tx5 = (TextView) findViewById(R.id.textView14);
        ansver = (EditText) findViewById(R.id.editText2);
        btn10 = (Button) findViewById(R.id.button29);
        btn11 = (Button) findViewById(R.id.button28);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        ansver.setText("");
        num3.setText(n3+"");
        num4.setText(n4+"");


    }
    @Override
    public  void onClick (View view){



        if (view.getId()==R.id.button28) {
            n3 = (int) (Math.random() * (50-20)+20);
            n4 = (int) (Math.random() * 10);
            if (n3>n4) {
                num3.setText(n3 + "");
                num4.setText(n4 + "");
            } else {
                num3.setText(n4 + "");
                num4.setText(n3 + "");
            }

            ansver.setText("");
            tx5.setText("");

        }





        if (view.getId()==R.id.button29) {
            if (ansver.getText().toString().equals("")) {
                tx5.setText("Введите ответ");
            } else {
                h = (ansver.getText().toString());
                int patasxan = Integer.parseInt(h);

                if (n3 - n4 == patasxan) {


                    tx5.setText("Ответ правильный");

                } else {
                    k1 = n3 - n4;
                    tx5.setText("Ответ неправильный, правильный ответ" + "  " + k1);


                }

            }

        }


        // ansver.setText("");
    }
}
