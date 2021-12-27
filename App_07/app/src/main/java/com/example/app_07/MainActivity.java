package com.example.app_07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int images[] = {R.drawable.resource_super, R.drawable._821316, R.drawable.samus};
    int  i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = (ImageView) findViewById(R.id.img);
        Button but = (Button) findViewById(R.id.switch_but);
        img.setImageResource(images[2]);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageResource(images[i]);
                i++;
                if(i==3)
                    i = 0;
            }
        });
    }
}