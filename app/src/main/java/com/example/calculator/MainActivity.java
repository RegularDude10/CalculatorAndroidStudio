package com.example.calculator;

import org.mariuszgromada.math.mxparser.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.input);
        display.setShowSoftInputOnFocus(false);
    }
    private void buttonUpdate(String strToAdd){
        String oldStr = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(cursorPos);
        display.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
        display.setSelection(cursorPos + 1);
    }

    public void BTN0(View view){
        buttonUpdate("0");

    }
    public void BTN1(View view){
        buttonUpdate("1");

    }
    public void BTN2(View view){
        buttonUpdate("2");

    }
    public void BTN3(View view){
        buttonUpdate("3");

    }
    public void BTN4(View view){
        buttonUpdate("4");

    }
    public void BTN5(View view){
        buttonUpdate("5");

    }
    public void BTN6(View view){
        buttonUpdate("6");

    }
    public void BTN7(View view){
        buttonUpdate("7");

    }
    public void BTN8(View view){
        buttonUpdate("8");

    }
    public void BTN9(View view){
        buttonUpdate("9");

    }
    public void BTNPoint(View view){
        buttonUpdate(".");

    }
    public void BTNBackspace(View view){
        int cursorPos = display.getSelectionStart();
        int textLen = display.getText().length();
        if (cursorPos != 0 && textLen != 0) {
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            selection.replace(cursorPos - 1, cursorPos, "");
            display.setText(selection);
            display.setSelection(cursorPos - 1);
        }

    }
    public void BTNc(View view){
        display.setText("");

    }
    public void BTNSqrt(View view){
        String val = display.getText().toString();
        double r = Math.sqrt(Double.parseDouble(val));
        display.setText(String.valueOf(r));
    }
    public void BTNMul(View view){
        buttonUpdate("*");

    }
    public void BTNDiv(View view){
        buttonUpdate("/");

    }
    public void BTNAdd(View view){
        buttonUpdate("+");

    }
    public void BTNSub(View view){
        buttonUpdate("-");

    }
    public void BTNSignChange(View view) {
        buttonUpdate("-");
    }

    public void BTNEql(View view){
        String userExp = display.getText().toString();
        Expression exp = new Expression(userExp);

        String result = String.valueOf(exp.calculate());

        display.setText(result);
        display.setSelection(result.length());

    }

}