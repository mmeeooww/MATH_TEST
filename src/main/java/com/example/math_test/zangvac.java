package com.example.math_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class zangvac extends AppCompatActivity implements View.OnClickListener {
    private TextView tx1, tx2, tx3, tx4, tx5,tx6,tx7,tx8, results;
    private EditText edi1, edi2, edi3,edi4, edi5;
    private Button btn1, btn2;
    private String h1, h2, h3, h4, h5, datark;
    private int n1, n2, n3, n4, n5, m1,m2,m3,m4,m5, gnah=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zangvac);
        tx1=(TextView)findViewById(R.id.num1);
        tx2 = (TextView) findViewById(R.id.num2);
        tx3 = (TextView) findViewById(R.id.num3);
        tx4 = (TextView) findViewById(R.id.num4);
        tx5 = (TextView) findViewById(R.id.num5);
        results = (TextView)findViewById(R.id.result);
        edi1 = (EditText) findViewById(R.id.ed1);
        edi2 = (EditText) findViewById(R.id.ed2);
        edi3 = (EditText) findViewById(R.id.ed3);
        edi4 = (EditText) findViewById(R.id.ed4);
        edi5 = (EditText) findViewById(R.id.ed5);
        btn1 = (Button) findViewById(R.id.button51);
        btn2 = (Button) findViewById(R.id.button50);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn2.setEnabled(false);


    }
    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.button51) {
            btn2.setEnabled(true);
            btn1.setEnabled(false);


            n1 = (int) (Math.random()*100)+1;
            n2 = (int) (Math.random()*100)+2;
            n3 = (int) (Math.random()*10)+3;
            n4 = (int) (Math.random()*50)+2;
            n5 = (int) (Math.random()*90)+2;

            tx1.setText(n1+"");
            tx2.setText(n2+"");
            tx3.setText(n3+"");
            tx4.setText(n4+"");
            tx5.setText(n5+"");
            datark = "";

            results.setText(datark);
            edi1.setText("");
            edi2.setText("");
            edi3.setText("");
            edi4.setText("");
            edi5.setText("");


        }
        if (view.getId() == R.id.button50) {
            if (edi1.getText().toString().equals("")||edi2.getText().toString().equals("")||
                    edi3.getText().toString().equals("")||edi4.getText().toString().equals("")
                    ||edi5.getText().toString().equals("")
                    ){
                results.setText("Введите все ответы");
            }
            else {
                btn2.setEnabled(false);
                btn1.setEnabled(true);


                h1 = edi1.getText().toString();
                h2 = edi2.getText().toString();
                h3 = edi3.getText().toString();
                h4 = edi4.getText().toString();
                h5 = edi5.getText().toString();

                m1 = Integer.parseInt(h1);
                m2 = Integer.parseInt(h2);
                m3 = Integer.parseInt(h3);
                m4 = Integer.parseInt(h4);
                m5 = Integer.parseInt(h5);


                if (n1 * 1000 == m1 && n2 * 1000 == m2 && n3 * 100 == m3 && n4 * 1000 == m4 && n5 * 10 == m5) {
                    datark = "Ты правильно ответил на все вопросы";
                } else {
                    datark += "Не правильно  " + '\n';

                    if (n1 * 1000 == m1) {
                        gnah++;
                    } else {
                        datark += "строка 1, правильный ответ:  " + n1 * 1000 + "  " + '\n';
                    }
                    if (n2 * 1000 == m2) {
                        gnah++;
                    } else {
                        datark += "строка 2, правильный ответ:  " + n2 * 1000 + "  " + '\n';
                    }
                    if (n3 * 100 == m3) {
                        gnah++;
                    } else {
                        datark += "строка 3, правильный ответ:  " + n3 * 100 + "  " + '\n';
                        ;
                    }
                    if (n4 * 1000 == m4) {
                        gnah++;
                    } else {
                        datark += "строка 4, правильный ответ:  " + n4 * 1000 + "  " + '\n';
                    }
                    if (n5 * 10 == m5) {
                        gnah++;
                    } else {
                        datark += "строка 5, правильный ответ:  " + n5 * 10 + "  " + '\n';
                    }

                }
                results.setText(datark);


            }

        }
    }
}
