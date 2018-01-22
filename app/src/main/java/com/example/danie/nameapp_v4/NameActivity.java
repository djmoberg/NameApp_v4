package com.example.danie.nameapp_v4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);


        ArrayList<String> names = ((GlobalClass) this.getApplication()).getNames();


        ArrayAdapter<String> adapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1 , names);

        ListView namesList = (ListView) findViewById(R.id.namesList);
        namesList.setAdapter(adapter);

        namesList.setOnItemClickListener((adapterView , view , pos , id)->{
            Intent intent = new Intent(NameActivity.this , ShowPersonActivity.class);
            intent.putExtra("name", names.get(pos));
            startActivity(intent);
                });


    }

    public void onClickAddPerson(View v) {
        startActivity(new Intent(this, AddPersonActivity.class));
    }
}
