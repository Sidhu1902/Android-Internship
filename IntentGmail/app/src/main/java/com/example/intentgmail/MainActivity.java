package com.example.intentgmail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,gmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        gmail=findViewById(R.id.gmail);
    }

    public void Save(View view) {
        String s = name.getText().toString();
        Intent i = new Intent(this,MainActivity3.class);
        i.putExtra("key",s);
        startActivity(i);

    }

    public void Gmail(View view) {
        String s = gmail.getText().toString().trim();
        Uri u = Uri.parse("mailto"+s);
        Intent i = new Intent(Intent.ACTION_SEND,u);
        startActivity(i);
    }
}

