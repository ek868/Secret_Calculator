package com.example.secretcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.txtDisplay);
        display.setShowSoftInputOnFocus(false);


    }

    private void updateText(String newString) {
        String oldString = display.getText().toString();

        if (oldString.equals("")) {
            display.setText(newString);
            display.setSelection(1);
        } else {
            int cursorPos = display.getSelectionStart();
            String leftString = oldString.substring(0, cursorPos);
            String rightString = oldString.substring(cursorPos);
            display.setText(leftString.concat(newString).concat(rightString));
            display.setSelection(cursorPos + 1);
        }

    }

    public void btnZeroClick(View view) {
        updateText(getString(R.string.zero));

    }

    public void btnOneClick(View view) {
        updateText(getString(R.string.one));
    }

    public void btnTwoClick(View view) {
        updateText(getString(R.string.two));
    }

    public void btnThreeClick(View view) {
        updateText(getString(R.string.three));
    }

    public void btnFourClick(View view) {
        updateText(getString(R.string.four));
    }

    public void btnFiveClick(View view) {
        updateText(getString(R.string.five));
    }

    public void btnSixClick(View view) {
        updateText(getString(R.string.six));
    }

    public void btnSevenClick(View view) {
        updateText(getString(R.string.seven));
    }

    public void btnEightClick(View view) {
        updateText(getString(R.string.eight));
    }

    public void btnNineClick(View view) {
        updateText(getString(R.string.nine));
    }

    public void btnClearClick(View view) {
        display.setText("");
    }

    public void btnParenthesesClick(View view) {

    }

    public void btnExponentClick(View view) {
        updateText(getString(R.string.exponent));
    }

    public void btnDivideClick(View view) {
        updateText(getString(R.string.divide));
    }

    public void btnMultiplyClick(View view) {
        updateText(getString(R.string.multiply));
    }

    public void btnSubtractClick(View view) {
        updateText(getString(R.string.subtract));
    }

    public void btnAddClick(View view) {
        updateText(getString(R.string.add));
    }

    public void btnEqualsClick(View view) {

    }

    public void btnPointClick(View view) {
        updateText(getString(R.string.point));
    }

    public void btnPlusMinusClick(View view) {

    }

    public void btnBackspaceClick(View view) {
        String oldText = display.getText().toString();
        if (oldText.equals("")) return;
        /*else if (oldText.length() == 1) {
            display.setText("");
        }*/
        else {
            int cursorPos = display.getSelectionStart();
            String leftString = oldText.substring(0, cursorPos);
            String rightString = oldText.substring(cursorPos);
            display.setText(backspace(leftString).concat(rightString));
            display.setSelection(cursorPos - 1);
        }
    }

    private String backspace(String oldString) {
        if (oldString.length() < 2) return "";
        else return oldString.substring(0, oldString.length() - 1);
    }
}