package com.example.math_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bazmapatkum2 extends AppCompatActivity implements View.OnClickListener{
    private TextView num23, num24, sbl1, sbl2, tx5, tx6;
    private EditText ansver;
    private Button btn28,btn29;
    int n23 =20;
    int n24=30;
    int k12;
    String h= "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bazmapatkum2);
        num23 = (TextView) findViewById(R.id.textView59);
        num24 = (TextView) findViewById(R.id.textView60);
        sbl1 = (TextView) findViewById(R.id.textView61);
        sbl2 = (TextView) findViewById(R.id.textView62);
        tx5 = (TextView) findViewById(R.id.textView63);
        ansver = (EditText) findViewById(R.id.editText12);
        btn28 = (Button) findViewById(R.id.button39);
        btn29 = (Button) findViewById(R.id.button38);
        btn28.setOnClickListener(this);
        btn29.setOnClickListener(this);
        num23.setText(n23+"");
        num24.setText(n24+"");
        ansver.setText("");



    }
    @Override
    public  void onClick (View view){



        if (view.getId()==R.id.button38) {
            n23 = (int) (Math.random() * 90)+20;
            n24 = (int) (Math.random() * 90)+20;
            num23.setText(n23 + "");
            num24.setText(n24 + "");
            ansver.setText("");
            tx5.setText("");

        }





        if (view.getId()==R.id.button39) {
            if (ansver.getText().toString().equals("")) {
                tx5.setText("Введите ответ");
            } else {
                h = (ansver.getText().toString());
                int patasxan = Integer.parseInt(h);

                if (n23 * n24 == patasxan) {


                    tx5.setText("Ответ правильный");

                } else {
                    k12 = n23 * n24;
                    tx5.setText("Ответ неправильный, правильный ответ" + " " + k12);


                }

            }


        }

        // ansver.setText("");
    }
}
