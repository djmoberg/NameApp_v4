package com.example.danie.nameapp_v4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addDefaultNames();
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
}
