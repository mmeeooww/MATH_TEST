package com.example.math_test;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bazmapatkum extends AppCompatActivity implements View.OnClickListener{
    private TextView num7, num8, sbl1, sbl2, tx7, tx8;
    private EditText ansver;
    private Button btn12,btn13;
    int n7 =2;
    int n8=2;
    int k3;
    String h= "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bazmapatkum);
        num7 = (TextView) findViewById(R.id.textView20);
        num8 = (TextView) findViewById(R.id.textView22);
        sbl1 = (TextView) findViewById(R.id.textView21);
        sbl2 = (TextView) findViewById(R.id.textView23);
        tx7 = (TextView) findViewById(R.id.textView24);
        ansver = (EditText) findViewById(R.id.editText4);
        btn12 = (Button) findViewById(R.id.button35);
        btn13 = (Button) findViewById(R.id.button34);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        ansver.setText("");
        num7.setText(n7+"");
        num8.setText(n8+"");




    }
    @Override
    public  void onClick (View view){



        if (view.getId()==R.id.button34) {
            n7 = (int) (Math.random() * 10);
            n8 = (int) (Math.random() * 10);
            num7.setText(n7 + "");
            num8.setText(n8 + "");
            ansver.setText("");
            tx7.setText("");

        }





        if (view.getId()==R.id.button35) {
            if (ansver.getText().toString().equals("")) {
                tx7.setText("Введите ответ");
            } else {
                h = (ansver.getText().toString());
                int patasxan = Integer.parseInt(h);

                if (n7 * n8 == patasxan) {


                    tx7.setText("Ответ правильный");

                } else {
                    k3 = n7 * n8;
                    tx7.setText("Ответ неправильный, правильный ответ" + " " + k3);


                }

            }

        }


        // ansver.setText("");
    }
}
