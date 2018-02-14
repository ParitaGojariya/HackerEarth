package com.example.asus.hackerearth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class health extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);
    }

    public void anm(View view) {
        startActivity(new Intent(this,anm.class));
    }

    public void gnm(View view) {
        startActivity(new Intent(this,gnm.class));
    }

    public void mlt(View view) {
        startActivity(new Intent(this,mlt.class));
    }

    public void optometry(View view) {
        startActivity(new Intent(this,optometry.class));
    }
}
