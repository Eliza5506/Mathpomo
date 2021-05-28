package com.example.mathpomo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;

public class sis extends MainActivity{
    EditText et;
    TextView tv;
   String a;
    int b;
    int c;
    int m;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sis);

    }


        public void ss(View view) {
            tv = findViewById(R.id.tv);

            et = findViewById(R.id.et);
            a = et.getText().toString();
            et = findViewById(R.id.it);
            b = Integer.parseInt(et.getText().toString());
            et = findViewById(R.id.ut);
            c = Integer.parseInt(et.getText().toString());

            BigInteger bigInteger = new BigInteger(a, b);
            String s = bigInteger.toString(c);

            tv.setText(s);
        }



        }




