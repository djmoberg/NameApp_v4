package com.example.danie.nameapp_v4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.name_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuAdd:
                startActivity(new Intent(this, AddPersonActivity.class));
                return true;
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
