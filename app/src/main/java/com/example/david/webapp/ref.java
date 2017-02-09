package com.example.david.webapp;

import android.app.Fragment;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ref extends AppCompatActivity {
    public void initFontRef() {
        Typeface font = Typeface.createFromAsset(getAssets(), "font/Montserrat.ttf");
        TextView txt = (TextView) findViewById(R.id.textView12);
        TextView txt1 = (TextView) findViewById(R.id.textView16);
        TextView txt2= (TextView) findViewById(R.id.textView17);
        TextView txt3 = (TextView) findViewById(R.id.textView18);
        TextView txt4 = (TextView) findViewById(R.id.textView19);
        TextView txt5 = (TextView) findViewById(R.id.textView20);
        TextView txt6 = (TextView) findViewById(R.id.textView21);
        TextView txt7= (TextView) findViewById(R.id.textView22);
        TextView txt8 = (TextView) findViewById(R.id.textView23);
        TextView txt9 = (TextView) findViewById(R.id.textView24);
        TextView txt10 = (TextView) findViewById(R.id.textView26);
        TextView txt11= (TextView) findViewById(R.id.textView27);
        TextView txt12= (TextView) findViewById(R.id.textView28);
        TextView txt13 = (TextView) findViewById(R.id.textView29);
        TextView txt14 = (TextView) findViewById(R.id.textView30);

        txt.setTypeface(font);
        txt1.setTypeface(font);
        txt2.setTypeface(font);
        txt3.setTypeface(font);
        txt4.setTypeface(font);
        txt5.setTypeface(font);
        txt6.setTypeface(font);
        txt7.setTypeface(font);
        txt8.setTypeface(font);
        txt9.setTypeface(font);
        txt10.setTypeface(font);
        txt11.setTypeface(font);
        txt12.setTypeface(font);
        txt13.setTypeface(font);
        txt14.setTypeface(font);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ref);
        initFontRef();
    }
}
