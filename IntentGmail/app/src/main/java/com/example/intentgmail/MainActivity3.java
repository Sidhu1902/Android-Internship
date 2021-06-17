package com.example.intentgmail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        String s = getIntent().getStringExtra("key");
        Toast.makeText(this, "Welcome " +s, Toast.LENGTH_SHORT).show();

    }
}