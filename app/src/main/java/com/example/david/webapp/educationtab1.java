package com.example.david.webapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by David on 03/02/2017.
 */

public class educationtab1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.educationtab1, container, false);
        return rootView;
    }

    public void itCarlow(View view) {
        Intent itC = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.itcarlow.ie/")); //Redirect link to IT Carlow website
        startActivity(itC); //Start of the Activity
    }

    public void uB(View view) {
        Intent ub = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.u-bourgogne.fr/")); //Redirect link to UB
        startActivity(ub); //Start the activity
    }
}