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
    }

    public void onClickName(View v) {
        startActivity(new Intent(this, NameActivity.class));
    }

    public void onClickPicture(View v) {
        startActivity(new Intent(this, NameActivity.class));
    }

    public void onClickLearning(View v) {
        startActivity(new Intent(this, NameActivity.class));
    }
}
