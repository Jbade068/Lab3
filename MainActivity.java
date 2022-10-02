package com.example.simplecalculator;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.view.Menu;


public class MainActivity extends AppCompatActivity {

    private enum Operator{none, add, minus, multiply, divide}
    private double data1 = 0, data2 = 0;
    private Operator optr = Operator.none;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        //Inflate the menu, this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void button00Click (View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "0");
    }
    public void button01Click (View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "1");

    }
    public void button02Click (View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "2");
    }
    public void button03Click (View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "3");
    }
    public void button04Click (View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "4");
    }
    public void button05Click (View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "5");
    }
    public void button06Click (View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "6");
    }
    public void button07Click (View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "7");
    }
    public void button08Click (View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "8");
    }
    public void button09Click (View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "9");
    }
    public void buttonAddClick (View view) {
        optr = Operator.add;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void buttonMinusClick (View view) {
        optr = Operator.minus;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void buttonMultiplyClick (View view) {
        optr = Operator.multiply;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void buttonDivideClick (View view) {
        optr = Operator.divide;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void buttonClearClick (View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText("");
    }
    public void buttonDotClick (View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(".");
    }

    public void btnResultClick(View view){
        if (optr != Operator.none){
            EditText eText = (EditText)findViewById(R.id.resultEdit);
            data2 = Double.parseDouble(eText.getText().toString());
            double result = 0;
            if (optr == Operator.add){
                result = data1 + data2;
            } else if (optr == Operator.minus){
                result = data1 - data2;
            } else if (optr == Operator.multiply){
                result = data1 *data2;
            } else if ( optr == Operator.divide){
                result = data1 / data2;
            }
            optr = Operator.none;
            data1 = result;
            if((result-(int)result)!= 0){
                eText.setText(String.valueOf(result));
            }
            else {
                eText.setText(String.valueOf((int)result));
            }
        }
    }
    /*
    //Function called every time a number button is pressed
    public void onClickNumericalButton(View view) {
    //Getting ID of pressed Button
        int pressID = view.getId();
    //Getting Text object where we display the current number value
        TextView curText = (TextView)findViewById(R.id.resultText);
    //Figuring out which button was pressed and updating the represented text field object
        switch (pressID) {
            case R.id.btn00:
                curText. setText (curText. getText () + "O'*) :
                break:
            case R.id.btn01:
                curText.setText (curText. getText () + "I) :
                break:
            case R.id.btn02:
                curText.setText(curText.getText()+"2");
                break;
            case R.id.btn03:
                curText. setText (curText. getText () +
                        "3") ;
                break;
            case R.id.btn04:
                curText.setText (curText.getText () + "4") :
                break;
            case R.id.btn05:
                curText. setText (curText. getText () + "5") :
                break;
            case R.id.btn06:
                curText. setText (curText. getText () + "6") :
                break:
            case R.id.btn07:
                curText. setText (curText. getText () + "7") :
                break:
            case R.id.btn08:
                curText. setText (curText. getText () + "8"):
                break;
            case R.id.btn09:
                curText. setText (curText. getText () + "9") :
                break;
            case R.id.btnDot:
                curText. setText (curText. getText () + ".");
                break;
            default:
                curText. setText ("ERROR");
                Log.d("Error","Error: Unknown Button pressed!");
                break;
        }
    }

     */

}