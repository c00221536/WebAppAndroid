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

public class employementtab1 extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.employementtab1, container, false);
        return rootView;
    }

    public void linkedIn(View view){
        Intent linkedIn = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/david-luong-b61562112/")); //Redirect UBFC
        startActivity(linkedIn); //Start activity
    }
}
