package com.example.asus.hackerearth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class indchemistry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indchemistry);
    }


    public void indcheOne(View view) {
        startActivity(new Intent(this,indcheOne.class));
    }

    public void indcheTwo(View view) {
        startActivity(new Intent(this,indcheTwo.class));
    }

    public void indcheThree(View view) {
        startActivity(new Intent(this,indcheThree.class));
    }
}
