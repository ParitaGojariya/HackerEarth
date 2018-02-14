package com.example.asus.hackerearth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class integrated extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integrated);
    }

    public void IntOne(View view) {
        startActivity(new Intent(this,IntOne.class));
    }

    public void IntTwo(View view) {
        startActivity(new Intent(this,IntTwo.class));
    }

    public void IntThree(View view) { startActivity(new Intent(this,IntThree.class));}
}
