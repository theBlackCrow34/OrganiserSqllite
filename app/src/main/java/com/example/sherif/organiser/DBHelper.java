package com.example.sherif.organiser;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Project.db";
    public static final String TABLE_NAME ="grand";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "AZKAR_AFTER";
    public static final String COL_3 = "SONAN";
    public static final String COL_4 = "DOHA";
    public static final String COL_5 = "QOURAAN";
    public static final String COL_6 = "AZKAR_SABAH";
    public static final String COL_7 = "AZKAR_MASAA";
    public static final String COL_8 = "WETER";
    public static final String COL_9 = "WODOO";
    public static final String COL_10 = "AZKAR_NAWM";
    public static final String COL_11 = "PRAYING";
    public static final String COL_12 = "RESULT";
    public static final String COL_13 = "DATE";

    public DBHelper(Context context) { super(context, DATABASE_NAME, null, 1); }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT , AZKAR_AFTER TEXT , SONAN TEXT ,DOHA TEXT , QOURAAN TEXT , AZKAR_SABAH TEXT , AZKAR_MASAA TEXT , WETER TEXT ,WODOO TEXT , AZKAR_NAWM TEXT , PRAYING TEXT , RESULT TEXT , DATE TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
    }
    public boolean insertData(String azkar_after,String sonan,String doha,String qouraan,String azkar_sabah,
                              String azkar_masaa,String weter,String wodoo,String azkar_nawm,String praying,String resultt,String date){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,azkar_after);
        contentValues.put(COL_3,sonan);
        contentValues.put(COL_4,doha);
        contentValues.put(COL_5,qouraan);
        contentValues.put(COL_6,azkar_sabah);
        contentValues.put(COL_7,azkar_masaa);
        contentValues.put(COL_8,weter);
        contentValues.put(COL_9,wodoo);
        contentValues.put(COL_10,azkar_nawm);
        contentValues.put(COL_11,praying);
        contentValues.put(COL_12,resultt);
        contentValues.put(COL_13,date);
        long result = db.insert(TABLE_NAME,null,contentValues);
        db.close();
        if (result==-1){
            return false;
        }else {
            return true;
        }

    }
    public Cursor getAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + TABLE_NAME ,null);
        return res;
    }
    public Cursor getDate(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT DATE FROM " + TABLE_NAME,null);
        return res;
    }
    public Cursor getsonan(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT SONAN FROM " + TABLE_NAME,null);
        return res;
    }
    public Cursor getAzkar(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT AZKAR_AFTER FROM " + TABLE_NAME,null);
        return res;
    }
    public Cursor getwodoo(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT WODOO FROM " + TABLE_NAME,null);
        return res;
    }
    public Cursor getSabah(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT AZKAR_SABAH FROM " + TABLE_NAME,null);
        return res;
    }
    public Cursor getSalah(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT PRAYING FROM " + TABLE_NAME,null);
        return res;
    }
    public Cursor getqouraan(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT QOURAAN FROM " + TABLE_NAME,null);
        return res;
    }
    public Cursor getweter(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT WETER FROM " + TABLE_NAME,null);
        return res;
    }
    public Cursor getMasaa(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT AZKAR_MASAA FROM " + TABLE_NAME,null);
        return res;
    }
    public Cursor getdoha(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT DOHA FROM " + TABLE_NAME,null);
        return res;
    }
    public Cursor getazkarnawm(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT AZKAR_NAWM FROM " + TABLE_NAME,null);
        return res;
    }
    public Cursor getResult(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT RESULT FROM " + TABLE_NAME,null);
        return res;
    }
    public Integer DeleteAllData(){
        SQLiteDatabase db = getWritableDatabase();
        int i =db.delete(TABLE_NAME,null,null);
        return i;
    }
    public ArrayList getDateRecord(){
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery(" select DATE from " + TABLE_NAME ,null);
        res.moveToFirst();

        while (res.isAfterLast()==false){
            String t1 = res.getString(0);
            arrayList.add(t1);
            res.moveToNext();
        }
        return arrayList;
    }
    public ArrayList getIDRecord(){
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery(" select ID from " + TABLE_NAME ,null);
        res.moveToFirst();

        while (res.isAfterLast()==false){
            String t1 = res.getString(0);
            arrayList.add(t1);
            res.moveToNext();
        }
        return arrayList;
    }
    public ArrayList getAllRecordArray(){
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery(" select * from " + TABLE_NAME ,null);
        res.moveToFirst();

        while (res.isAfterLast()==false){
            String t1 = res.getString(0);
            String t2 = res.getString(1);
            String t3 = res.getString(2);
            String t4 = res.getString(3);
            String t5 = res.getString(4);
            String t6 = res.getString(5);
            String t7 = res.getString(6);
            String t8 = res.getString(7);
            String t9 = res.getString(8);
            String t10 = res.getString(9);
            String t11 = res.getString(10);
            String t12 = res.getString(11);
            String t13 = res.getString(12);
            arrayList.add("لقد حصلت على:"+t12+"\t"+"بتاريخ:"+t13);
            res.moveToNext();
        }
        return arrayList;
    }
    public ArrayList<Items> gettwo(){
        ArrayList<Items> contacts = new ArrayList<>();

        String select_query = "select * from " + TABLE_NAME;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(select_query,null);

        if (cursor.moveToFirst()){
            do {
                String sonan = cursor.getString(cursor.getColumnIndex("SONAN"));
                String weter = cursor.getString(cursor.getColumnIndex("WETER"));
                String salah = cursor.getString(cursor.getColumnIndex("PRAYING"));
                String qouraan = cursor.getString(cursor.getColumnIndex("QOURAAN"));
                String wodoo = cursor.getString(cursor.getColumnIndex("WODOO"));
                String doha = cursor.getString(cursor.getColumnIndex("DOHA"));
                String azkarmasaa = cursor.getString(cursor.getColumnIndex("AZKAR_MASAA"));
                String azkarsabah = cursor.getString(cursor.getColumnIndex("AZKAR_SABAH"));
                String azkarnawm = cursor.getString(cursor.getColumnIndex("AZKAR_NAWM"));
                String azkar = cursor.getString(cursor.getColumnIndex("AZKAR_AFTER"));
                String date = cursor.getString(cursor.getColumnIndex("DATE"));
                int result = cursor.getInt(cursor.getColumnIndex("RESULT"));

                Items contact = new Items(result,date,salah,weter,wodoo,doha,azkar,azkarnawm,qouraan,azkarsabah,azkarmasaa,sonan);
                contacts.add(contact);
            }while (cursor.moveToNext());
        }

        return contacts;
    }
    public boolean ckeckUser(SQLiteDatabase db,String name){
        Cursor cur = db.rawQuery(" select * from "+ TABLE_NAME +" where DATE = '"+ name+"'",null);
        if (cur.getCount()>0){
            return true;
        }
        return false;

    }

}
