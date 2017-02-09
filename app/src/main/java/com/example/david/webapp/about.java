package com.example.david.webapp;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.TypefaceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;


public class about extends AppCompatActivity {

    public void initFontAbout() {
        TextView txt = (TextView) findViewById(R.id.textView14);
        TextView txt1 = (TextView) findViewById(R.id.textView11);
        TextView txt2= (TextView) findViewById(R.id.textView13);
        TextView txt3 = (TextView) findViewById(R.id.textView3);
        TextView txt4 = (TextView) findViewById(R.id.textView15);

        Typeface font = Typeface.createFromAsset(getAssets(), "font/Montserrat.ttf");
        txt.setTypeface(font);
        txt1.setTypeface(font);
        txt2.setTypeface(font);
        txt3.setTypeface(font);
        txt4.setTypeface(font);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        initFontAbout();
    }
    public void itCarlow (View view) {
        Intent itC = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.itcarlow.ie/")); //Redirect link to IT Carlow website
        startActivity(itC); //Start of the Activity
    }
    public void uB(View view){
        Intent ub = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.u-bourgogne.fr/")); //Redirect link to UB
        startActivity(ub); //Start the activity
    }
    public void ubfc(View view){
        Intent ubfc = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ubfc.fr/")); //Redirect UBFC
        startActivity(ubfc); //Start activity
    }

}


