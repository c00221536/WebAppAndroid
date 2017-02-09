package com.example.david.webapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class personal extends AppCompatActivity {

    public void initFontPerso() {
        TextView txt = (TextView) findViewById(R.id.textView34);
        TextView txt1 = (TextView) findViewById(R.id.textView35);
        TextView txt2= (TextView) findViewById(R.id.textView36);
        TextView txt3 = (TextView) findViewById(R.id.textView37);
        TextView txt4 = (TextView) findViewById(R.id.textView38);
        TextView txt5 = (TextView) findViewById(R.id.textView39);
        TextView txt6 = (TextView) findViewById(R.id.textView45);
        TextView txt7 = (TextView) findViewById(R.id.linkedIn);

        Typeface font = Typeface.createFromAsset(getAssets(), "font/Montserrat.ttf");
        txt.setTypeface(font);
        txt1.setTypeface(font);
        txt2.setTypeface(font);
        txt3.setTypeface(font);
        txt4.setTypeface(font);
        txt5.setTypeface(font);
        txt6.setTypeface(font);
        txt7.setTypeface(font);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
        initFontPerso();
    }

    public void linkedIn(View view){
        Intent linkedIn = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/david-luong-b61562112/")); //Redirect LinkedIn
        startActivity(linkedIn); //Start activity
    }
}
