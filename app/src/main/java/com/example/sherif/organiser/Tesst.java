package com.example.sherif.organiser;

import android.app.LoaderManager;
import android.content.CursorLoader;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Tesst extends AppCompatActivity {

    ListView lst;
    DBHelper myDB;
    TextView tvResult,tvDate;
    int wewe_green = Integer.parseInt("4CAF50", 16)+0xFF000000;
    int bad_red = Integer.parseInt("D50000", 16)+0xFF000000;
    int good_blue = Integer.parseInt("03A9F4", 16)+0xFF000000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tesst);
        ListView petListView = (ListView) findViewById(R.id.list);
        tvResult = (TextView) findViewById(R.id.result);
        tvDate = (TextView) findViewById(R.id.date);

        lst = (ListView) findViewById(R.id.list);
        myDB = new DBHelper(this);

        ArrayList<Items> contacts = myDB.gettwo();

        CursorAdapter contactAdapter = new CursorAdapter(this,R.layout.list_item,contacts);
        lst.setAdapter(contactAdapter);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu options from the res/menu/menu_editor.xml file.
        // This adds menu items to the app bar.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // User clicked on a menu option in the app bar overflow menu
        switch (item.getItemId()) {
            // Respond to a click on the "Save" menu option

            // Respond to a click on the "Delete" menu option
            case R.id.action_delete:
                // Do nothing for now
                showAlertDelete();
                return true;
            // Respond to a click on the "Up" arrow button in the app bar

        }
        return super.onOptionsItemSelected(item);
    }
    private void showAlertDelete() {
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);
        alertBuilder.setTitle("رسالة تأكيد").setMessage("سيتم مسح جميع الجداول نهائيا ..هل أنت متأكد")
                .setPositiveButton("نعم", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        deleteAll();
                    }
                })
                .setNegativeButton("لا", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });
        AlertDialog dialog = alertBuilder.create();
        dialog.show();
    }
    private void deleteAll() {
        int result = myDB.DeleteAllData();
        Toast.makeText(this, "لقد تم مسح" + result,Toast.LENGTH_SHORT).show();
    }
}



