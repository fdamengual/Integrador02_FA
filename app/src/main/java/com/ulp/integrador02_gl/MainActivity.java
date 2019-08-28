package com.ulp.integrador02_gl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void convercion(View view){

        RadioButton rbED = (RadioButton) findViewById(R.id.rbED);
        EditText etMonto = (EditText)findViewById(R.id.etMonto);
        EditText etResult = (EditText)findViewById(R.id.etResult);


        if(rbED.isChecked())
        {
            double result = Double.parseDouble(etMonto.getText().toString()) * 0.9;
            etResult.setText(String.valueOf(result));

        }
        else
        {
            double result = Double.parseDouble(etMonto.getText().toString()) * 1.11;
            etResult.setText(String.valueOf(result));
        }


    }
}
