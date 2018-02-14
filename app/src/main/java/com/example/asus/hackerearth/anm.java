package com.example.asus.hackerearth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class anm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anm);
    }

    public void anmOne(View view) { startActivity(new Intent(this,anmOne.class));
    }

    public void anmTwo(View view) { startActivity(new Intent(this,anmTwo.class));
    }
}
