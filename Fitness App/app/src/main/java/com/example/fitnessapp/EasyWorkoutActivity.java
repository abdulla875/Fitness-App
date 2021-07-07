package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class EasyWorkoutActivity extends AppCompatActivity implements RestFragment.OnFragmentInteractionListener{

    private TextView workoutNameTxt;
    private TextView repsTxt;
    private TextView exerciseId;
    private FrameLayout fragmentContainer;
    private ImageView goLeftBtn;
    private ImageView showWorkout;
    private EasyExerciseData easyExerciseData = new EasyExerciseData();
    private Chronometer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_workout);
        workoutNameTxt = findViewById(R.id.exerciseNameId);
        showWorkout = findViewById(R.id.gifs);
        repsTxt = findViewById(R.id.reps);
        exerciseId = findViewById(R.id.exerciseId);
        fragmentContainer = findViewById(R.id.frame_Container);
        goLeftBtn = findViewById(R.id.goleft_btn);
        easyExerciseData.exerciseData();
        timer = findViewById(R.id.timer);
        timer.start();
        startWorkout();
    }

    public void startWorkout(){
        if(easyExerciseData.exerciseNon == 1){
            goLeftBtn.setVisibility(View.GONE);
        }else if(easyExerciseData.exerciseNon > 1){
            goLeftBtn.setVisibility(View.VISIBLE);
        }
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
        // This will get WorkoutData and it will be used to pass it to the Fragment //
        openFragment(easyExerciseData.workoutList.get(easyExerciseData.index), easyExerciseData.repsList.get(easyExerciseData.index),easyExerciseData.map.get(easyExerciseData.workoutList.get(easyExerciseData.index)),
                easyExerciseData.exerciseNon + " / " + easyExerciseData.workoutList.size());
        startWorkout();
    }

    // This will take the variables that will be passed to the fragment //
    public void openFragment(String workoutName,String repsList, int nextWorkoutGif, String nextWorkoutNumber){
        RestFragment fragment = RestFragment.newInstance(workoutName, repsList, nextWorkoutGif,nextWorkoutNumber);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.addToBackStack(null);
        transaction.add(R.id.frame_Container, fragment, "BLANK_FRAGMENT").commit();

    }


    public void backExercise(View view) {
        easyExerciseData.index --;
        easyExerciseData.exerciseNon --;
        startWorkout();
    }


    @Override
    public void onFragmentInteraction(String sendBackWorkoutName) {
        workoutNameTxt.setText(sendBackWorkoutName);
        onBackPressed();
    }
}