package com.example.hudzanton.myhashmapapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends ActionBarActivity {
    private Map<String, String> hashMap = new HashMap<String, String>();
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        this.editText = (EditText) this.findViewById(R.id.editText);
        this.hashMap.put("one", "Key One Value");
        this.hashMap.put("two", "Key Two Value");
        this.hashMap.put("three", "Key Three Value");
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
        String key = this.editText.getText().toString();
        if (this.hashMap.containsKey(key)){
            String value = this.hashMap.get(key);
            this.editText.setText(String.valueOf(value));
        }
        else this.editText.setText ("Entered key is absent");
    }
}
