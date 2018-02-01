package com.example.danie.nameapp_v4;

import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RegisterOwnerActivity extends AppCompatActivity {

    SharedPreferences.OnSharedPreferenceChangeListener listener = (prefs, key) -> {
        TextView tv = findViewById(R.id.textView8);
        tv.setText(prefs.getString("owner_name", "Default"));
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_owner);
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        sharedPref.registerOnSharedPreferenceChangeListener(listener);
        setValues();
        setPicture();
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        sharedPref.unregisterOnSharedPreferenceChangeListener(listener);
    }

    public void setValues() {
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        String ownerName = sharedPref.getString("owner_name", "Default");

        TextView tv = findViewById(R.id.textView8);

        if (ownerName.equals("Default")) {
            tv.setText("No owner name is set");
        } else {
            tv.setText(ownerName);
        }
    }

    private void setPicture() { // throws RuntimeException,InterruptedException
        ImageView iv = findViewById(R.id.imageView2);



        new Thread(new Runnable() {
            public void run() {

                iv.post(new Runnable() {
                    public void run() {
                        FileInputStream fis = null;
                        try {
                            fis = openFileInput("ownerPicture");

                        } catch (FileNotFoundException e) {
                            e.printStackTrace();

                        }
                        iv.setImageBitmap(BitmapFactory.decodeStream(fis));

                    }
                });
            }
        }).start();




    }

    public void onClickDone(View v) {
        finish();
    }
}
