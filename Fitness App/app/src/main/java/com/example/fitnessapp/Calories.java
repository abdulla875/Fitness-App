package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class Calories extends AppCompatActivity  {

    Button bmiButton;
    Button caloriesIntakebtn;
    ImageView CaloriesTitleImageView;

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    FragmentAdapter fragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories);
//        bmiButton = findViewById(R.id.bmibtn);
//        caloriesIntakebtn = findViewById(R.id.caloriesIntakebtn);
//        bmiButton.setOnClickListener(this);
//        caloriesIntakebtn.setOnClickListener(this);
//        CaloriesTitleImageView = findViewById(R.id.caloriestitle);

//
//        tabLayout = findViewById(R.id.tabLayout);
//        viewPager2 = findViewById(R.id.viewPager2);
//
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        fragmentAdapter = new FragmentAdapter(fragmentManager, getLifecycle());
//        viewPager2.setAdapter(fragmentAdapter);
//
//        tabLayout.addTab(tabLayout.newTab().setText("BMI"));
//        tabLayout.addTab(tabLayout.newTab().setText("Calories Intake"));
//
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                viewPager2.setCurrentItem(tab.getPosition());
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
//
//        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
//            @Override
//            public void onPageSelected(int position) {
//               tabLayout.selectTab(tabLayout.getTabAt(position));
//            }
//        });
//    }

//    @Override
//    public void onClick(View v) {
////        if(v.getId()==R.id.bmibtn){
////            getSupportFragmentManager().beginTransaction().replace(R.id.bmifragment, new BmiFragment()).commit();
////            bmiButton.setVisibility(View.GONE);
////            caloriesIntakebtn.setVisibility(View.GONE);
////            CaloriesTitleImageView.setVisibility(View.GONE);
////
////        }
////
////        if(v.getId()==R.id.caloriesIntakebtn){
////            getSupportFragmentManager().beginTransaction().replace(R.id.caloriesIntakeFragment, new CaloriesIntakeFragment()).commit();
////            bmiButton.setVisibility(View.GONE);
////            caloriesIntakebtn.setVisibility(View.GONE);
////            CaloriesTitleImageView.setVisibility(View.GONE);
////
////        }
//
//    }

    }
}
