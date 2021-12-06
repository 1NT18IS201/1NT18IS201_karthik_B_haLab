package com.example.app_04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,submit,del;
    EditText input;
    String number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b3 = (Button) findViewById(R.id.button3);
        b2 = (Button) findViewById(R.id.button2);
        b1 = (Button) findViewById(R.id.button1);
        b6 = (Button) findViewById(R.id.button6);
        b5 = (Button) findViewById(R.id.button5);
        b4 = (Button) findViewById(R.id.button4);
        b9 = (Button) findViewById(R.id.button9);
        b8 = (Button) findViewById(R.id.button8);
        b7 = (Button) findViewById(R.id.button7);
        b0 = (Button) findViewById(R.id.button0);
        submit = (Button) findViewById(R.id.buttonsub);
        del = (Button) findViewById(R.id.buttondel);
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
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //input.setText(input.getText() + );
                String str = input.getText() + "";
                int len = str.length();
                input.setText(str.substring(0, len - 1));

            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = input.getText().toString();
                Intent it = new Intent(Intent.ACTION_DIAL);
                it.setData(Uri.parse("tel:" +  number));
                startActivity(it);
            }
        });

    }
}