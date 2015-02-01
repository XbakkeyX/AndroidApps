package com.example.hudzanton.myarrayapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Random;


public class MainActivity extends ActionBarActivity {
    private int arrayOneSize = 10;
    private int arrayTwoSize = 3;
    private int[] arrayOne = new int[arrayOneSize];
    private int[] arrayTwo = new int[arrayTwoSize];
    private TextView arrayResultInfo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        this.arrayResultInfo = (TextView) this.findViewById(R.id.textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickButtonActionOne(View view) {
        Random arrayRandomFill = new Random();
        for (int i = 0; i < this.arrayOne.length; i++){
            this.arrayOne[i] = arrayRandomFill.nextInt(100);
        }
        this.arrayResultInfo.setText(Arrays.toString(this.arrayOne));
    }

    public void onClickButtonActionTwo(View view) {
        this.arrayOne[4] = 2;
        this.arrayResultInfo.setText(Arrays.toString(this.arrayOne));
    }

    public void onClickButtonActionThree(View view) {
        int[] arrayThree = ArrayUtils.addAll(this.arrayOne, this.arrayTwo);
        this.arrayResultInfo.setText(Arrays.toString(arrayThree));
    }
}
