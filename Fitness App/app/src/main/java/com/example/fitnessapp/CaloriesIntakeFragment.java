package com.example.fitnessapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CaloriesIntakeFragment extends Fragment {

    View view;
    private EditText heightEditText;
    private EditText weightEditText;
    private TextView resultTextView;
    private Button checkButton;
    private EditText ageEditText;
    private Spinner genderSpinner;
    private Spinner activitySpinner;

    private String gender;
    private String activityLevel;

    private double height;
    private double weight;
    private double bmr;
    private double age;
    private double tdee = 0;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_calories_intake, container, false);

        heightEditText = view.findViewById(R.id.heightEditText);
        weightEditText = view.findViewById(R.id.weightEditText);
        ageEditText = view.findViewById(R.id.ageEditText);
        resultTextView = view.findViewById(R.id.caloriesIntakeResult);
        checkButton = view.findViewById(R.id.caloriesIntakeCheckbtn);
        genderSpinner = view.findViewById(R.id.genderSpinner);
        activitySpinner = view.findViewById(R.id.activityLevelSpinner);

        ArrayAdapter<CharSequence> genderAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.gender, android.R.layout.simple_spinner_item);
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(genderAdapter);

        ArrayAdapter<CharSequence> activityLevelAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.activityLevel, android.R.layout.simple_spinner_item);
        activityLevelAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        activitySpinner.setAdapter(activityLevelAdapter);



        checkButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(heightEditText.getText().toString().length() == 0){
                    heightEditText.setText("0");
                }

                if(weightEditText.getText().toString().length() == 0){
                    weightEditText.setText("0");
                }

                if(ageEditText.getText().toString().length() == 0){
                    ageEditText.setText("0");
                }

                bmrCalculation();

                resultTextView.setText("Your daily calorie intake should be: " + String.format("%.0f", tdee) + " calories");
            }
        });

        return view;
    }


    private void bmrCalculation(){
         height = Double.parseDouble(heightEditText.getText().toString());
         weight = Double.parseDouble(weightEditText.getText().toString());
         age = Double.parseDouble(ageEditText.getText().toString());
         if(genderSpinner.getSelectedItem().toString().equals("Male")){
             bmr = 10 * weight + 6.25 * height - 5 * age + 5;
         }  else if(genderSpinner.getSelectedItem().toString().equals("Female")){
             bmr = 10 * weight + 6.25 * height - 5 * age - 161;
         }
        tdeeCalculation();
    }

    private void tdeeCalculation() {

        if(activitySpinner.getSelectedItem().toString().equals("Light")){
            tdee = bmr * 1.5;
        }else if(activitySpinner.getSelectedItem().toString().equals("Moderate")){
            tdee = bmr * 1.8;
        }else if(activitySpinner.getSelectedItem().toString().equals("Heavy")){
            tdee = bmr * 2.2;
        }
    }


}