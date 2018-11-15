package com.example.edu.tryactivitylifecycle1115;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("TASK","MainActivity - onCreate 호출");

        ((Button)findViewById(R.id.buttonMain)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),SecondActivity.class);
                Log.e("TASK","MainActivity에서 SecondActivity 호출");
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TASK","MainActivity - onStart 호출");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TASK","MainActivity - onResume 호출");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TASK","MainActivity - onPause 호출");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TASK","MainActivity - onStop 호출");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("TASK","MainActivity - onRestart 호출");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TASK","MainActivity - onDestroy 호출");
    }
}
