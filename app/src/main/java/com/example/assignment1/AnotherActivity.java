package com.example.assignment1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AnotherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.another_activity);
        Log.e("onCreate ------ ", "AnotherActivity: onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart ------ ", "AnotherActivity: onStart()");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume ------ ", "AnotherActivity: onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause ------ ", "AnotherActivity: onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop ------ ", "AnotherActivity: onStop()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy ------ ", "AnotherActivity: onDestroy()");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart ------ ", "AnotherActivity: onRestart()");

    }

    public void endActivity(View view) {
        AnotherActivity.this.finish();
    }
}
