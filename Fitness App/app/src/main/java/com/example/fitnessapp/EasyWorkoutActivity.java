package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;

public class EasyWorkoutActivity extends AppCompatActivity {

    TextView workoutNameTxt;
    TextView repsTxt;
    TextView exerciseId;
    ImageView showWorkout;
    EasyExerciseData easyExerciseData = new EasyExerciseData();
    Chronometer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_workout);
        workoutNameTxt = findViewById(R.id.exerciseNameId);
        showWorkout = findViewById(R.id.gifs);
        repsTxt = findViewById(R.id.reps);
        exerciseId = findViewById(R.id.exerciseId);

        easyExerciseData.exerciseData();
        timer = findViewById(R.id.timer);
        timer.start();
        startWorkout();
    }

    private void startWorkout(){
        exerciseId.setText(easyExerciseData.exerciseNon + " / " + easyExerciseData.workoutList.size());
        showExercise(easyExerciseData.index);
    }
    private void showExercise(int index){
        workoutNameTxt.setText(easyExerciseData.workoutList.get(index));

        repsTxt.setText(easyExerciseData.repsList.get(index));
        showWorkout.setImageResource(easyExerciseData.map.get(easyExerciseData.workoutList.get(index)));
    }

    public void nextExercise(View view) {
        easyExerciseData.index ++;
        easyExerciseData.exerciseNon++;
       startWorkout();
    }

    public void backExercise(View view) {
        easyExerciseData.index --;
        easyExerciseData.exerciseNon --;
        startWorkout();
    }


}