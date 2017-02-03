package com.example.david.webapp;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
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
