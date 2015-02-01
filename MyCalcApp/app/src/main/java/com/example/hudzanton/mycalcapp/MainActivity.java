package com.example.hudzanton.mycalcapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private TextView infoTextView;
    private double valueOne;
    private double valueTwo;
    private enum CalcAction {
        PLUS,
        MINUS,
        DIV,
        MUL
    };
    private CalcAction calcAction;
    private String currentText = "";
    private String savedText = "";


    private void updateTextView(String enteredNumber)
    {
        this.infoTextView.setText(this.currentText + enteredNumber);
        this.currentText = this.infoTextView.getText().toString();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.infoTextView = (TextView) this.findViewById(R.id.textView);
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
    public void onClickOneButton(View view) {
        this.updateTextView("1");
    }

    public void onClickTwoButton(View view) {
        this.updateTextView("2");
    }

    public void onClickThreeButton(View view) {
        this.updateTextView("3");
    }

    public void onClickFourButton(View view) {
        this.updateTextView("4");
    }

    public void onClickFiveButton(View view) {
        this.updateTextView("5");
    }

    public void onClickSixButton(View view) {
        this.updateTextView("6");
    }

    public void onClickSevenButton(View view) {
        this.updateTextView("7");
    }

    public void onClickEightButton(View view) {
        this.updateTextView("8");
    }

    public void onClickNineButton(View view) {
        this.updateTextView("9");
    }

    public void onClickZeroButton(View view) {
        this.updateTextView("0");
    }

    public void onClickDotButton(View view) {
        this.updateTextView(".");
    }


    public void onClickPlusButton(View view) {
        this.calcAction = CalcAction.PLUS;
        this.savedText = this.currentText;
        this.valueOne = Double.parseDouble(this.currentText);
        this.infoTextView.setText(this.currentText + "+");
        this.currentText = this.infoTextView.getText().toString();
    }

    public void onClickMinusButton(View view) {
        this.calcAction = CalcAction.MINUS;
        this.savedText = this.currentText;
        this.valueOne = Double.parseDouble(this.currentText);
        this.infoTextView.setText(this.currentText + "-");
        this.currentText = this.infoTextView.getText().toString();
    }

    public void onClickDivButton(View view) {
        this.calcAction = CalcAction.DIV;
        this.savedText = this.currentText;
        this.valueOne = Double.parseDouble(this.currentText);
        this.infoTextView.setText(this.currentText + "/");
        this.currentText = this.infoTextView.getText().toString();
    }

    public void onClickMulButton(View view) {
        this.calcAction = CalcAction.MUL;
        this.savedText = this.currentText;
        this.valueOne = Double.parseDouble(this.currentText);
        this.infoTextView.setText(this.currentText + "*");
        this.currentText = this.infoTextView.getText().toString();
    }

    public void onClickEraseButton(View view) {
        this.infoTextView.setText("");
        this.valueOne = 0;
        this.valueTwo = 0;
        this.currentText = "";
        this.savedText = "";
    }

    public void onClickResultButton(View view) {
        double result;
        switch (this.calcAction){
            case PLUS :
            {
                this.currentText = this.currentText.replace(this.savedText + "+", "");
                this.valueTwo = Double.parseDouble(this.currentText);
                result = this.valueOne+this.valueTwo;
                this.infoTextView.setText(String.valueOf(result));
                break;
            }
            case MINUS : {
                this.currentText = this.currentText.replace(this.savedText + "-", "");
                this.valueTwo = Double.parseDouble(this.currentText);
                result = this.valueOne - this.valueTwo;
                this.infoTextView.setText(String.valueOf(result));
                break;
            }
            case MUL: {
                this.currentText = this.currentText.replace(this.savedText + "*", "");
                this.valueTwo = Double.parseDouble(this.currentText);
                result = this.valueOne * this.valueTwo;
                this.infoTextView.setText(String.valueOf(result));
                break;
            }
            case DIV: {
                this.currentText = this.currentText.replace(this.savedText + "/", "");
                this.valueTwo = Double.parseDouble(this.currentText);
                if (this.valueTwo == 0) {
                    this.infoTextView.setText("Error : division by zero");
                }
                else {
                    result = this.valueOne / this.valueTwo;
                    this.infoTextView.setText(String.valueOf(result));
                }
                break;
            }
        }
    }
}