package com.example.danie.nameapp_v4;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addDefaultNames();

        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        String ownerName = sharedPref.getString("owner_name", "Default");

        if (ownerName.equals("Default")) {
            startActivity(new Intent(this, RegisterOwnerActivity.class));
        }
    }

    public void onClickName(View v) {
        startActivity(new Intent(this, NameActivity.class));
    }

    public void onClickPicture(View v) {
        startActivity(new Intent(this, PictureActivity.class));
    }

    public void onClickLearning(View v) {
        startActivity(new Intent(this, LearningActivity.class));
    }

    private void addDefaultNames() {
        ((GlobalClass) this.getApplication()).addName("Daniel", "android.resource://" + getClass().getPackage().getName() + "/drawable/daniel");
        ((GlobalClass) this.getApplication()).addName("Abdella", "android.resource://" + getClass().getPackage().getName() + "/drawable/abdella");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.owner_info:
                startActivity(new Intent(this, RegisterOwnerActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
