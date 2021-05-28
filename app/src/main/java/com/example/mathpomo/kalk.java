package com.example.mathpomo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.util.Formatter;

public class kalk extends MainActivity{
    EditText et;

    double a, b;
    int oper=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalk);
        et = findViewById(R.id.et);
    }


    public void asdf(View view) {
        if(view.getId()==R.id.n1) et.append("1");
        if(view.getId()==R.id.n2) et.append("2");
        if(view.getId()==R.id.n3) et.append("3");
        if(view.getId()==R.id.n4) et.append("4");
        if(view.getId()==R.id.n5) et.append("5");
        if(view.getId()==R.id.n6) et.append("6");
        if(view.getId()==R.id.n7) et.append("7");
        if(view.getId()==R.id.n8) et.append("8");
        if(view.getId()==R.id.n9) et.append("9");
        if(view.getId()==R.id.n27) et.append("0");

        if(view.getId()==R.id.n21) {
            String s = et.getText().toString();
            s = s.substring(0,s.length()-1);

            et.setText(s);
        }

        if(view.getId()==R.id.n22) {
            String s = et.getText().toString();
            a = Double.parseDouble(s);
            Formatter formatter = new Formatter();
            double d = Math.sin(a/180*Math.PI);
            formatter.format("%.2f", d);
            et.setText(formatter.toString());
        }
        if(view.getId()==R.id.n23) {
            String s = et.getText().toString();
            a = Double.parseDouble(s);
            Formatter formatter = new Formatter();
            double d = Math.cos(a/180*Math.PI);
            formatter.format("%.2f", d);
            et.setText(formatter.toString());
        }
        if(view.getId()==R.id.n24) {
            String s = et.getText().toString();
            a = Double.parseDouble(s);
            Formatter formatter = new Formatter();
            double d = Math.tan(a/180*Math.PI);
            formatter.format("%.2f", d);
            et.setText(formatter.toString());
        }
        if(view.getId()==R.id.n25) {
            String s = et.getText().toString();
            a = Double.parseDouble(s);
            Formatter formatter = new Formatter();
            double d = 1.0/Math.tan(a/180*Math.PI);
            formatter.format("%.2f", d);
            et.setText(formatter.toString());
        }

        if(view.getId()==R.id.n18) {
            // et.append("√");
            String s = et.getText().toString();
            a = Double.parseDouble(s);
            et.setText(Math.sqrt(a)+"");

        }
        if(view.getId()==R.id.n19) {
            String s = et.getText().toString();
            a = Double.parseDouble(s);
            et.setText(Math.pow(a,2)+"");

        }

        if(view.getId()==R.id.n10){
            String s = et.getText().toString();
            a = Double.parseDouble(s);
            et.setText("");
            oper=0;

        }
        if(view.getId()==R.id.n11) {
            String s = et.getText().toString();
            a = Double.parseDouble(s);
            et.setText("");
            oper=1;
        }
        if(view.getId()==R.id.n12) {
            String s = et.getText().toString();
            a = Double.parseDouble(s);
            et.setText("");
            oper=2;
        }
        if(view.getId()==R.id.n13) {
            String s = et.getText().toString();
            a = Double.parseDouble(s);
            et.setText("");
            oper=3;
        }
        if(view.getId()==R.id.n14) {
            String s = et.getText().toString();
            b = Double.parseDouble(s);
            et.append(".");
        }
        if(view.getId()==R.id.n15) {
            String s = et.getText().toString();
            b = Double.parseDouble(s);
            b=(int)(1.0*a/100*b);
            if(oper==0){
                et.setText(a+b+"");
            } else if(oper==1){
                et.setText(a-b+"");
            } else if(oper==2){
                et.setText(a*b+"");
            } else if(oper==3){
                et.setText(a/b+"");
            }
        }

        if(view.getId()==R.id.n26) {
            String s = et.getText().toString();
            b = Double.parseDouble(s);
            if (oper == 0) {
                et.setText(a + b + "");
            } else if (oper == 1) {
                et.setText(a - b + "");
            } else if (oper == 2) {
                et.setText(a * b + "");
            } else if (oper == 3) {
                et.setText(a / b + "");
            }

        }}}