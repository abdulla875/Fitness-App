package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import pl.droidsonroids.gif.GifDrawableInit;
import pl.droidsonroids.gif.GifImageView;

public class EasyWorkoutActivity extends AppCompatActivity {

    TextView workoutNameTxt;
    ImageView showWorkout;
    HashMap<String, Integer> map = new HashMap<>();
    ArrayList<String> workoutList = new ArrayList<>();
    ArrayList<String> repsList = new ArrayList<>();
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_workout);
        workoutNameTxt = findViewById(R.id.exerciseNameId);
        showWorkout = findViewById(R.id.gifs);
        index = 0;
        workoutList.add("Diamond Push Up");
        workoutList.add("Pike Push Up");
        workoutList.add("Star Push Up");
        map.put(workoutList.get(0), R.drawable.diamondpushup);
        map.put(workoutList.get(1), R.drawable.pikepushup);
        map.put(workoutList.get(2), R.drawable.starpushup);
        startWorkout();
    }

    private void startWorkout(){
        showExercise(index);
    }
    private void showExercise(int index){
        workoutNameTxt.setText(workoutList.get(index));
        showWorkout.setImageResource(map.get(workoutList.get(index)));
    }

    public void nextExercise(View view) {
        index ++;
       startWorkout();
    }
}