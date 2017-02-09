package com.example.david.webapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class education extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    public void initFontedu() {
        TextView txt = (TextView) findViewById(R.id.section_label);
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
        setContentView(R.layout.activity_education);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                initFontedu();
            }
        });

    }

    public void duhamel(View view){
        Intent duhamel = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.lycee-jacques-duhamel-dole-jura.fr/fr/lycee-jacques-duhamel-dole-franche-comte.php"));
        startActivity(duhamel); //Start activity
    }
    public void iutD(View view) {
        Intent iutD = new Intent(Intent.ACTION_VIEW, Uri.parse("http://iutdijon.u-bourgogne.fr/www/en/")); //Redirect link to IT Carlow website
        startActivity(iutD); //Start of the Activity
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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_education, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new educationtab1();
                case 1:
                    return new educationtab2();
                case 2:
                     return new educationtab3();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "2017";
                case 1:
                    return "2016";
                case 2:
                    return "2014";
            }
            return null;
        }
    }
}
