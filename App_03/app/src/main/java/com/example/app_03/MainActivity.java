package com.example.app_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,add,sub,mul,eq,div,clr;
    EditText input;
    boolean fadd = false, fsub = false, fmul = false, fdiv = false;
    Float op1,op2,ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = (Button) findViewById(R.id.buttonadd);
        b3 = (Button) findViewById(R.id.button3);
        b2 = (Button) findViewById(R.id.button2);
        b1 = (Button) findViewById(R.id.button1);
        sub = (Button) findViewById(R.id.buttonsub);
        b6 = (Button) findViewById(R.id.button6);
        b5 = (Button) findViewById(R.id.button5);
        b4 = (Button) findViewById(R.id.button4);
        mul = (Button) findViewById(R.id.buttonmul);
        b9 = (Button) findViewById(R.id.button9);
        b8 = (Button) findViewById(R.id.button8);
        b7 = (Button) findViewById(R.id.button7);
        eq = (Button) findViewById(R.id.buttoneq);
        div = (Button) findViewById(R.id.buttondiv);
        b0 = (Button) findViewById(R.id.button0);
        clr = (Button) findViewById(R.id.buttonclr);
        input = (EditText) findViewById(R.id.input);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "1");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "0");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "9");
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText("");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op1 = Float.parseFloat(input.getText() + "");
                fadd = true;
                input.setText("");
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op1 = Float.parseFloat(input.getText() + "");
                fsub = true;
                input.setText("");
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op1 = Float.parseFloat(input.getText() + "");
                fmul = true;
                input.setText("");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op1 = Float.parseFloat(input.getText() + "");
                fdiv = true;
                input.setText("");
            }
        });

        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op2 = Float.parseFloat(input.getText() + "");
                if(fadd == true)
                {
                    ans = op1 + op2;
                    fadd = false;
                }
                else if(fsub == true)
                {
                    ans = op1 - op2;
                    fsub = false;
                }
                else if(fmul == true)
                {
                    ans = op1 * op2;
                    fmul = false;
                }
                else if(fdiv == true)
                {
                    ans = op1 / op2;
                    fdiv = false;
                }

                input.setText(Float.toString(ans));
            }
        });
    }
}