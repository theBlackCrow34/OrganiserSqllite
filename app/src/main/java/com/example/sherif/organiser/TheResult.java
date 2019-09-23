package com.example.sherif.organiser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TheResult extends AppCompatActivity {

    DBHelper myDB;
    ListView lstt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_result);
        myDB = new DBHelper(this);
        lstt = (ListView) findViewById(R.id.lstt);
        raedAllDataArray();
    }
    public void raedAllDataArray(){
        ArrayList<String> listData = myDB.getAllRecordArray();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,listData);
        lstt.setAdapter(arrayAdapter);
    }
}
