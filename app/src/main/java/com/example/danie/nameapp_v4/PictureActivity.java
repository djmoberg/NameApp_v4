package com.example.danie.nameapp_v4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PictureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);


        Arraylist<Uri> pictures = new ArrayList<Uri>();


        ListView namesList = (ListView) findViewById(R.id.namesList);
        namesList.setAdapter(adapter);

        namesList.setOnItemClickListener((adapterView , view , pos , id)->{
            Intent intent = new Intent(NameActivity.this , ShowPersonActivity.class);
            intent.putExtra("name", names.get(pos));
            startActivity(intent);
        });

    }
}
