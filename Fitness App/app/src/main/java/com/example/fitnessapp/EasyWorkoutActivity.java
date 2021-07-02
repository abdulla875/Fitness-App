package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import pl.droidsonroids.gif.GifDrawableInit;
import pl.droidsonroids.gif.GifImageView;

public class EasyWorkoutActivity extends AppCompatActivity {

    TextView workoutNameTxt;
    TextView repsTxt;
    TextView exerciseId;

    ImageView showWorkout;
    HashMap<String, Integer> map = new HashMap<>();

    HashMap<String, String> repMap = new HashMap<>();

    ArrayList<String> workoutList = new ArrayList<>();
    ArrayList<String> repsList = new ArrayList<>();
    int index;
    int exerciseNon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_workout);
        workoutNameTxt = findViewById(R.id.exerciseNameId);
        showWorkout = findViewById(R.id.gifs);
        repsTxt = findViewById(R.id.reps);
        exerciseId = findViewById(R.id.exerciseId);

        exerciseNon = 1;
        index = 0;
        workoutList.add("Diamond Push Up");
        workoutList.add("Pike Push Up");
        workoutList.add("Star Push Up");

        repsList.add("X 12");
        repsList.add("X 16");
        repsList.add("X 20");

        repMap.put(workoutList.get(0),repsList.get(0));
        repMap.put(workoutList.get(1),repsList.get(1));
        repMap.put(workoutList.get(2),repsList.get(2));


        map.put(workoutList.get(0), R.drawable.diamondpushup);
        map.put(workoutList.get(1), R.drawable.pikepushup);
        map.put(workoutList.get(2), R.drawable.starpushup);

        startWorkout();
    }

    private void startWorkout(){
        exerciseId.setText(exerciseNon + " / " + workoutList.size());
        showExercise(index);
    }
    private void showExercise(int index){
        workoutNameTxt.setText(workoutList.get(index));

        repsTxt.setText(repsList.get(index));
        showWorkout.setImageResource(map.get(workoutList.get(index)));
    }

    public void nextExercise(View view) {
        index ++;
        exerciseNon++;
       startWorkout();
    }

    public void backExercise(View view) {
        index --;
        exerciseNon --;
        startWorkout();
    }


}