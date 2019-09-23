package com.example.sherif.organiser;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

public class Grand extends AppCompatActivity {

    MediaPlayer player;
    DBHelper myDB;
    SQLiteDatabase c;
    int Salah = 0;
    int Azkar_salah = 0;
    int Azkar_sabah = 0 ;
    int Azkar_masaa = 0;
    int Azkar_nawm = 0;
    int Weter = 0 ;
    int Wodoo = 0 ;
    int Qouraan = 0;
    int Sonan = 0;
    int Doha = 0;
    int collection = 0;
    CheckBox sobh,dohr,asr,magreb,esha,a_sobh,a_dohr,a_asr,a_magreb,a_esha,a_nawm,a_sabah,a_masaa,wodoo,weter,qouraan,sonan,doha,
    sonan_dohr,sonan_magreb,sonan_esha;
    Button show,delete,read;
    TextView txtAzkarSalah,txtSonan,txtDoha,txtQouran,txtAzkarSabah,txtAzkarMasaa,txtWeter,txtWodoo,txtNawm,txtSalah,showResult,shDate,end,test,
            a1,a2,a3,a4,a5,a6;
    int wewe_green = Integer.parseInt("4CAF50", 16)+0xFF000000;
    int bad_red = Integer.parseInt("D50000", 16)+0xFF000000;
    int good_blue = Integer.parseInt("03A9F4", 16)+0xFF000000;

    int calendarDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
    int calendarMonth = Calendar.getInstance().get(Calendar.MONTH);
    int calendarYear = Calendar.getInstance().get(Calendar.YEAR);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grand);



        calendarMonth = calendarMonth +1 ;
        sobh = (CheckBox) findViewById(R.id.salah_sobh);
        dohr = (CheckBox) findViewById(R.id.salah_dohr);
        asr = (CheckBox) findViewById(R.id.salah_asr);
        magreb = (CheckBox) findViewById(R.id.salah_magreb);
        esha = (CheckBox) findViewById(R.id.salah_esha);
        a_sobh = (CheckBox) findViewById(R.id.azkar_sobh);
        a_dohr = (CheckBox) findViewById(R.id.azkar_dohr);
        a_asr = (CheckBox) findViewById(R.id.azkar_asr);
        a_magreb = (CheckBox) findViewById(R.id.azkar_magreb);
        a_esha = (CheckBox) findViewById(R.id.azkar_esha);
        a_nawm = (CheckBox) findViewById(R.id.azkar_nawm);
        a_sabah = (CheckBox) findViewById(R.id.azkar_sabah);
        a_masaa = (CheckBox) findViewById(R.id.azkar_masaa);
        wodoo = (CheckBox) findViewById(R.id.wodoo);
        weter = (CheckBox) findViewById(R.id.weter);
        qouraan = (CheckBox) findViewById(R.id.qouraan);
        sonan = (CheckBox) findViewById(R.id.sonan);
        doha = (CheckBox) findViewById(R.id.doha);
        sonan_dohr = (CheckBox) findViewById(R.id.sonan_dohr);
        sonan_magreb = (CheckBox) findViewById(R.id.sonan_magreb);
        sonan_esha = (CheckBox) findViewById(R.id.sonan_esha);
        show = (Button) findViewById(R.id.bu_result);
        delete = (Button) findViewById(R.id.delete);
        read = (Button) findViewById(R.id.read);
        showResult = (TextView) findViewById(R.id.show_result);
        txtAzkarMasaa = (TextView) findViewById(R.id.txtazkarmasaa);
        txtAzkarSabah = (TextView) findViewById(R.id.txtazkarsabah);
        txtAzkarSalah = (TextView) findViewById(R.id.txtazkarsalah);
        txtDoha=(TextView) findViewById(R.id.txtdoha);
        txtNawm =(TextView) findViewById(R.id.txtnawm);
        txtQouran=(TextView) findViewById(R.id.txtqouraan);
        txtSalah=(TextView) findViewById(R.id.txtsala);
        txtSonan=(TextView) findViewById(R.id.txtsonan);
        txtWodoo=(TextView) findViewById(R.id.txtwodo);
        txtWeter=(TextView) findViewById(R.id.txtwter);
        a1 = (TextView) findViewById(R.id.a1);
        a2 = (TextView) findViewById(R.id.a2);
        a3 = (TextView) findViewById(R.id.a3);
        a4 = (TextView) findViewById(R.id.a4);
        a5 = (TextView) findViewById(R.id.a5);
        a6 = (TextView) findViewById(R.id.a6);
        myDB = new DBHelper(this);
        //unusefull
        shDate =(TextView) findViewById(R.id.time_test);
        end = (TextView) findViewById(R.id.end);
        test = (TextView) findViewById(R.id.test);



        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if else with date but put""
                sobh();
                dohr();
                asr();
                magreb();
                esha();
                a_sobh();
                a_dohr();
                a_asr();
                a_magreb();
                a_esha();
                a_sabah();
                a_masaa();
                nawmm();
                weter();
                wodoo();
                sonan();
                sonan_dohr();
                sonan_esha();
                sonan_magreb();
                doha();
                qouraan();
                if (Salah <6 ){
                    a1.setTextColor(bad_red);
                }else if (Salah >= 6 && Salah < 8){
                    a1.setTextColor(wewe_green);
                }else if (Salah >= 8){
                    a1.setTextColor(good_blue);
                }
                if (Azkar_salah <6 ){
                    a2.setTextColor(bad_red);
                }else if (Azkar_salah >= 6 && Azkar_salah < 8){
                    a2.setTextColor(wewe_green);
                }else if (Azkar_salah >= 8){
                    a2.setTextColor(good_blue);
                }
                if (Sonan <6 ){
                    a3.setTextColor(bad_red);
                }else if (Sonan >= 6 && Sonan < 8){
                    a3.setTextColor(wewe_green);
                }else if (Sonan >= 8){
                    a3.setTextColor(good_blue);
                }
                if ((Azkar_sabah+Azkar_masaa) == 10 ){
                    a4.setTextColor(bad_red);
                }else if ((Azkar_sabah+Azkar_masaa) == 20){
                    a4.setTextColor(good_blue);
                }else {
                    a4.setTextColor(bad_red);
                }
                if ((Azkar_nawm+Weter+Wodoo) ==10 ){
                    a5.setTextColor(bad_red);
                }else if ((Azkar_nawm+Weter+Wodoo) == 20){
                    a5.setTextColor(wewe_green);
                }else if ((Azkar_nawm+Weter+Wodoo) == 30){
                    a5.setTextColor(good_blue);
                }else {
                    a5.setTextColor(bad_red);
                }
                if ((Doha+Qouraan) ==10 ){
                    a6.setTextColor(bad_red);
                }else if ((Doha+Qouraan) == 20 ){
                    a6.setTextColor(good_blue);
                }else {
                    a6.setTextColor(bad_red);
                }

                txtAzkarSalah.setText(" " + Azkar_salah);
                txtAzkarMasaa.setText(" " + Azkar_masaa);
                txtAzkarSabah.setText(" " +Azkar_sabah);
                txtDoha.setText(" " + Doha);
                txtNawm.setText(" " +Azkar_nawm);
                txtQouran.setText(" " + Qouraan);
                txtWeter.setText(" " + Weter);
                txtWodoo.setText(" " + Wodoo);
                txtSonan.setText(" " + Sonan);
                txtSalah.setText(" " + Salah);
                collection = Salah+Azkar_salah+Azkar_nawm+Azkar_sabah+Azkar_masaa+Wodoo+Weter+Qouraan+Doha+Sonan;
                showResult.setText(" " + collection);
                //+1 in month
                //calendarMonth = calendarMonth +1 ;
                shDate.setText( calendarDay + "/" +calendarMonth + "/" +calendarYear);
                String Date = shDate.getText().toString();
                c = myDB.getWritableDatabase();
                if (myDB.ckeckUser(c,Date)){
                    Toast.makeText(getApplicationContext(),"عذرا ..لقد قمت بتسجيل جدول اليوم بالفعل",Toast.LENGTH_SHORT).show();
                    collection = 0;
                    Salah = 0;
                    Azkar_salah = 0;
                    Azkar_sabah = 0 ;
                    Azkar_masaa = 0;
                    Azkar_nawm = 0;
                    Weter = 0 ;
                    Wodoo = 0 ;
                    Qouraan = 0;
                    Sonan = 0;
                    Doha = 0;
                }else {
                    showAlert();


                }



            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteAll();
            }
        });
        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                read();
            }
        });
    }

    private void deleteAll() {
        int result = myDB.DeleteAllData();
        Toast.makeText(this,result + "is Deleted",Toast.LENGTH_SHORT).show();
    }

    private void readDate(){
        Cursor res = myDB.getDate();
        StringBuffer stringBuffer = new StringBuffer();
        if (res != null && res.getCount()>0){
            while (res.moveToNext()){
                stringBuffer.append("Date : " +res.getString(0)+"\n");
            }
            test.setText(stringBuffer.toString());
            Toast.makeText(this,"data is display",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"no results",Toast.LENGTH_SHORT).show();
        }
    }
    private void readResult(){
        Cursor res = myDB.getResult();
        StringBuffer stringBuffer = new StringBuffer();
        if (res != null && res.getCount()>0){
            while (res.moveToNext()){
                stringBuffer.append("Result : " +res.getString(0)+"\n");
            }
            end.setText(stringBuffer.toString());
            Toast.makeText(this,"data is display",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"no results",Toast.LENGTH_SHORT).show();
        }
    }



    private void read() {
        Cursor res = myDB.getAllData();
        StringBuffer stringBuffer = new StringBuffer();
        if (res != null && res.getCount()>0){
            while (res.moveToNext()){
                stringBuffer.append("Id : " + res.getString(0)+ "\n");
                stringBuffer.append("أذكار الصلاة : " + res.getString(1)+ "\n");
                stringBuffer.append("السنن : " + res.getString(2)+ "\n");
                stringBuffer.append("صلاة الضحى : " + res.getString(3)+ "\n");
                stringBuffer.append("قران : " + res.getString(4)+ "\n");
                stringBuffer.append("أذكار الصباح : " + res.getString(5)+ "\n");
                stringBuffer.append("أذكار المساء : " + res.getString(6) + "\n");
                stringBuffer.append("صلاة الوتر : " + res.getString(7)+ "\n");
                stringBuffer.append("الوضوء قبل النوم : " + res.getString(8)+ "\n");
                stringBuffer.append("أذكار النوم : " + res.getString(9)+ "\n");
                stringBuffer.append("الصلوات الخمس : " + res.getString(10)+ "\n");
                stringBuffer.append("النتيجة : " + res.getString(11)+ "\n");
                stringBuffer.append("التاريخ : " + res.getString(12) + "\n"+ "\n");
            }
            end.setText(stringBuffer.toString());
            Toast.makeText(this,"data is display",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"no results",Toast.LENGTH_SHORT).show();
        }
    }


    private void insert() {

        String AzkarSalah = txtAzkarSalah.getText().toString();
        String Sonan = txtSonan.getText().toString();
        String Doha = txtDoha.getText().toString();
        String Qouraan = txtQouran.getText().toString();
        String AzkarSabah = txtAzkarSabah.getText().toString();
        String AzkarMasaa = txtAzkarMasaa.getText().toString();
        String Weter = txtWeter.getText().toString();
        String Wodoo = txtWodoo.getText().toString();
        String AzkarNawm = txtNawm.getText().toString();
        String Salah = txtSalah.getText().toString();
        String Result = showResult.getText().toString();
        String Date = shDate.getText().toString();

        Boolean result = myDB.insertData(AzkarSalah,Sonan,Doha,Qouraan,AzkarSabah,AzkarMasaa,Weter,Wodoo,AzkarNawm,Salah,Result,Date);
        if (result==true){
            Toast.makeText(getApplicationContext(),"تم تسجيل جدول اليوم بنجاح.",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"عذرا..حاول مرة أخرى وتأكد من التاريخ في هاتفك",Toast.LENGTH_SHORT).show();
        }
    }
    private void showAlert() {
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);
        alertBuilder.setTitle("رسالة تأكيد").setMessage("الإختبار مرة واحدة في اليوم,هل أنهيت الأختبار حقا؟")
                .setPositiveButton("نعم", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {



                        insert();
                        collection = 0;
                        Salah = 0;
                        Azkar_salah = 0;
                        Azkar_sabah = 0 ;
                        Azkar_masaa = 0;
                        Azkar_nawm = 0;
                        Weter = 0 ;
                        Wodoo = 0 ;
                        Qouraan = 0;
                        Sonan = 0;
                        Doha = 0;
                        Intent intent = new Intent(getApplicationContext(),Tesst.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("لا", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        collection = 0;
                        Salah = 0;
                        Azkar_salah = 0;
                        Azkar_sabah = 0 ;
                        Azkar_masaa = 0;
                        Azkar_nawm = 0;
                        Weter = 0 ;
                        Wodoo = 0 ;
                        Qouraan = 0;
                        Sonan = 0;
                        Doha = 0;
                        dialog.dismiss();
                    }
                });
        AlertDialog dialog = alertBuilder.create();
        dialog.show();
    }

    public void sobh(){
        if (sobh.isChecked()){

            Salah = Salah +2;

        }else{
            Salah = Salah +0;
        }
    }
    public void dohr(){
        if (dohr.isChecked()){
            Salah = Salah +2;

        }else{
            Salah = Salah +0;
        }
    }
    public void asr(){
        if (asr.isChecked()){
            Salah = Salah +2;


        }else{
            Salah = Salah +0;
        }
    }
    public void magreb(){
        if (magreb.isChecked()){
            Salah = Salah +2;


        }else{
            Salah = Salah +0;
        }
    }
    public void esha(){
        if (esha.isChecked()){
            Salah = Salah +2;

        }else{
            Salah = Salah +0;
        }
    }
    public void a_sobh(){
        if (a_sobh.isChecked()){
            Azkar_salah = Azkar_salah +2;

        }else{
            Azkar_salah = Azkar_salah + 0;
        }
    }
    public void a_dohr(){
        if (a_dohr.isChecked()){
            Azkar_salah = Azkar_salah +2;
        }else{
            Azkar_salah = Azkar_salah + 0;
        }
    }
    public void a_asr(){
        if (a_asr.isChecked()){
            Azkar_salah = Azkar_salah +2;
        }else{
            Azkar_salah = Azkar_salah + 0;
        }
    }
    public void a_magreb(){
        if (a_magreb.isChecked()){
            Azkar_salah = Azkar_salah +2;
        }else{
            Azkar_salah = Azkar_salah + 0;
        }
    }
    public void a_esha(){
        if (a_esha.isChecked()){
            Azkar_salah = Azkar_salah +2;
        }else{
            Azkar_salah = Azkar_salah + 0;
        }
    }
    public void a_sabah(){
        if (a_sabah.isChecked()){
            Azkar_sabah = Azkar_sabah +10;
        }else{
            Azkar_sabah = Azkar_sabah +0;
        }
    }
    public void a_masaa(){
        if (a_masaa.isChecked()){
            Azkar_masaa = Azkar_masaa +10;
        }else{
            Azkar_masaa = Azkar_masaa +0;
        }
    }
    public void weter(){
        if (weter.isChecked()){
            Weter = Weter +10;
        }else{
            Weter = Weter +0 ;
        }
    }
    public void wodoo(){
        if (wodoo.isChecked()){
            Wodoo = Wodoo +10;
        }else{
            Wodoo = Wodoo +0;
        }
    }
    public void qouraan(){
        if (qouraan.isChecked()){
            Qouraan = Qouraan +10;
        }else{
            Qouraan = Qouraan +0;
        }
    }
    public void sonan(){
        if (sonan.isChecked()){
            Sonan = Sonan +4;
        }else{
            Sonan = Sonan +0;
        }
    }
    public void sonan_dohr(){
        if (sonan_dohr.isChecked()){
            Sonan = Sonan +2;
        }else{
            Sonan = Sonan +0;
        }
    }
    public void sonan_magreb(){
        if (sonan_magreb.isChecked()){
            Sonan = Sonan +2;
        }else{
            Sonan = Sonan +0;
        }
    }
    public void sonan_esha(){
        if (sonan_esha.isChecked()){
            Sonan = Sonan +2;
        }else{
            Sonan = Sonan +0;
        }
    }
    public void doha(){
        if (doha.isChecked()){
            Doha = Doha +10;
        }else{
            Doha = Doha +0 ;
        }
    }
    public void nawmm(){
        if (a_nawm.isChecked()){
            Azkar_nawm = Azkar_nawm +10;
        }else{
            Azkar_nawm = Azkar_nawm + 0;
        }
    }
}
