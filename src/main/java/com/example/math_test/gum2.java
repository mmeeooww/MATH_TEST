package com.example.math_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class gum2 extends AppCompatActivity implements View.OnClickListener {
    private TextView num17, num18, sbl1, sbl2, tx5, tx6;
    private EditText ansver;
    private Button btn22,btn23;
    int n17 =101;
    int n18=103;
    int k9;
    String h= "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gum2);
        num17 = (TextView) findViewById(R.id.textView44);
        num18 = (TextView) findViewById(R.id.textView45);
        sbl1 = (TextView) findViewById(R.id.textView46);
        sbl2 = (TextView) findViewById(R.id.textView47);
        tx5 = (TextView) findViewById(R.id.textView48);
        ansver = (EditText) findViewById(R.id.editText9);
        btn22 = (Button) findViewById(R.id.button);
        btn23 = (Button) findViewById(R.id.button2);
        btn22.setOnClickListener(this);
        btn23.setOnClickListener(this);
        num17.setText(n17+"");
        num18.setText(n18+"");
        ansver.setText("");



    }
    @Override
    public  void onClick (View view){



        if (view.getId()==R.id.button2) {
            n17 = (int) (Math.random() * 800)+100;
            n18 = (int) (Math.random() * 800)+100;
            num17.setText(n17 + "");
            num18.setText(n18 + "");
            ansver.setText("");
            tx5.setText("");

        }





        if (view.getId()==R.id.button) {
            if (ansver.getText().toString().equals("")) {
                tx5.setText("Введите ответ");
            } else {
                h = (ansver.getText().toString());
                int patasxan = Integer.parseInt(h);
                if (n17 + n18 == patasxan) {


                    tx5.setText("Ответ правильный");

                } else {
                    k9 = n17 + n18;
                    tx5.setText("Ответ неправильный, правильный ответ" + " " + k9);


                }

            }

        }


    }
}
