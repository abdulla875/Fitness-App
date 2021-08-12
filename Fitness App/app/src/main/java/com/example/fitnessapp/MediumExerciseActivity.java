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

public class MediumExerciseActivity extends AppCompatActivity implements MediumExerciseRestFragment.OnFragmentInteractionListener {

    private TextView workoutNameTxt;
    private TextView repsTxt;
    private TextView exerciseId;
    private FrameLayout fragmentContainer;
    private ImageView goLeftBtn;
    private ImageView showWorkout;
    private MediumExerciseData mediumExerciseData = new MediumExerciseData();
    private Chronometer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium_exercise);

        workoutNameTxt = findViewById(R.id.exerciseNameId);
        showWorkout = findViewById(R.id.gifs);
        repsTxt = findViewById(R.id.reps);
        exerciseId = findViewById(R.id.exerciseId);
        fragmentContainer = findViewById(R.id.frame_Container);
        goLeftBtn = findViewById(R.id.goleft_btn);
        mediumExerciseData.exerciseData();
        timer = findViewById(R.id.timer);
        timer.start();
        startWorkout();



    }

    private void startWorkout() {
        if(mediumExerciseData.exerciseNon == 1){
            goLeftBtn.setVisibility(View.GONE);
        }else if(mediumExerciseData.exerciseNon > 1){
            goLeftBtn.setVisibility(View.VISIBLE);
        }
        exerciseId.setText(mediumExerciseData.exerciseNon + " / " + mediumExerciseData.workoutList.size());
        shoExercise(mediumExerciseData.index);
    }

    private void shoExercise(int index) {
        workoutNameTxt.setText(mediumExerciseData.workoutList.get(index));
        repsTxt.setText(mediumExerciseData.repsList.get(index));
        showWorkout.setImageResource(mediumExerciseData.map.get(mediumExerciseData.workoutList.get(index)));
    }

    public void nextExercise(View view) {
        mediumExerciseData.index ++;
        mediumExerciseData.exerciseNon ++;
        openFragment(mediumExerciseData.workoutList.get(mediumExerciseData.index), mediumExerciseData.repsList.get(mediumExerciseData.index),
                mediumExerciseData.map.get(mediumExerciseData.workoutList.get(mediumExerciseData.index)),
                mediumExerciseData.exerciseNon + " / " + mediumExerciseData.workoutList.size());
        startWorkout();
    }

    public void openFragment(String workoutName,String repsList, int nextWorkoutGif, String nextWorkoutNumber){
        MediumExerciseRestFragment mediumExerciseRestFragment = MediumExerciseRestFragment.newInstance(workoutName, repsList, nextWorkoutGif,nextWorkoutNumber);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.addToBackStack(null);
        transaction.add(R.id.frame_Container, mediumExerciseRestFragment, "Medium_Rest_FRAGMENT").commit();

    }

    public void backExercise(View view) {
        mediumExerciseData.index --;
        mediumExerciseData.exerciseNon --;
        startWorkout();
    }

    @Override
    public void onFragmentInteraction(String sendBackWorkoutName) {
        workoutNameTxt.setText(sendBackWorkoutName);
        onBackPressed();
    }
}