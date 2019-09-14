package com.example.math_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class erkarutyun extends AppCompatActivity implements View.OnClickListener{
    private TextView tx1, tx2, tx3, tx4, tx5,tx6,tx7,tx8, results;
    private EditText edi1, edi2, edi3,edi4, edi5, edi6,edi7, edi8;
    private Button btn1, btn2;
    private String h1, h2, h3, h4, h5, h6, h7, h8, datark;
    private int n1, n2, n3, n4, n5, n6, n7, n8,m1,m2,m3,m4,m5,m6,m7,m8, gnah=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erkarutyun);
        tx1=(TextView)findViewById(R.id.num1);
        tx2 = (TextView) findViewById(R.id.num2);
        tx3 = (TextView) findViewById(R.id.num3);
        tx4 = (TextView) findViewById(R.id.num4);
        tx5 = (TextView) findViewById(R.id.num5);
        tx6 = (TextView) findViewById(R.id.num6);
        tx7 = (TextView) findViewById(R.id.num7);
        tx8 = (TextView) findViewById(R.id.num8);
        results = (TextView) findViewById(R.id.result);
        edi1 = (EditText) findViewById(R.id.ed1);
        edi2 = (EditText) findViewById(R.id.ed2);
        edi3 = (EditText) findViewById(R.id.ed3);
        edi4 = (EditText) findViewById(R.id.ed4);
        edi5 = (EditText) findViewById(R.id.ed5);
        edi6 = (EditText) findViewById(R.id.ed6);
        edi7 = (EditText) findViewById(R.id.ed7);
        edi8 = (EditText) findViewById(R.id.ed8);
        btn1 = (Button) findViewById(R.id.button47);
        btn2 = (Button) findViewById(R.id.button46);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn2.setEnabled(false);
    }
    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.button47) {
            btn2.setEnabled(true);
            btn1.setEnabled(false);

            n1 = (int) (Math.random()*10)+1;
            n2 = (int) (Math.random()*9)+2;
            n3 = (int) (Math.random()*8)+3;
            n4 = (int) (Math.random()*97)+2;
            n5 = (int) (Math.random()*7)+2;
            n6 = (int) (Math.random()*10)+1;
            n7 = (int) (Math.random()*10)+1;
            n8 = (int) (Math.random()*9)+1;

            tx1.setText(n1+"");
            tx2.setText(n2+"");
            tx3.setText(n3+"");
            tx4.setText(n4+"");
            tx5.setText(n5+"");
            tx6.setText(n6+"");
            tx7.setText(n7+"");
            tx8.setText(n8+"");
            datark = "";

            results.setText(datark);
            edi1.setText("");
            edi2.setText("");
            edi3.setText("");
            edi4.setText("");
            edi5.setText("");
            edi6.setText("");
            edi7.setText("");
            edi8.setText("");


        }
        if (view.getId() == R.id.button46) {
            if (edi1.getText().toString().equals("")||edi2.getText().toString().equals("")||
                    edi3.getText().toString().equals("")||edi4.getText().toString().equals("")
                    ||edi5.getText().toString().equals("")||edi6.getText().toString().equals("")
                    ||edi7.getText().toString().equals("")||edi8.getText().toString().equals("")){
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
                h6 = edi6.getText().toString();
                h7 = edi7.getText().toString();
                h8 = edi8.getText().toString();

                m1 = Integer.parseInt(h1);
                m2 = Integer.parseInt(h2);
                m3 = Integer.parseInt(h3);
                m4 = Integer.parseInt(h4);
                m5 = Integer.parseInt(h5);
                m6 = Integer.parseInt(h6);
                m7 = Integer.parseInt(h7);
                m8 = Integer.parseInt(h8);

                if (n1 * 10 == m1 && n2 * 10 == m2 && n3 * 100 == m3 && n4 * 10 == m4 && n5 * 100 == m5 && n8 * 10000 == m8 && n6 * 1000 == m6 && n7 * 1000 == m7) {
                    datark = "Ты правильно ответил на все вопросы";
                } else {
                    datark += "Не правильно  " + '\n';

                    if (n1 * 10 == m1) {
                        gnah++;
                    } else {
                        datark += "первая строка, правильный ответ: " + n1 * 10 + "  " + '\n';
                    }
                    if (n2 * 10 == m2) {
                        gnah++;
                    } else {
                        datark += "строка 2, правильный ответ: " + n2 * 10 + "  " + '\n';
                    }
                    if (n3 * 100 == m3) {
                        gnah++;
                    } else {
                        datark += "строка 3, правильный ответ: " + n3 * 100 + "  " + '\n';
                        ;
                    }
                    if (n4 * 10 == m4) {
                        gnah++;
                    } else {
                        datark += "строка 4, правильный ответ: " + n4 * 10 + "  " + '\n';
                    }
                    if (n5 * 100 == m5) {
                        gnah++;
                    } else {
                        datark += "строка 5, правильный ответ: " + n5 * 100 + "  " + '\n';
                    }
                    if (n6 * 1000 == m6) {
                        gnah++;
                    } else {
                        datark += "строка 6, правильный ответ: " + n6 * 1000 + "  " + '\n';
                    }
                    if (n7 * 1000 == m7) {
                        gnah++;
                    } else {
                        datark += "строка 7, правильный ответ:" + n7 * 1000 + "  " + '\n';
                    }
                    if (n8 * 10000 == m8) {
                        gnah++;
                    } else {
                        datark += "строка 8, правильный ответ: " + n8 * 10000 + "  " + '\n';
                    }
                }
                results.setText(datark);


            }

        }
    }
}
