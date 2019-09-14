package com.example.math_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class bajanum2 extends AppCompatActivity implements View.OnClickListener {
    private TextView num21, num22, sbl1, sbl2, tx5, tx6;
    private EditText ansver;
    private Button btn26,btn27;
    int n21 =200;
    int n22=800;
    int k11;
    String h= "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bajanum2);
        num21 = (TextView) findViewById(R.id.textView54);
        num22 = (TextView) findViewById(R.id.textView55);
        sbl1 = (TextView) findViewById(R.id.textView56);
        sbl2 = (TextView) findViewById(R.id.textView57);
        tx5 = (TextView) findViewById(R.id.textView58);
        ansver = (EditText) findViewById(R.id.editText11);
        btn26 = (Button) findViewById(R.id.button45);
        btn27 = (Button) findViewById(R.id.button44);
        btn26.setOnClickListener(this);
        btn27.setOnClickListener(this);
        num21.setText(n21+"");
        num22.setText(n22+"");
        ansver.setText("");




    }
    @Override
    public  void onClick (View view){



        if (view.getId()==R.id.button44) {
            n21 = 10 + (int) (Math.random() * 90);
            n22 = (10 + (int) (Math.random() * 100)) * n21;
            num21.setText(n21 + "");
            num22.setText(n22 + "");
            ansver.setText("");

        }





        if (view.getId()==R.id.button45) {
            if (ansver.getText().toString().equals("")) {
                tx5.setText("Введите ответ");
            } else {
                h = (ansver.getText().toString());
                int patasxan = Integer.parseInt(h);

                if (patasxan * n21 == n22) {


                    tx5.setText("Ответ правильный");

                } else {
                    k11 = n22 / n21;
                    tx5.setText("Ответ неправильный, правильный ответ" + " " + k11);


                }

            }

        }


        // ansver.setText("");
    }
}
