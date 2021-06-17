package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("APSSDC","Activity Created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("APSSDC","Activiy Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("APSSDC","Activity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("APSSDC","Activity Paused ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("APSSDC","Activity Stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("APSSDC","Activity Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("APSSDC","Activity Destroyed");
    }

    public void Next(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}