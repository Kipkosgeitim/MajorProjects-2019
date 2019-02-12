package com.example.timoo.hell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText number1, number2;
    Button add, sub,mul,div;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.num1);
        number2 = findViewById(R.id.num2);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        textView = findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=number1.getText().toString();
                String value2=number2.getText().toString();
                if(value1.isEmpty() && value2.isEmpty()){

                    Toast.makeText(MainActivity.this, "please enter a number", Toast.LENGTH_LONG).show();
                }else{
                    int numb1=Integer.parseInt(value1);
                    int numb2=Integer.parseInt(value2);
                    int result=numb1+numb2;
                    textView.setText("The result is "+result);

                }


            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=number1.getText().toString();
                String value2=number2.getText().toString();
                if(value1.isEmpty() && value2.isEmpty()){
                    Toast.makeText(MainActivity.this, "please enter a number", Toast.LENGTH_LONG).show();
                }else{

                    int numb1=Integer.parseInt(value1);
                    int numb2=Integer.parseInt(value2);
                    int result=numb1-numb2;
                    textView.setText("The result is "+result);
                }


            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = number1.getText().toString();
                String value2 = number2.getText().toString();
                if (value1.isEmpty() && value2.isEmpty()) {

                    Toast.makeText(MainActivity.this, "please enter a number", Toast.LENGTH_LONG).show();
                } else {
                    int numb1 = Integer.parseInt(value1);
                    int numb2 = Integer.parseInt(value2);
                    int result = numb1 * numb2;
                    textView.setText("The result is " + result);

                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=number1.getText().toString();
                String value2=number2.getText().toString();
                if(value1.isEmpty() && value2.isEmpty()){
                    Toast.makeText(MainActivity.this, "please enter a number", Toast.LENGTH_LONG).show();
                }else{

                    int numb1=Integer.parseInt(value1);
                    int numb2=Integer.parseInt(value2);
                    int result=numb1/numb2;
                    textView.setText("The result is "+result);
                }
            }
        });


        }
    }

