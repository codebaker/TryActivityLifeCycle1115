package com.example.edu.tryactivitylifecycle1115;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i("TASK","SecondActivity -- onCreate 호출");

        ((Button)findViewById(R.id.buttonSecond)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ThirdActivity.class);
                Log.e("TASK","SecondActivity에서 ThirdActivity 호출");
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TASK","SecondActivity -- onStart 호출");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TASK","SecondActivity -- onResume 호출");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TASK","SecondActivity -- onPause 호출");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TASK","SecondActivity -- onStop 호출");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("TASK","SecondActivity -- onRestart 호출");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TASK","SecondActivity -- onDestroy 호출");
    }
}
