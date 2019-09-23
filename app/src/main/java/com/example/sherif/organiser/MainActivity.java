package com.example.sherif.organiser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import junit.framework.Test;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    final int  sunwenday = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
    Button small,young,grand,test;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        small = (Button) findViewById(R.id.bu_s);
        young = (Button) findViewById(R.id.bu_b);
        grand = (Button) findViewById(R.id.bu_xb);
        test = (Button) findViewById(R.id.bu_test);

        small.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),SabahMasaa.class);
                startActivity(i);
            }
        });
        young.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),AzkarActivity.class);
                startActivity(i);

            }
        });
        grand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if (calenda12 >=9 || calenda24 >= 21){
                    Intent i = new Intent(getApplicationContext(),Grand.class);
                    startActivity(i);
               // }else {
                    //Toast.makeText(this,"يجب أن تنتظر إلى الساعة التاسعة مساء",Toast.LENGTH_SHORT).show();
              //  }

            }
        });
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Tesst.class);
                startActivity(i);
            }
        });
       if (sunwenday == 1){
           Toast.makeText(getApplicationContext(),"لا تنسى صيام يوم الاثنين",Toast.LENGTH_SHORT).show();
       }
        if (sunwenday == 4){
            Toast.makeText(getApplicationContext(),"لا تنسى صيام يوم الخميس",Toast.LENGTH_SHORT).show();
        }
    }
}
