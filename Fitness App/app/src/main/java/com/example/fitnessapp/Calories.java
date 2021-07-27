package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Calories extends AppCompatActivity implements View.OnClickListener {

    Button bmiButton;
    Button caloriesIntakebtn;
    ImageView bmiTitleImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories);
        bmiButton = findViewById(R.id.bmibtn);
        caloriesIntakebtn = findViewById(R.id.caloriesIntakebtn);
        bmiButton.setOnClickListener(this);
        caloriesIntakebtn.setOnClickListener(this);

        bmiTitleImageView = findViewById(R.id.caloriestitle);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bmibtn){
            getSupportFragmentManager().beginTransaction().replace(R.id.bmifragment, new BmiFragment()).commit();
            bmiButton.setVisibility(View.GONE);
            caloriesIntakebtn.setVisibility(View.GONE);
            bmiTitleImageView.setVisibility(View.GONE);

        }
    }
}
