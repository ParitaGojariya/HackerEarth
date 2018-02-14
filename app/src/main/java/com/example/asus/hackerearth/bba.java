package com.example.asus.hackerearth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class bba extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bba);
    }
    public void bbaOne(View view){
        startActivity(new Intent(this,bbaOne.class));
    }

    public void bbaTwo(View view) {
        startActivity(new Intent(this,bbaTwo.class));
    }

    public void bbaThree(View view) {
        startActivity(new Intent(this,bbaThree.class));
    }
}
