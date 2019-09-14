package com.example.math_test;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;

public class test extends AppCompatActivity implements View.OnClickListener {
    public Button btn1, btn2, btn3, btn4, btnnext;
    public TextView tx1, tx2, tx3;
    public int k = 1, temp = 2, z = 0, xndrihamar=0, a=0, b=0, c=0,testrez=0, j=2;
    public int green=Color.parseColor("#32CD32"),  red = Color.parseColor("#FF0000");
    public int white = Color.parseColor("#FFFFFF");
    String h = "", h1="", a1="", a2="", a3="";


    String[] items1 = {"10+1=", "17+6=", "56+8=","78+6="};
    int[] answer1 = {12, 13, 14, 11, 23, 20, 21, 22, 63,65,64,66,84,83,80,86};
    String[] items2 = {"18-5=", "29-8=","36-9=","62-7="};
    int[] answer2 = {12, 13, 15, 14, 21, 23, 24,22,28,27,29,26,54,53,55,51};
    String[] items3 = {"10×9=", "11×4","32×3=","12×3=","32×4=","56×7="};
    int[] answer3 = {80, 90, 95, 85, 41, 44, 42, 46, 98,101,95,96,36,38,35,34,126,125,128,130,390,394,392,396};
    String[] items4 = {"18÷2", "84÷4","63÷9","72÷8","72÷9","65÷5","72÷8","56÷8"};
    int[] answer4 = {9, 8, 6, 10, 22, 21, 20, 23,6,7,8,9,10,9,7,8,7,8,9,6,13,12,11,14,8,6,7,9};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        btn1 = (Button) findViewById(R.id.button52);
        btn2 = (Button) findViewById(R.id.button53);
        btn3 = (Button) findViewById(R.id.button54);
        btn4 = (Button) findViewById(R.id.button55);
        btnnext = (Button) findViewById(R.id.next);
        tx1 = (TextView) findViewById(R.id.textView76);
        tx2 = (TextView) findViewById(R.id.textView77);
        tx3 = (TextView) findViewById(R.id.globaltx);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btnnext.setOnClickListener(this);
        tx2.setText(items1[0]);
        btn1.setText(answer1[0] + "");
        btn2.setText(answer1[1] + "");
        btn3.setText(answer1[2] + "");
        btn4.setText(answer1[3] + "");
        btnnext.setEnabled(false);

    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.button52) {
            h1 = btn1.getText().toString();
            z = Integer.parseInt(h1);
            btnnext.setEnabled(true);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            h = tx2.getText().toString();
            a1 =""+h.charAt(0);
            a2=""+h.charAt(1);
            a3=""+h.charAt(3);
            a = Integer.parseInt(a1);
            b = Integer.parseInt(a2);
            c = Integer.parseInt(a3);
            a = a * 10 + b;

                if (k==1) {
                    if (z == a + c) {
                        testrez++;
                        btn1.setBackgroundColor(green);
                    }
                    else {
                        btn1.setBackgroundColor(red);
                    }
                }

                if (k == 2) {
                    if (z == a - c) {
                        testrez++;
                        btn1.setBackgroundColor(green);
                    }
                    else {
                        btn1.setBackgroundColor(red);
                    }
                }

                if (k== 3) {
                    if (z == a * c) {
                        testrez++;
                        btn1.setBackgroundColor(green);
                    } else {
                        btn1.setBackgroundColor(red);
                    }
                }
                if (k==4) {
                    if (z == a / c) {
                        testrez++;
                        btn1.setBackgroundColor(green);
                    } else {
                        btn1.setBackgroundColor(red);
                    }
                }
                k++;
                if (k==5) {
                    k=1;
                }

        }

        if (view.getId() == R.id.button53) {

            h1 = btn2.getText().toString();
            z = Integer.parseInt(h1);
            btnnext.setEnabled(true);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            h = tx2.getText().toString();
            a1 =""+h.charAt(0);
            a2=""+h.charAt(1);
            a3=""+h.charAt(3);
            a = Integer.parseInt(a1);
            b = Integer.parseInt(a2);
            c = Integer.parseInt(a3);
            a = a * 10 + b;


            if (k==1) {
                if (z == a + c) {
                    testrez++;
                    btn2.setBackgroundColor(green);
                }
                else {
                    btn2.setBackgroundColor(red);
                }
            }
            if (k == 2) {
                if (z == a - c) {
                    testrez++;
                    btn2.setBackgroundColor(green);
                }
                else {
                    btn2.setBackgroundColor(red);
                }
            }
            if (k== 3) {
                if (z == a * c) {
                    testrez++;
                    btn2.setBackgroundColor(green);
                } else {
                    btn2.setBackgroundColor(red);
                }
            }
            if (k==4) {
                if (z == a / c) {
                    testrez++;
                    btn2.setBackgroundColor(green);
                } else {
                    btn2.setBackgroundColor(red);
                }
            }
            k++;
            if (k==5) {
                k=1;
            }


        }

        if (view.getId() == R.id.button54) {
            h1 = btn3.getText().toString();
            z = Integer.parseInt(h1);
            btnnext.setEnabled(true);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            h = tx2.getText().toString();
            a1 =""+h.charAt(0);
            a2=""+h.charAt(1);
            a3=""+h.charAt(3);
            a = Integer.parseInt(a1);
            b = Integer.parseInt(a2);
            c = Integer.parseInt(a3);
            a = a * 10 + b;


            if (k==1) {
                if (z == a + c) {
                    testrez++;
                    btn3.setBackgroundColor(green);
                }
                else {
                    btn3.setBackgroundColor(red);
                }
            }
            if (k == 2) {
                if (z == a - c) {
                    testrez++;
                    btn3.setBackgroundColor(green);
                }
                else {
                    btn3.setBackgroundColor(red);
                }
            }
            if (k== 3) {
                if (z == a * c) {
                    testrez++;
                    btn3.setBackgroundColor(green);
                } else {
                    btn3.setBackgroundColor(red);
                }
            }
            if (k==4) {
                if (z == a / c) {
                    testrez++;
                    btn3.setBackgroundColor(green);
                } else {
                    btn3.setBackgroundColor(red);
                }
            }
            k++;
            if (k==5) {
                k=1;
            }

        }

        if (view.getId() == R.id.button55) {
            h1 = btn4.getText().toString();
            z = Integer.parseInt(h1);
            btnnext.setEnabled(true);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            h = tx2.getText().toString();
            a1 =""+h.charAt(0);
            a2=""+h.charAt(1);
            a3=""+h.charAt(3);
            a = Integer.parseInt(a1);
            b = Integer.parseInt(a2);
            c = Integer.parseInt(a3);
            a = a * 10 + b;


            if (k==1) {
                if (z == a + c) {
                    testrez++;
                    btn4.setBackgroundColor(green);
                }
                else {
                    btn4.setBackgroundColor(red);
                }
            }

            if (k == 2) {
                if (z == a - c) {
                    testrez++;
                    btn4.setBackgroundColor(green);
                }
                else {
                    btn4.setBackgroundColor(red);
                }
            }
            if (k== 3) {
                if (z == a * c) {
                    testrez++;
                    btn4.setBackgroundColor(green);
                } else {
                    btn4.setBackgroundColor(red);
                }
            }
            if (k==4) {
                if (z == a / c) {
                    testrez++;
                    btn4.setBackgroundColor(green);
                } else {
                    btn4.setBackgroundColor(red);
                }
            }
            k++;
            if (k==5) {
                k=1;
            }
        }


        if (view.getId() == R.id.next) {
            tx1.setText("Вопос  "+j+"/10");
            j++;
            btnnext.setEnabled(false);
            btn1.setBackgroundColor(white);
            btn2.setBackgroundColor(white);
            btn3.setBackgroundColor(white);
            btn4.setBackgroundColor(white);
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);

            if (temp==1) {
                xndrihamar = (int) (Math.random() * items1.length);
                tx2.setText(items1[xndrihamar]);
                btn1.setText(answer1[xndrihamar*4]+"");
                btn2.setText(answer1[xndrihamar*4+1]+"");
                btn3.setText(answer1[xndrihamar*4+2]+"");
                btn4.setText(answer1[xndrihamar*4+3]+"");



            }

            if (temp==2) {
                xndrihamar = (int) (Math.random() * items2.length);

                tx2.setText(items2[xndrihamar]);
                btn1.setText(answer2[xndrihamar*4]+"");
                btn2.setText(answer2[xndrihamar*4+1]+"");
                btn3.setText(answer2[xndrihamar*4+2]+"");
                btn4.setText(answer2[xndrihamar*4+3]+"");


            }
           if (temp==3) {
                xndrihamar = (int) (Math.random() * items3.length);
                tx2.setText(items3[xndrihamar]);
                btn1.setText(answer3[xndrihamar*4]+"");
                btn2.setText(answer3[xndrihamar*4+1]+"");
                btn3.setText(answer3[xndrihamar*4+2]+"");
                btn4.setText(answer3[xndrihamar*4+3]+"");


            }
            if (temp==4) {
                xndrihamar = (int) (Math.random() * items4.length);
                tx2.setText(items4[xndrihamar]);
                btn1.setText(answer4[xndrihamar*4]+"");
                btn2.setText(answer4[xndrihamar*4+1]+"");
                btn3.setText(answer4[xndrihamar*4+2]+"");
                btn4.setText(answer4[xndrihamar*4+3]+"");



            }
            temp++;
            if (temp==5){
                temp=1;
            }

            if (j==11) {
             String str = testrez+"";
                Intent intent = new Intent(this, Testiardyunq.class);
                intent.putExtra("chjnjel", str);
                startActivity(intent);
                testrez=0;
                j=1;
            }

        }


}


}