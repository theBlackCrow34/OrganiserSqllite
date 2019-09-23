package com.example.sherif.organiser;

import android.content.Context;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.Calendar;
import java.util.List;

public class CursorAdapter extends ArrayAdapter<Items>{

    int wewe_green = Integer.parseInt("4CAF50", 16)+0xFF000000;
    int bad_red = Integer.parseInt("D50000", 16)+0xFF000000;
    int good_blue = Integer.parseInt("03A9F4", 16)+0xFF000000;
    final int calendarDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

    Context context;
    int resource;

    public CursorAdapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView  = LayoutInflater.from(context).inflate(resource,parent,false);

        TextView tvName = (TextView) convertView.findViewById(R.id.date);
        TextView tvPhone = (TextView) convertView.findViewById(R.id.result);

        TextView tvsa = (TextView) convertView.findViewById(R.id.tv_sa);
        TextView tvaz = (TextView) convertView.findViewById(R.id.tv_az_sa);
        TextView tvazn = (TextView) convertView.findViewById(R.id.tv_az_na);
        TextView tvazsab = (TextView) convertView.findViewById(R.id.tv_az_sab);
        TextView tvazmas = (TextView) convertView.findViewById(R.id.tv_az_mas);
        TextView tvwo = (TextView) convertView.findViewById(R.id.tv_wod);
        TextView tvwe = (TextView) convertView.findViewById(R.id.tv_sa_wet);
        TextView tvdo = (TextView) convertView.findViewById(R.id.tv_sa_do);
        TextView tvq = (TextView) convertView.findViewById(R.id.tv_q);
        TextView tvson = (TextView) convertView.findViewById(R.id.tv_so);

        Items currentContact = getItem(position);
        tvName.setText(currentContact.getDate());
        tvPhone.setText(String.valueOf(currentContact.getResult())+"%");

        tvaz.setText(currentContact.getAzkar()+"%");
        tvazmas.setText(currentContact.getMasaa()+"%");
        tvazn.setText(currentContact.getAzkarNawm()+"%");
        tvazsab.setText(currentContact.getSabah()+"%");
        tvdo.setText(currentContact.getDohaa()+"%");
        tvq.setText(currentContact.getqouraan()+"%");
        tvsa.setText(currentContact.getSalah()+"%");
        tvson.setText(currentContact.getsonan()+"%");
        tvwo.setText(currentContact.getwodoo()+"%");
        tvwe.setText(currentContact.getweter()+"%");


        return convertView;
    }
}
