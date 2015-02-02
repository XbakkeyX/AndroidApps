package com.example.hudzanton.myweatherapp;

import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)

public class MainActivity extends ActionBarActivity {

    @ViewById
    TextView textView;

    @AfterViews
    void myWeather() {
        this.textView.setText("MyWeather");
    }
}
