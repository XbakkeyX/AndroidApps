package com.example.hudzanton.myhashmapapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends ActionBarActivity {
    private Map<String, String> hashMap = new HashMap<String, String>();
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.editText = (EditText) this.findViewById(R.id.editText);
        this.setContentView(R.layout.activity_main);
        this.hashMap.put("Key One", "Key One Value");
        this.hashMap.put("Key Two", "Key Two Value");
        this.hashMap.put("Key Three", "Key Three Value");
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

    public void onClickCheckKeyButton(View view) {
        if (this.hashMap.containsKey(this.editText.getText().toString())){
            this.editText.setText(String.valueOf(this.hashMap.values()));
        }
        else this.editText.setText ("Entered key is absent");
    }
}
