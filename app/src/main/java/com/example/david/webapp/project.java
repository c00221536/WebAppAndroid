package com.example.david.webapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

import static android.R.attr.gravity;

public class project extends AppCompatActivity {
    @Override
    protected void attachBaseContext(Context newBase) { //Calligraphy library
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
    }

    public void renne(View view){
        Intent renne = new Intent(Intent.ACTION_VIEW, Uri.parse("https://etudes.univ-rennes1.fr/miage")); //Redirect renne MIAGE
        startActivity(renne); //Start activity
    }
    public void paris(View view){
        Intent paris = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mido.dauphine.fr/fr/miage.html")); //Redirect DAUPHINE MIAGE
        startActivity(paris); //Start activity
    }
    public void bordeaux(View view){
        Intent bordo = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.u-bordeaux.fr/formation/2016/PRMA_64/methodes-informatiques-appliquees-a-la-gestion-des-entreprises-miage")); //Redirect BORDEAI MIAGE
        startActivity(bordo); //Start activity
    }
}
