package com.example.timoo.intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.textView);
        String name=getIntent().getStringExtra("name");
        textView.setText(name);

    }
}
