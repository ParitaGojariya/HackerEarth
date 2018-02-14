package com.example.asus.hackerearth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class btech extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech);
    }

    public void btechOne(View view) {
        startActivity(new Intent(this,btechOne.class));
    }

    public void btechTwo(View view) {
        startActivity(new Intent(this,btechTwo.class));
    }

    public void btechThree(View view) {
        startActivity(new Intent(this,btechThree.class));
    }

    public void btechFour(View view){
        startActivity(new Intent(this,btechFour.class));
    }
}
