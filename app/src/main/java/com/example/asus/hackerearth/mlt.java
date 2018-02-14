package com.example.asus.hackerearth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mlt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mlt);
    }

    public void mltOne(View view) {
        startActivity(new Intent(this,mltOne.class));
    }

    public void mltTwo(View view) {
        startActivity(new Intent(this,mltOne.class));
    }

    public void mltThree(View view) {
        startActivity(new Intent(this,mltThree.class));
    }
}
