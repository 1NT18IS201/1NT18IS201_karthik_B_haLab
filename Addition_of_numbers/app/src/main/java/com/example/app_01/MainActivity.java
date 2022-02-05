package com.example.app_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    Button Add;
    TextView result;
    int sum = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.editTextNumberDecimal);
        num2 = (EditText) findViewById(R.id.editTextNumberDecimal2);
        Add = (Button) findViewById(R.id.button3);
        result = (TextView) findViewById(R.id.textView3);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());

                sum = a + b;
                result.setText(Integer.toString(sum));
                Intent i = new Intent(getApplicationContext(), Result.class);
                i.putExtra("Answer", Integer.toString(sum));
                startActivity(i);
            }
        });
    }


}