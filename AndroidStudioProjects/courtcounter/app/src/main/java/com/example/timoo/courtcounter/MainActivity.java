package com.example.timoo.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int scoreForTeamA;
    int scoreForTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void displayTeamA(int score){
        TextView obj=(TextView)findViewById(R.id.view);
        obj.setText(String.valueOf(score));

    }

    public void addthree(View view){
        scoreForTeamA=scoreForTeamA+3;
        displayTeamA(scoreForTeamA);
    }
    public void addtwo(View view){
        scoreForTeamA=scoreForTeamA+2;
        displayTeamA(scoreForTeamA);
    }
    public void addone(View view){
        scoreForTeamA=scoreForTeamA+1;
        displayTeamA(scoreForTeamA);
    }

    public void displayTeamB(int score){
        TextView obj1=(TextView)findViewById(R.id.view2);
        obj1.setText(String.valueOf(score));

    }
    public void addthreeB(View view){
        scoreForTeamB=scoreForTeamB+3;
        displayTeamB(scoreForTeamB);
    }
    public void addtwoB(View view){
        scoreForTeamB=scoreForTeamB+2;
        displayTeamB(scoreForTeamB);
    }
    public void addoneB(View view){
        scoreForTeamB=scoreForTeamB+1;
        displayTeamB(scoreForTeamB);
    }
    public void resetScore(View view){
        scoreForTeamA=0;
        scoreForTeamB=0;
        displayTeamA(scoreForTeamA);
        displayTeamB(scoreForTeamB);

    }
    public void resultScore(View view){
        if (scoreForTeamA>scoreForTeamB){
            Toast.makeText(this, "team A have won with: "+scoreForTeamA, Toast.LENGTH_SHORT).show();
        }
        else if(scoreForTeamA==scoreForTeamB) {
            Toast.makeText(this, "DRAW ", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "team B have won with: "+scoreForTeamB, Toast.LENGTH_SHORT).show();
        }
    }
}
