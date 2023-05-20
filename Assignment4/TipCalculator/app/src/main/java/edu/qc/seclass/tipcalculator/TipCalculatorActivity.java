package edu.qc.seclass.tipcalculator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class TipCalculatorActivity extends AppCompatActivity {
    double check;
    int party;


    EditText checkAmountValue;
    EditText partySizeValue;
    // Button
    Button buttonCompute;

    // Tip Values
    EditText fifteenPercentTipValue;
    EditText twentyPercentTipValue;
    EditText twentyfivePercentTipValue;

    // Total Values
    EditText fifteenPercentTotalValue;
    EditText twentyPercentTotalValue;
    EditText twentyfivePercentTotalValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkAmountValue = findViewById(R.id.checkAmountValue);
        partySizeValue = findViewById(R.id.partySizeValue);
        buttonCompute = findViewById(R.id.buttonCompute);
        buttonCompute.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (checkAmountValue.getText().toString().length() == 0) {
                    Toast.makeText(getApplicationContext(), "Enter a check amount", Toast.LENGTH_SHORT).show();
                }

                if (partySizeValue.getText().toString().length() == 0) {
                    Toast.makeText(getApplicationContext(), "Enter a party size", Toast.LENGTH_SHORT).show();
                }

                else {

                    fifteenPercentTipValue = findViewById(R.id.fifteenPercentTipValue);
                    twentyPercentTipValue = findViewById(R.id.twentyPercentTipValue);
                    twentyfivePercentTipValue = findViewById(R.id.twentyfivePercentTipValue);

                    fifteenPercentTotalValue = findViewById(R.id.fifteenPercentTotalValue);
                    twentyPercentTotalValue = findViewById(R.id.twentyPercentTotalValue);
                    twentyfivePercentTotalValue = findViewById(R.id.twentyfivePercentTotalValue);

                    check = Double.parseDouble(checkAmountValue.getText().toString());
                    party = Integer.parseInt(partySizeValue.getText().toString());

                    fifteenPercentTipValue.setText(String.valueOf(Tip(check,party,0.15)));
                    twentyPercentTipValue.setText(String.valueOf(Tip(check,party,0.20)));
                    twentyfivePercentTipValue.setText(String.valueOf(Tip(check,party,0.25)));

                    fifteenPercentTotalValue.setText(String.valueOf(Total(check,party, 0.15)));
                    twentyPercentTotalValue.setText(String.valueOf(Total(check,party, 0.20)));
                    twentyfivePercentTotalValue.setText(String.valueOf(Total(check,party, 0.25)));
                }
            }
        });
    }


        public int Tip(double check, int party, double percent){
            int tip = (int) ((check/party)*percent);
            return tip;
        }


        public double Total(double check, int party, double percent){
            int total;
            int tip = Tip(check, party, percent);
            total = (int) ((check+tip)/party);
            return total;
        }
    }