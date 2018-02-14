package com.example.asus.hackerearth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class gnm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gnm);
    }

    public void gnmOne(View view) { startActivity(new Intent(this,gnmOne.class));
    }

    public void gnmTwo(View view) { startActivity(new Intent(this,gnmTwo.class));
    }

    public void gnmThree(View view) { startActivity(new Intent(this,gnmThree.class));
    }
}
