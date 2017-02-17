package com.example.david.webapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView personal;
    private TextView education;
    private TextView employement;
    private TextView interet;
    private TextView reference;
    private TextView work;
    private TextView about;
    private TextView skill;

    public void initTxtView () { //Init of all different category of the CV & Custom Font
        personal= (TextView) findViewById(R.id.personal);
        personal.setOnClickListener(this);
        education= (TextView) findViewById(R.id.education);
        education.setOnClickListener(this);
        employement= (TextView) findViewById(R.id.employement);
        employement.setOnClickListener(this);
        interet= (TextView) findViewById(R.id.interet);
        interet.setOnClickListener(this);
        reference= (TextView) findViewById(R.id.ref);
        reference.setOnClickListener(this);
        work= (TextView) findViewById(R.id.project);
        work.setOnClickListener(this);
        about= (TextView) findViewById(R.id.about);
        about.setOnClickListener(this);
        skill= (TextView) findViewById(R.id.skill);
        skill.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initTxtView(); //Calling the init function
    }
    @Override
    protected void attachBaseContext(Context newBase) { //Calligraphy library
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    public void onClick(View v) { //OnClick the user, we start the activity choosen
        switch (v.getId()) {
            case R.id.personal:
                Intent personal = new Intent(HomeActivity.this, personal.class); //Create the intent
                startActivity(personal); //Start the Activity
                break;
            case R.id.education:
                Intent Education = new Intent(HomeActivity.this, education.class);
                startActivity(Education);
                break;
           case R.id.employement:
                Intent employement = new Intent(HomeActivity.this, employement.class);
                startActivity(employement);
                break;
            case R.id.interet:
                Intent interet = new Intent(HomeActivity.this, interet.class);
                startActivity(interet);
                break;
           case R.id.ref:
                Intent ref = new Intent(HomeActivity.this, ref.class);
                startActivity(ref);
                break;
             case R.id.project:
                Intent project = new Intent(HomeActivity.this, project.class);
                startActivity(project);
                break;
            case R.id.about:
                Intent about = new Intent(HomeActivity.this, about.class);
                startActivity(about);
                break;
            case R.id.skill:
                Intent skill = new Intent(HomeActivity.this, com.example.david.webapp.skill.class);
                startActivity(skill);
                break;
            default:
                break;
        }
    }
}
