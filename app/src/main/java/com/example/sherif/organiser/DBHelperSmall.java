package com.example.sherif.organiser;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelperSmall  extends SQLiteOpenHelper{

    public static final String DATABASE_NAME = "Project.db";
    public static final String TABLE_NAME ="Small";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "AZKAR_AFTER";;
    public static final String COL_3 = "AZKAR_SABAH";
    public static final String COL_4 = "AZKAR_MASAA";
    public static final String COL_5 = "WETER";
    public static final String COL_6 = "WODOO";
    public static final String COL_7 = "AZKAR_NAWM";
    public static final String COL_8 = "PRAYING";
    public static final String COL_9 = "RESULT";
    public static final String COL_10 = "DATE";

    public DBHelperSmall(Context context) { super(context, DATABASE_NAME, null, 1); }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT , AZKAR_AFTER INTEGER NOT NULL DEFAULT 0, " +
                "AZKAR_SABAH INTEGER NOT NULL DEFAULT 0, AZKAR_MASAA INTEGER NOT NULL DEFAULT 0, WETER INTEGER NOT NULL DEFAULT 0," +
                "WODOO INTEGER NOT NULL DEFAULT 0, AZKAR_NAWM INTEGER NOT NULL DEFAULT 0, PRAYING INTEGER NOT NULL DEFAULT 0, RESULT INTEGER NOT NULL DEFAULT 0, DATE INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
    }
    public boolean insertData(String azkar_after,String azkar_sabah,
                              String azkar_masaa,String weter,String wodoo,String azkar_nawm,String praying,String result,String date){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,azkar_after);
        contentValues.put(COL_3,azkar_sabah);
        contentValues.put(COL_4,azkar_masaa);
        contentValues.put(COL_5,weter);
        contentValues.put(COL_6,wodoo);
        contentValues.put(COL_7,azkar_nawm);
        contentValues.put(COL_8,praying);
        contentValues.put(COL_9,result);
        contentValues.put(COL_10,date);
        long check = db.insert(TABLE_NAME,null,contentValues);
        db.close();
        if (check==-1){
            return false;
        }else {
            return true;
        }

    }
}
