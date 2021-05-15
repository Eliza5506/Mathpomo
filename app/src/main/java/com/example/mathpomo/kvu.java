package com.example.mathpomo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class kvu extends MainActivity {
    EditText et;
    TextView tv;
    double a, b, c, D, x, x1, x2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kvu);

    }
    public void pp(View view) {
        et = findViewById(R.id.et);


        a = Double.parseDouble(et.getText().toString());
        et = findViewById(R.id.it);
        b = Double.parseDouble(et.getText().toString());
        et = findViewById(R.id.ut);
        c = Double.parseDouble(et.getText().toString());
        tv = findViewById(R.id.tv);
        D=b*b-4*a*c;
      //  if (view.getId() == R.id.kk)
          et.append("D="+D);
        if(D>0) {
            x1= ((-b)+Math.sqrt(D))/(2*a);
            x2= ((-b)-Math.sqrt(D))/(2*a);
            tv.setText("x1="+x1+ ";"+ " "+"x2="+x2);

        }
        else if(D==0){
            x = -b/(2*a);
            tv.setText("x="+x);
        }
        else {
            tv.setText("Нет корней");
        }
    }
}
