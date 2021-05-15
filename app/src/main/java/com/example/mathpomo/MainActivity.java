package com.example.mathpomo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calc(View view) {
    Intent i = new Intent (MainActivity.this, kalk.class);
    startActivity(i);
    }
    public void kvu(View view) {
        Intent i = new Intent (MainActivity.this, kvu.class);
        startActivity(i);
    }
}
