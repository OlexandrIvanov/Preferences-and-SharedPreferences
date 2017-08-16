package com.example.saa.preferencesandsharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sp;
    RelativeLayout Layout;

    TextView textView1;
    TextView textView2;
    TextView textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Layout = (RelativeLayout) findViewById(R.id.linear);

        textView1 = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);

        sp = PreferenceManager.getDefaultSharedPreferences(this);
    }



    @Override
    protected void onResume() {
        //Колір фону
        String fon = sp.getString("list1", "");
        if (fon.length()==1){
            Layout.setBackgroundColor(Color.WHITE);
        }if (fon.length()==2){
            Layout.setBackgroundColor(Color.BLUE);
        }if (fon.length()==3){
            Layout.setBackgroundColor(Color.RED);
        }if (fon.length()==4){
            Layout.setBackgroundColor(Color.YELLOW);
        }if (fon.length()==5){
            Layout.setBackgroundColor(Color.BLACK);
        }

        //Settings1
        // fon
        String settings1Fon = sp.getString("list11", "");
        if (settings1Fon.length()==1){
            textView1.setBackgroundColor(Color.WHITE);
        }if (settings1Fon.length()==2){
            textView1.setBackgroundColor(Color.BLUE);
        }if (settings1Fon.length()==3){
            textView1.setBackgroundColor(Color.RED);
        }if (settings1Fon.length()==4){
            textView1.setBackgroundColor(Color.YELLOW);
        }if (settings1Fon.length()==5){
            textView1.setBackgroundColor(Color.BLACK);
        }

        //color Text
        String settings1TextColor = sp.getString("list12", "");
        if (settings1TextColor.length()==1){
            textView1.setTextColor(Color.WHITE);
        }if (settings1TextColor.length()==2){
            textView1.setTextColor(Color.BLUE);
        }if (settings1TextColor.length()==3){
            textView1.setTextColor(Color.RED);
        }if (settings1TextColor.length()==4){
            textView1.setTextColor(Color.YELLOW);
        }if (settings1TextColor.length()==5){
            textView1.setTextColor(Color.BLACK);
        }

        //Text

        String text1 = sp.getString("text1", "Default text");
        textView1.setText(text1);





        //Settings2
        // fon
        String settings2Fon = sp.getString("list21", "");
        if (settings2Fon.length()==1){
            textView2.setBackgroundColor(Color.WHITE);
        }if (settings2Fon.length()==2){
            textView2.setBackgroundColor(Color.BLUE);
        }if (settings2Fon.length()==3){
            textView2.setBackgroundColor(Color.RED);
        }if (settings2Fon.length()==4){
            textView2.setBackgroundColor(Color.YELLOW);
        }if (settings2Fon.length()==5){
            textView2.setBackgroundColor(Color.BLACK);
        }

        //color Text
        String settings2TextColor = sp.getString("list22", "");
        if (settings2TextColor.length()==1){
            textView2.setTextColor(Color.WHITE);
        }if (settings2TextColor.length()==2){
            textView2.setTextColor(Color.BLUE);
        }if (settings2TextColor.length()==3){
            textView2.setTextColor(Color.RED);
        }if (settings2TextColor.length()==4){
            textView2.setTextColor(Color.YELLOW);
        }if (settings2TextColor.length()==5){
            textView2.setTextColor(Color.BLACK);
        }

        //Text

        String text2 = sp.getString("text2", "Default text");
        textView2.setText(text2);



        //Settings3
        // fon
        String settings3Fon = sp.getString("list31", "");
        if (settings3Fon.length()==1){
            textView3.setBackgroundColor(Color.WHITE);
        }if (settings3Fon.length()==2){
            textView3.setBackgroundColor(Color.BLUE);
        }if (settings3Fon.length()==3){
            textView3.setBackgroundColor(Color.RED);
        }if (settings3Fon.length()==4){
            textView3.setBackgroundColor(Color.YELLOW);
        }if (settings3Fon.length()==5){
            textView3.setBackgroundColor(Color.BLACK);
        }

        //color Text
        String settings3TextColor = sp.getString("list32", "");
        if (settings3TextColor.length()==1){
            textView3.setTextColor(Color.WHITE);
        }if (settings3TextColor.length()==2){
            textView3.setTextColor(Color.BLUE);
        }if (settings3TextColor.length()==3){
            textView3.setTextColor(Color.RED);
        }if (settings3TextColor.length()==4){
            textView3.setTextColor(Color.YELLOW);
        }if (settings3TextColor.length()==5){
            textView3.setTextColor(Color.BLACK);
        }

        //Text

        String text3 = sp.getString("text3", "Default text");
        textView3.setText(text3);





        super.onResume();
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem mi = menu.add(0,1,0,"Menu");
        mi.setIntent(new Intent(this, PrefActivity.class));

        return super.onCreateOptionsMenu(menu);
    }
}
