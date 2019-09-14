package com.example.math_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class gum extends AppCompatActivity implements View.OnClickListener{
    private TextView num1, num2, sbl1, sbl2, tx5, tx6;
    private EditText ansver;
    private Button btn1,btn2;
    int n1 =1;
    int n2=2;
    int k;

    String h= "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gum);
        num1 = (TextView) findViewById(R.id.textView1);
        num2 = (TextView) findViewById(R.id.textView3);
        sbl1 = (TextView) findViewById(R.id.textView2);
        sbl2 = (TextView) findViewById(R.id.textView4);
        tx5 = (TextView) findViewById(R.id.textView5);
        ansver = (EditText) findViewById(R.id.editText1);
        btn1 = (Button) findViewById(R.id.button24);
        btn2 = (Button) findViewById(R.id.button25);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        num1.setText(n1+"");
        num2.setText(n2+"");
        ansver.setText("");




    }
    @Override
    public  void onClick (View view){



        if (view.getId()==R.id.button25) {
            n1 = (int) (Math.random() * 20);
            n2 = (int) (Math.random() * 20);
            num1.setText(n1 + "");
            num2.setText(n2 + "");
            ansver.setText("");
            tx5.setText("");
        }





        if (view.getId()==R.id.button24) {



            if (ansver.getText().toString().equals("")){
                tx5.setText("Введите ответ");
            }
            else {
                h = (ansver.getText().toString());
                int patasxan = Integer.parseInt(h);
                if (n1 + n2 == patasxan) {
                    tx5.setText("Ответ правильный");
                }
                else {
                    k=n1+n2;
                    tx5.setText("Ответ неправильный, правильный ответ"+" "+ k );
                }

            }


              }






    }
}
