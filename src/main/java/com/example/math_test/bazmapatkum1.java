package com.example.math_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class bazmapatkum1 extends AppCompatActivity implements View.OnClickListener {
    private TextView num15, num16, sbl1, sbl2, tx5, tx6;
    private EditText ansver;
    private Button btn20,btn21;
    int n15 =30;
    int n16=10;
    int k7;

    String h= "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bazmapatkum1);
        num15 = (TextView) findViewById(R.id.textView39);
        num16 = (TextView) findViewById(R.id.textView40);
        sbl1 = (TextView) findViewById(R.id.textView41);
        sbl2 = (TextView) findViewById(R.id.textView42);
        tx5 = (TextView) findViewById(R.id.textView43);
        ansver = (EditText) findViewById(R.id.editText8);
        btn20 = (Button) findViewById(R.id.button37);
        btn21 = (Button) findViewById(R.id.button36);
        btn20.setOnClickListener(this);
        btn21.setOnClickListener(this);
        num15.setText(n15+"");
        num16.setText(n16+"");
        ansver.setText("");



    }
    @Override
    public  void onClick (View view){



        if (view.getId()==R.id.button36) {

                n15 = (int) (Math.random() * 20) + 10;
                n16 = (int) (Math.random() * 10);
                num15.setText(n15 + "");
                num16.setText(n16 + "");
                ansver.setText("");
                tx5.setText("");

            }


            if (view.getId() == R.id.button37) {
                if (ansver.getText().toString().equals("")) {
                    tx5.setText("Введите ответ");
                } else {
                h = (ansver.getText().toString());
                int patasxan = Integer.parseInt(h);

                if (n15 * n16 == patasxan) {


                    tx5.setText("Ответ правильный");

                } else {
                    k7 = n15 * n16;
                    tx5.setText("Ответ неправильный, правильный ответ" + " " + k7);


                }

            }


        }

        // ansver.setText("");
    }
}
