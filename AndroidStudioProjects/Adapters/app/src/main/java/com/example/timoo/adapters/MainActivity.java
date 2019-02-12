package com.example.timoo.adapters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    String[] dc={"flash","Arrow","SuperGirl","BatMan","SuperMan","Atom","WonderWoman","Aquarman","Cybogd","Joker","Killerfrost","Zoom","ReverseFlash","Captain"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView) findViewById(R.id.idListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,dc);
        lv.setAdapter(adapter);
        //setting onClickListener on listView
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "item Clicked"+i, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
