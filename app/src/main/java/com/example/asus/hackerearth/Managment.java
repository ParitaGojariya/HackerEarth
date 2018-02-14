package com.example.asus.hackerearth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Managment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_managment);
    }

    public void mba(View view) {
        startActivity(new Intent(this,mba.class));
    }

    public void bba(View view) {
        startActivity(new Intent(this,bba.class));
    }
}
