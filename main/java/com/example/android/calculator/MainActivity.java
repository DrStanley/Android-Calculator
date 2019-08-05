package com.example.android.calculator;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Stanley on 28/9/2018.
 * Phone Number 08182878405
 */
public class MainActivity extends AppCompatActivity {
    //variable declarations
    String sign;
    Double total1 = 0.0, total2 = 0.0;
    //widget declarations
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;
    Button bdiv;
    Button bmul;
    Button bmin;
    Button bpoint;
    Button pl, equalto;
    Button cls;
    TextView see;

// A method used to find all hte views in this program
    private void show() {
        b1 = (Button) findViewById(R.id.n1);
        b2 = (Button) findViewById(R.id.n2);
        b3 = (Button) findViewById(R.id.n3);
        b4 = (Button) findViewById(R.id.n4);
        b5 = (Button) findViewById(R.id.n5);
        b6 = (Button) findViewById(R.id.n6);
        b7 = (Button) findViewById(R.id.n7);
        b8 = (Button) findViewById(R.id.n8);
        b9 = (Button) findViewById(R.id.n9);
        b0 = (Button) findViewById(R.id.n0);
        bdiv = (Button) findViewById(R.id.divs);
        bmul = (Button) findViewById(R.id.mu);
        bmin = (Button) findViewById(R.id.min);
        cls = (Button) findViewById(R.id.clsB);
        bpoint = (Button) findViewById(R.id.point);
        pl = (Button) findViewById(R.id.plus);
        see = (TextView) findViewById(R.id.it);
        equalto = (Button) findViewById(R.id.equ);
        //calling the onclick listener for all buttons 1-0 and +-*/.
        listen();

    }
//    this method is used to know the operator used in the calculations
    private void operator(String ops) {
        this.sign = ops;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show();

    }

//    the onclick listener method that contains all the onclick.L for this program
    public void listen() {
        try {

//            these onclick.L sets the number pressed to the display area
            b1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    see.setText(see.getText().toString() + "1");
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    see.setText(see.getText().toString() + "2");
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    see.setText(see.getText().toString() + "3");
                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    see.setText(see.getText().toString() + "4");
                }
            });
            b5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    see.setText(see.getText().toString() + "5");
                }
            });
            b6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    see.setText(see.getText().toString() + "6");
                }
            });
            b7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    see.setText(see.getText().toString() + "7");
                }
            });
            b8.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    see.setText(see.getText().toString() + "8");
                }
            });
            b9.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    see.setText(see.getText().toString() + "9");
                }
            });
            b0.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    see.setText(see.getText().toString() + "0");
                }
            });
            bpoint.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    see.setText(see.getText().toString() + ".");
                }
            });
            b1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    see.setText(see.getText().toString() + "1");
                }
            });
            cls.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    see.setText("");

                }
            });
//            from here the onclick.L for the signs
            bmin.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    operator(bmin.getText().toString());

                    total1 = total1 + Double.parseDouble(see.getText().toString());
                    see.setText("");
                    System.out.println(total1 + " this is total1");


                }
            });
            pl.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    operator(pl.getText().toString());
                    total1 = total1 + Double.parseDouble(see.getText().toString());
                    see.setText("");
                    System.out.println(total1 + " this is total1");

                }
            });
            bdiv.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    operator(bdiv.getText().toString());
                    total1 = total1 + Double.parseDouble(see.getText().toString());
                    see.setText("");
                    System.out.println(total1 + " this is total1");

                }
            });
            bmul.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    operator(bmul.getText().toString());
                    total1 = total1 + Double.parseDouble(see.getText().toString());
                    see.setText("");

                    System.out.println(total1 + " this is total1");
                }
            });

            equalto.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    System.out.println(total1 + "  before this is total1");

                    switch (sign) {
                        case "+":
                            System.out.println(total1 + " this is total1");
                            total2 = total1 + Double.parseDouble(see.getText().toString());
                            see.setText(Double.toString(total2));
                            total1 = 0.0;
                            break;
                        case "-":
                            System.out.println(total1 + " this is total1");

                            total2 = total1 - Double.parseDouble(see.getText().toString());
                            see.setText(Double.toString(total2));
                            total1 = 0.0;
                            break;
                        case "*":
                            System.out.println(total1 + " this is total1");
                            total2 = total1 * Double.parseDouble(see.getText().toString());
                            see.setText(Double.toString(total2));
                            total1 = 0.0;
                            break;
                        case "/":
                            System.out.println(total1 + " this is total1");

                            total2 = total1 / Double.parseDouble(see.getText().toString());
                            see.setText(Double.toString(total2));
                            total1 = 0.0;
                            break;

                    }

                }
            });


        } catch (ArithmeticException e) {
            Toast.makeText(MainActivity.this, "Incorrect input", Toast.LENGTH_SHORT).show();
        }
    }
}