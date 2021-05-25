package com.example.exlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.myutility.LoginActivity;
import com.example.myutility.MyMaths;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int result = MyMaths.plus(10,10);
        Log.d("==RESULT", String.valueOf(result));
//        Intent intent = new Intent(android.content.Intent.ACTION_VIEW);
//        intent.setComponent(new ComponentName("com.example.mylibrary",
//                "com.example.mylibrary.MainActivity"));
//
//        startActivity(intent);
//        Intent intent = new Intent();
//        intent.setClassName(this, "com.example.mylibrary.MainActivity");
//        startActivity(intent);
        Intent myIntent = new Intent(this, LoginActivity.class);
        startActivity(myIntent );
    }
}