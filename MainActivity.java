package com.example.tutorial_two;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView TxtVMsg2  = findViewById(R.id.tvMsg2);
        TxtVMsg2.setText(R.string.My2);

        Log.i( "Lifecycle" , "Oncrete() called ..");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("Lifecycle","Onstart called..");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle","OnResume called..");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle","OnPause called..");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle","OnStop called..");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle","OnDistroyed called..");
    }
}
