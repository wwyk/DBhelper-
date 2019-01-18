package com.example.hp.zixun;

/**
 * Created by HP on 2018/9/19.
 */

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.hp.zixun.model.Tzgg;

import java.util.List;

public class Adapter extends ArrayAdapter<Tzgg> {

    private int resourceId;

    public Adapter(@NonNull Context context, int textViewResourceId, @NonNull List<Tzgg> objects) {
        super(context, textViewResourceId, objects);
        this.resourceId = textViewResourceId;
    }




    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Tzgg tzgg = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        TextView TzggTitle = (TextView)view.findViewById(R.id.title);
        TextView TzggDatetime = (TextView)view.findViewById(R.id.datetime);

        TzggTitle.setText(tzgg.getTitle());
        TzggDatetime.setText(tzgg.getDatetime());

        return view;
    }
}
