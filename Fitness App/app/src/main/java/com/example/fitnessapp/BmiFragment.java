package com.example.fitnessapp;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * This fragment is being used to allow the user check their BMI.
 */
public class BmiFragment extends Fragment {

    View view;
    private EditText heightEditText;
    private EditText weightEditText;
    private TextView resultTextView;
    private Button checkButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_bmi, container, false);
        // Inflate the layout for this fragment
        heightEditText = view.findViewById(R.id.heightEditText);
        weightEditText = view.findViewById(R.id.weightEditText);
        resultTextView = view.findViewById(R.id.bmiResult);
        checkButton = view.findViewById(R.id.bmiCheckbtn);

/**
 * When the user click on the button it will show their BMI also it will show what categories their bmi are fell into.
 */
        checkButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"DefaultLocale", "SetTextI18n"})
            @Override
            public void onClick(View v) {

                if(heightEditText.getText().toString().length() == 0){
                    heightEditText.setText("0");
                }

                if(weightEditText.getText().toString().length() == 0){
                    weightEditText.setText("0");
                }

                double height = Double.parseDouble(heightEditText.getText().toString());
                double weight = Double.parseDouble(weightEditText.getText().toString());
                double bmi = weight / (height * height);
                if(bmi < 18.5){
                    resultTextView.setText("Your Bmi is " + String.format("%.1f", bmi) + " And you are Underweight");
                }
                if(bmi >= 18.5 && bmi <= 24.9 ){
                    resultTextView.setText("Your Bmi is " + String.format("%.1f", bmi) + " And your weight is Normal");
                }
                if(bmi >=25 && bmi <= 29.9){
                    resultTextView.setText("Your Bmi is " + String.format("%.1f", bmi) + " And you are Overweight");
                }
                if(bmi >=30 && bmi <= 35 ){
                    resultTextView.setText("Your Bmi is " + String.format("%.1f", bmi) + " And you are Obese");
                }
                if(bmi >35){
                    resultTextView.setText("Your Bmi is " + String.format("%.1f", bmi) + " And you are Severely Obese");
                }



            }
        });
        return view;
    }


}