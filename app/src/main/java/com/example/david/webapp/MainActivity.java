package com.example.david.webapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Handler;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.app.ActionBar;
import android.widget.TextView;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;


public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000; //Define the time of the Welcome screen in ms

    public void initFontMain() {
        TextView txt = (TextView) findViewById(R.id.textView);
        TextView txt1 = (TextView) findViewById(R.id.textView4);
        TextView txt2= (TextView) findViewById(R.id.textView5);
        TextView txt3 = (TextView) findViewById(R.id.textView6);
        Typeface font = Typeface.createFromAsset(getAssets(), "font/Montserrat.ttf"); //Define the custom font for the main page

        txt.setTypeface(font); //Apply the font
        txt1.setTypeface(font);
        txt2.setTypeface(font);
        txt3.setTypeface(font);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFontMain(); //calling the function

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder() //Use the Calligarphy library Font
                .setDefaultFontPath("font/Montserrat.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
                //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
                startActivity(homeIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
