package com.example.math_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bajanum extends AppCompatActivity implements View.OnClickListener {
    private TextView num5, num6, sbl1, sbl2, tx5, tx6;
    private EditText ansver;
    private Button btn10,btn11;
    int n5 =2;
    int n6=10;
    int k2;
    String h= "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bajanum);
        num5 = (TextView) findViewById(R.id.textView15);
        num6 = (TextView) findViewById(R.id.textView17);
        sbl1 = (TextView) findViewById(R.id.textView16);
        sbl2 = (TextView) findViewById(R.id.textView18);
        tx5 = (TextView) findViewById(R.id.textView19);
        ansver = (EditText) findViewById(R.id.editText3);
        btn10 = (Button) findViewById(R.id.button41);
        btn11 = (Button) findViewById(R.id.button40);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        ansver.setText("");
        num5.setText(n5+"");
        num6.setText(n6+"");

    }
    @Override
    public  void onClick (View view){

        if (view.getId()==R.id.button40) {
            n5 = 1 + (int) (Math.random() * 5);
            n6 = (1 + (int) (Math.random() * 5))*n5;
            tx5.setText("");
            ansver.setText("");
                num5.setText(n5 + "");
                num6.setText(n6 + "");

        }

        if (view.getId()==R.id.button41) {

            if (ansver.getText().toString().equals("")) {
                tx5.setText("Введите ответ");
            }
            else {
                h = (ansver.getText().toString());
                int patasxan = Integer.parseInt(h);

                if (patasxan * n5 == n6) {
                    tx5.setText("Ответ правильный");

                }
                else {
                    k2 = n6 / n5;
                    tx5.setText("Ответ неправильный," + "   правильный ответ: " + k2);
                }

            }


        }

        // ansver.setText("");
    }
}
