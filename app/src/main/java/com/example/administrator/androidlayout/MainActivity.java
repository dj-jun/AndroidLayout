package com.example.administrator.androidlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button myBtn_one;
    private Button myBtn_two;
    private Button myBtn_three;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button);
        myBtn_one = (Button)findViewById(R.id.btn_one);
        myBtn_two = (Button)findViewById(R.id.btn_two);
        myBtn_three = (Button)findViewById(R.id.btn_three);
        myBtn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LinearLayoutActivity.class);
                startActivity(intent);
            }
        });
        myBtn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RelativeLayoutActivity.class);
                startActivity(intent);
            }
        });
        myBtn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TableLayoutActivity.class);
                startActivity(intent);
            }
        });
    }
}
