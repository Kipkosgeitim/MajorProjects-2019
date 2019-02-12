package com.example.timoo.intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {
    Button btnCall;
    EditText numText;
    String sNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btnCall = findViewById(R.id.idbtncall);
        numText = findViewById(R.id.idbtntext);

    }
    public void btnCall(View view){
        Intent i = new Intent(Intent.ACTION_DIAL);
        sNum=numText.getText().toString();
        if(sNum.trim().isEmpty()){
            i.setData(Uri.parse("tel:0710131076"));

        }
        else {
            i.setData(Uri.parse("tel:"+sNum));
        }
        startActivity(i);
    }
}
