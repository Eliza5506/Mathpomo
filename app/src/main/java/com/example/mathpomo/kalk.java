package com.example.mathpomo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class kalk extends MainActivity{
    EditText et;
    int a, b, c;
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
        if(view.getId()==R.id.n16) et.append("(");
        if(view.getId()==R.id.n17) et.append(")");
        if(view.getId()==R.id.n18) et.append("√");
        if(view.getId()==R.id.n19) et.append("²");
        if(view.getId()==R.id.n20) et.append("-");
        if(view.getId()==R.id.n10){
            String s = et.getText().toString();
            a = Integer.parseInt(s);
            et.setText("");
        }
        if(view.getId()==R.id.n11) et.append("-");
        if(view.getId()==R.id.n12) et.append("x");
        if(view.getId()==R.id.n13) et.append("/");
        if(view.getId()==R.id.n14) et.append(".");
        if(view.getId()==R.id.n14) et.append("%");
        if(view.getId()==R.id.n26) {
            String s = et.getText().toString();
            int b = Integer.parseInt(s);
            et.setText(a+b+"");
        }



       // et.append(view.getId()+"");
    }
}
