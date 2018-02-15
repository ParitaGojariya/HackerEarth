package com.example.asus.hackerearth;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.asus.hackerearth.model.DATA;
import com.example.asus.hackerearth.model.DATAAdapter;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class mltTwo extends AppCompatActivity {

    ListView listView;
    List<DATA> user;
    Button button_send;
    EditText editText_editdata;
    FirebaseAuth auth = FirebaseAuth.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mlt_two);

        button_send = (Button)findViewById(R.id.send);
        editText_editdata = (EditText)findViewById(R.id.editdata);

        user = new ArrayList<DATA>();
        listView = (ListView)findViewById(R.id.List_View);

        getusers();

        button_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DATA data = new DATA();
                data.setName(auth.getCurrentUser().getDisplayName());
                data.setMsg(editText_editdata.getText().toString().trim());
                FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
                DatabaseReference myref = firebaseDatabase.getReference().child("MLTTWO");

                myref.push().setValue(data).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        editText_editdata.setText("");
                    }
                });
            }
        });
    }

    public void getusers(){
        final FirebaseDatabase fd = FirebaseDatabase.getInstance();
        DatabaseReference myref = fd.getReference().child("MLTTWO");
        myref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                fetchData(dataSnapshot);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    private void fetchData(DataSnapshot dataSnapshot)
    {
        user.clear();
        for (DataSnapshot ds : dataSnapshot.getChildren())
        {
            DATA a = ds.getValue(DATA.class);
            user.add(a);
        }
        DATAAdapter adapter = new DATAAdapter(mltTwo.this,user);
        listView.setAdapter(adapter);
    }
}
