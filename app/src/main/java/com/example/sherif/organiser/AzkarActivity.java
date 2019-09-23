package com.example.sherif.organiser;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class AzkarActivity extends AppCompatActivity {

    TextView One,Two,Three,Four,Five,Six,Seven,Eight,Nine,Ten,Eleven,Twelve,Thirteen
            ,font1,font2,font3,font4,font5,font6,font7,font8,font9,font11,font12,font13
            ,ffont1,ffont5,ffont6,ffont7,ffont11,ffont12,ffont13;
    LinearLayout one1,two2,three3,four4,five5,six6,seven7,eight8,nine9,eleven11,twelve12,thirteen13;
    int jump1 = 0;
    int jump2 = 0;
    int jump3 = 0;
    int jump4 = 0;
    int jump5 = 0;
    int jump6 = 0;
    int jump7 = 0;
    int jump8 = 0;
    int jump9 = 0;
    int jump10 = 0;
    int jump11 = 0;
    int jump12 = 0;
    int jump13 = 0;
    int color = Integer.parseInt("000000", 16)+0xFF000000;

    MediaPlayer player;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar);

        Toast.makeText(getApplicationContext(),"اضغط على الذكر ولاحظ عدد المرات",Toast.LENGTH_SHORT).show();



        one1 = (LinearLayout) findViewById(R.id.one);
        two2 = (LinearLayout) findViewById(R.id.two);
        three3 = (LinearLayout) findViewById(R.id.three);
        four4 = (LinearLayout) findViewById(R.id.four);
        five5 = (LinearLayout) findViewById(R.id.five);
        six6 = (LinearLayout) findViewById(R.id.six);
        seven7 = (LinearLayout) findViewById(R.id.seven);
        eight8 = (LinearLayout) findViewById(R.id.eiht);
        nine9 = (LinearLayout) findViewById(R.id.nine);
        eleven11 = (LinearLayout) findViewById(R.id.eleven);
        twelve12 = (LinearLayout) findViewById(R.id.twelve);
        thirteen13 = (LinearLayout) findViewById(R.id.thirteen);

        One = (TextView) findViewById(R.id.one_1);
        Two = (TextView) findViewById(R.id.two_1);
        Three = (TextView) findViewById(R.id.three_1);
        Four = (TextView) findViewById(R.id.four_4);
        Five = (TextView) findViewById(R.id.five_1);
        Six = (TextView) findViewById(R.id.six_3);
        Seven = (TextView) findViewById(R.id.seven_7);
        Eight = (TextView) findViewById(R.id.eight_3);
        Nine = (TextView) findViewById(R.id.nine_1);
        Ten = (TextView) findViewById(R.id.ten_1);
        Eleven = (TextView) findViewById(R.id.eleven_3);
        Twelve = (TextView) findViewById(R.id.twelve_3);
        Thirteen = (TextView) findViewById(R.id.thirteen_3);

        font1 = (TextView) findViewById(R.id.font1);
        font2 = (TextView) findViewById(R.id.font2);
        font3 = (TextView) findViewById(R.id.font3);
        font4 = (TextView) findViewById(R.id.font4);
        font5 = (TextView) findViewById(R.id.font5);
        font6 = (TextView) findViewById(R.id.font6);
        font7 = (TextView) findViewById(R.id.font7);
        font8 = (TextView) findViewById(R.id.font8);
        font9 = (TextView) findViewById(R.id.font9);
        font11 = (TextView) findViewById(R.id.font11);
        font12 = (TextView) findViewById(R.id.font12);
        font13 = (TextView) findViewById(R.id.font13);

        ffont1 = (TextView) findViewById(R.id.font111);
        ffont5 = (TextView) findViewById(R.id.font55);
        ffont6 = (TextView) findViewById(R.id.font66);
        ffont7 = (TextView) findViewById(R.id.font77);
        ffont11 = (TextView) findViewById(R.id.font1111);
        ffont12 = (TextView) findViewById(R.id.font1212);
        ffont13 = (TextView) findViewById(R.id.font1313);



        Typeface CustomFont = Typeface.createFromAsset(getAssets(), "fonts/song.ttf");
        font1.setTypeface(CustomFont);
        font2.setTypeface(CustomFont);
        font3.setTypeface(CustomFont);
        font4.setTypeface(CustomFont);
        font5.setTypeface(CustomFont);
        font6.setTypeface(CustomFont);
        font7.setTypeface(CustomFont);
        font8.setTypeface(CustomFont);
        font9.setTypeface(CustomFont);
        font11.setTypeface(CustomFont);
        font12.setTypeface(CustomFont);
        font13.setTypeface(CustomFont);

        ffont1.setTypeface(CustomFont);
        ffont5.setTypeface(CustomFont);
        ffont6.setTypeface(CustomFont);
        ffont7.setTypeface(CustomFont);
        ffont11.setTypeface(CustomFont);
        ffont12.setTypeface(CustomFont);
        ffont13.setTypeface(CustomFont);

        one1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                jump1 = jump1 +1;

                if (jump1 <3){
                    One.setText(" " + jump1);
                }else if (jump1 == 3){
                    One.setText(" " + jump1);
                    One.setTextColor(color);
                }
            }
        });
        two2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump2 = jump2 +1;
                if (jump2 <1){
                    Two.setText(" " + jump2);
                }else if (jump2 == 1){
                    Two.setText(" " + jump2);
                    Two.setTextColor(color);
                }
            }
        });
        three3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump3 = jump3 +1;
                if (jump3 <1){
                    Three.setText(" " + jump3);
                }else if (jump3 == 1){
                    Three.setText(" " + jump3);
                    Three.setTextColor(color);
                }
            }
        });
        four4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump4 = jump4 +1;
                if (jump4 <1){
                    Four.setText(" " + jump4);
                }else if (jump4 == 1){
                    Four.setText(" " + jump4);
                    Four.setTextColor(color);
                }
            }
        });
        five5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump5 = jump5 +1;
                if (jump5 <33){
                    Five.setText(" " + jump5);
                }else if (jump5 == 33){
                    Five.setText(" " + jump5);
                    Five.setTextColor(color);
                }
            }
        });
        six6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump6 = jump6 +1;
                if (jump6 <33){
                    Six.setText(" " + jump6);
                }else if (jump6 == 33){
                    Six.setText(" " + jump6);
                    Six.setTextColor(color);
                }
            }
        });
        seven7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump7 = jump7 +1;
                if (jump7 <33){
                    Seven.setText(" " + jump7);
                }else if (jump7 == 33){
                    Seven.setText(" " + jump7);
                    Seven.setTextColor(color);
                }
            }
        });
        eight8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump8 = jump8 +1;
                if (jump8 <1){
                    Eight.setText(" " + jump8);
                }else if (jump8 == 1){
                    Eight.setText(" " + jump8);
                    Eight.setTextColor(color);
                }
            }
        });
        nine9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump9 = jump9 +1;
                if (jump9 <1){
                    Nine.setText(" " + jump9);
                }else if (jump9 == 1){
                    Nine.setText(" " + jump9);
                    Nine.setTextColor(color);
                }
            }
        });
        eleven11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump11 = jump11 +1;
                if (jump11 <3){
                    Eleven.setText(" " + jump11);
                }else if (jump11 == 3){
                    Eleven.setText(" " + jump11);
                    Eleven.setTextColor(color);
                }
            }
        });
        twelve12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump12 = jump12 +1;
                if (jump12 <3){
                    Twelve.setText(" " + jump12);
                }else if (jump12 == 3){
                    Twelve.setText(" " + jump12);
                    Twelve.setTextColor(color);
                }
            }
        });
        thirteen13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump13 = jump13 +1;
                if (jump13 <3){
                    Thirteen.setText(" " + jump13);
                }else if (jump13 == 3){
                    Thirteen.setText(" " + jump13);
                    Thirteen.setTextColor(color);
                }
            }
        });
    }

}
