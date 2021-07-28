package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Calories extends AppCompatActivity implements View.OnClickListener {

    Button bmiButton;
    Button caloriesIntakebtn;
    ImageView CaloriesTitleImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories);
        bmiButton = findViewById(R.id.bmibtn);
        caloriesIntakebtn = findViewById(R.id.caloriesIntakebtn);
        bmiButton.setOnClickListener(this);
        caloriesIntakebtn.setOnClickListener(this);
        CaloriesTitleImageView = findViewById(R.id.caloriestitle);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bmibtn){
            getSupportFragmentManager().beginTransaction().replace(R.id.bmifragment, new BmiFragment()).commit();
            bmiButton.setVisibility(View.GONE);
            caloriesIntakebtn.setVisibility(View.GONE);
            CaloriesTitleImageView.setVisibility(View.GONE);

        }

        if(v.getId()==R.id.caloriesIntakebtn){
            getSupportFragmentManager().beginTransaction().replace(R.id.caloriesIntakeFragment, new CaloriesIntakeFragment()).commit();
            bmiButton.setVisibility(View.GONE);
            caloriesIntakebtn.setVisibility(View.GONE);
            CaloriesTitleImageView.setVisibility(View.GONE);

        }

    }


}
