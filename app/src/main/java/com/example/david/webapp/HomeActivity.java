package com.example.david.webapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class HomeActivity extends AppCompatActivity {
    public TextView personal;
    public TextView education;
    public TextView employement;
    public TextView interet;
    public TextView reference;
    public TextView work;
    public TextView about;

    public void init() {
        personal= (TextView) findViewById(R.id.personal);
        education= (TextView) findViewById(R.id.education);
        employement= (TextView) findViewById(R.id.employement);
        interet= (TextView) findViewById(R.id.interet);
        reference= (TextView) findViewById(R.id.ref);
        work= (TextView) findViewById(R.id.project);
        about= (TextView) findViewById(R.id.about);

        personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent personal = new Intent(HomeActivity.this, personal.class);
                startActivity(personal);
            }
        });

        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent education= new Intent(HomeActivity.this, education.class);
                startActivity(education);
            }
        });

        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
    }

}
