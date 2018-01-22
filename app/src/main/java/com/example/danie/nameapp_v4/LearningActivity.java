package com.example.danie.nameapp_v4;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;



public class LearningActivity extends AppCompatActivity {

    private int score = 0;
    ArrayList<String> nameArray;
    private String nameRND;
    private Uri uriRND;
    private int rand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);
        nameArray = ((GlobalClass) this.getApplication()).getNames();
        score = 0;

        restAllFields();

        Button learningCheckButton =(Button)findViewById( R.id.learningCheckButton);
        learningCheckButton.setOnClickListener((view)->{
            checkAnswer();
        });

    }

    public void restAllFields(){
        rand = uniqueRand(rand);
        nameRND = nameArray.get(rand);
        uriRND = ((GlobalClass) getApplication()).getUri(nameRND);

        ImageView learningImageView = (ImageView) findViewById(R.id.learningImageView);
        learningImageView.setImageURI(uriRND);

        EditText learningInputEditeTxt = (EditText) findViewById(R.id.learningInputEditeTxt);
        learningInputEditeTxt.setText("");

        TextView learningScoreTxtView = (TextView) findViewById(R.id.learningScoreTxtView);
        learningScoreTxtView.setText(""+score);

    }

    public void checkAnswer(){
        EditText learningInputEditeTxt = (EditText) findViewById(R.id.learningInputEditeTxt);
        String answer = learningInputEditeTxt.getText().toString();
        String msg = "<font color='#e3f2fd' ><b> Feil </b></font>";


        if(answer!=null && answer.equals(nameRND)){
            score ++;
            TextView learningScoreTxtView = (TextView) findViewById(R.id.learningScoreTxtView);
            learningScoreTxtView.setText(""+score);
            msg="rett!";
        }

        Toast toast = Toast.makeText(this, Html.fromHtml("<font color='#e3f2fd' ><b> Feil </b></font>"), Toast.LENGTH_SHORT);
        toast.show();

        restAllFields();

    }

    public int uniqueRand(int oldRand){
        int newRand = ThreadLocalRandom.current().nextInt(0,nameArray.size());
        System.out.println(newRand + "    " +oldRand);
        if (newRand == oldRand)
            newRand = uniqueRand(oldRand);
        return newRand;
    }

}
