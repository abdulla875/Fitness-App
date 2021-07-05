package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RestActivity extends AppCompatActivity {

    EasyWorkoutActivity easyWorkoutActivity = new EasyWorkoutActivity();
    EasyExerciseData easyExerciseData = new EasyExerciseData();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest);
    }


    public void nextExercise(View view) {
        startActivity(new Intent(RestActivity.this,EasyWorkoutActivity.class));
    }
}