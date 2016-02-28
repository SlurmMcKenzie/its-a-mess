package com.example.work.februar2016v1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView firstNumber;
    TextView secondNumber;
    EditText addResult;
    Button btnAdd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        // Gets value from textView3
        firstNumber = (TextView)findViewById(R.id.textView3);

        // Gets value from textView5
        secondNumber = (TextView)findViewById(R.id.textView5);

        //Random RandomNumber = new Random();
        //final int firstNumber = RandomNumber.nextInt(49);
        //final int secondNumber = RandomNumber.nextInt(49);

        // variable for the result-Field
        addResult = (EditText)findViewById(R.id.result);

        // variable for the addition button
        btnAdd = (Button)findViewById(R.id.elbutton);

        // sets Listener for addition button
        btnAdd.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                int num1 = new Integer(firstNumber.getText().toString());
                int num2 = new Integer(secondNumber.getText().toString());
                int sum = num1 + num2;
                addResult.setText(Integer.toString(sum));
            }
        });
    }
}