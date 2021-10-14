package com.example.fitnessapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.navigationMenu);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_Container, new HomeFragment()).commit();

    }
    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()){
                        case  R.id.homeNav:
                            selectedFragment = new HomeFragment();
                            break;

                        case  R.id.bmiNav:
                            selectedFragment = new BmiFragment();
                            break;
                        case  R.id.caloriesIntakeNav:
                            selectedFragment = new CaloriesIntakeFragment();
                            break;

//                        case R.id.statusNav:
//                            selectedFragment = new CaloriesIntakeFragment();
//                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_Container, selectedFragment).commit();

                    return true;
                }
            };
}
//        findViewById(R.id.beginnerWorkoutProgram).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this,EasyWorkoutActivity.class));
//            }
//        });
//
//        findViewById(R.id.intermediatesWorkoutProgram).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this,MediumExerciseActivity.class));
//            }
//        });

//        findViewById(R.id.workoutbtn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this,Workout.class));
//            }
//        });

//        findViewById(R.id.caloriesbtn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this,Calories.class));
//            }
//        });