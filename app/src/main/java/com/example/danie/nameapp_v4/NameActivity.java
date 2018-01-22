package com.example.danie.nameapp_v4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);


        ArrayList<String> names = new ArrayList<>();
        for (String n:new String[]{"name1","name2","name3"}) {
            names.add(n);
        }


        ArrayAdapter adapter = new ArrayAdapter<String>( this, R.layout.activity_name , names);

        ListView namesList = (ListView) findViewById(R.id.namesList);
        namesList.setAdapter(adapter);

        namesList.setOnItemClickListener(
                
        );

    }
}
