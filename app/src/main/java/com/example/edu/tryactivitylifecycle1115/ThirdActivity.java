package com.example.edu.tryactivitylifecycle1115;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Log.i("TASK","ThirdActivity -- onCreate 호출");

        ((Button)findViewById(R.id.buttonThird)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),MainActivity.class);
                Log.e("TASK","ThirdActivity에서 MainActivity 호출");
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TASK","ThirdActivity -- onStart 호출");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TASK","ThirdActivity -- onResume 호출");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TASK","ThirdActivity -- onPause 호출");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TASK","ThirdActivity -- onStop 호출");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("TASK","ThirdActivity -- onRestart 호출");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TASK","ThirdActivity -- onDestroy 호출");
    }
}
