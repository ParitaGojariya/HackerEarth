package com.example.asus.hackerearth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mba extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mba);
    }

    public void mbaOne(View view) {
        startActivity(new Intent(this,mbaOne.class));
    }

    public void mbaTwo(View view) {
        startActivity(new Intent(this,mbaTwo.class));
    }

    public void mbaThree(View view) {
        startActivity(new Intent(this,mbaThree.class));
    }
}
