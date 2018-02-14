package com.example.asus.hackerearth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Engineering extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering);
    }

    public void btech(View view) {
        startActivity(new Intent(this,btech.class));
    }

    public void integrated(View view) {
        startActivity(new Intent(this,integrated.class));
    }
}
