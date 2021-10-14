package com.example.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeFragment extends Fragment {

    View view;
    private EditText heightEditText;
    private EditText weightEditText;
    private TextView resultTextView;
    private Button checkButton;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.home_fragment, container, false);
        // Inflate the layout for this fragment

        ImageView beginnerWorkoutProgram = view.findViewById(R.id.beginnerWorkoutProgram);
        ImageView intermediatesWorkoutProgram = view.findViewById(R.id.intermediatesWorkoutProgram);

        beginnerWorkoutProgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(getActivity(),EasyWorkoutActivity.class);
               startActivity(intent);
            }
        });
        intermediatesWorkoutProgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),MediumExerciseActivity.class);
                startActivity(intent);
            }
        });


        return view;
    }
}