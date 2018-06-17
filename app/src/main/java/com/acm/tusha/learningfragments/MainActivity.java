package com.acm.tusha.learningfragments;

import android.app.FragmentManager;
import android.app.Fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void fragChange(){
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        TestFragment acm = new TestFragment();
        fm.beginTransaction().replace(R.id.fragment, acm).commit();

    }
}
