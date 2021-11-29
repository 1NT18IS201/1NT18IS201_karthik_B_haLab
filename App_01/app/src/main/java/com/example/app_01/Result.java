package com.example.app_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Result extends AppCompatActivity {

    TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        answer = (TextView) findViewById(R.id.result_text);
        Bundle extras = getIntent().getExtras();
        String ans = extras.getString("Answer");
        Toast.makeText(getApplicationContext(),ans,Toast.LENGTH_SHORT).show();
        answer.setText(ans);
    }
}