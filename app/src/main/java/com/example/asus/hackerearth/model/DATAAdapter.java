package com.example.asus.hackerearth.model;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.asus.hackerearth.R;

import java.util.List;

/**
 * Created by Infinity on 14-02-2018.
 */

public class DATAAdapter extends ArrayAdapter<DATA> {
    private Activity context;
    private List<DATA> infoList;
    private String userid;

    public DATAAdapter(Activity context, List<DATA> profileList)
    {
        super(context, R.layout.dataxml, profileList);
        this.context=context;
        this.infoList = profileList;
        this.userid = userid;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.dataxml,null,true);

        TextView txtName = (TextView) listViewItem.findViewById(R.id.namedata);
        TextView texttotalpro = (TextView)listViewItem.findViewById(R.id.msgdata);

        DATA u = infoList.get(position);
        txtName.setText(u.getName());
        texttotalpro.setText(u.getMsg());

        return listViewItem;
    }

}

