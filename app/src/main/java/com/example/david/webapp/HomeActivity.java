package com.example.david.webapp;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import org.w3c.dom.Text;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    public TextView personal;
    public TextView education;
    public TextView employement;
    public TextView interet;
    public TextView reference;
    public TextView work;
    public TextView about;
    public TextView skill;

    public void init () {
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
        init();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.personal:
                Intent personal = new Intent(HomeActivity.this, personal.class);
                startActivity(personal);
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
                Intent skill = new Intent(HomeActivity.this, skill.class);
                startActivity(skill);
                break;
            default:
                break;
        }
    }
}
