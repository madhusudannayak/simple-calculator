package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText fistnumber,secondnumber;
    Button add,sub,mul,div;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fistnumber=(EditText) findViewById(R.id.firstnumber);
        secondnumber=(EditText)findViewById(R.id.secondnumber);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);
        result=(TextView ) findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a1=Double.valueOf(fistnumber.getText().toString());
                double b2=Double.valueOf(secondnumber.getText().toString());
                double c3=a1+b2;
                result.setText(String.valueOf(c3));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a,b,d;
                a=Integer.parseInt(fistnumber.getText().toString());
                b=Integer.parseInt(secondnumber.getText().toString());
                d=a-b;
                result.setText(String.valueOf(d));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a,b,d;
                a=Integer.parseInt(fistnumber.getText().toString());
                b=Integer.parseInt(secondnumber.getText().toString());
                d=a*b;
                result.setText(String.valueOf(d));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a,b,d;
                a=Integer.parseInt(fistnumber.getText().toString());
                b=Integer.parseInt(secondnumber.getText().toString());
                d=a/b;
                result.setText(String.valueOf(d));
            }
        });



    }
}