package com.example.fitnessapp;

import java.util.ArrayList;
import java.util.HashMap;

public interface Exercises {
    HashMap<String, Integer> map = new HashMap<>();
    HashMap<String, String> repMap = new HashMap<>();

    ArrayList<String> workoutList = new ArrayList<>();
    ArrayList<String> repsList = new ArrayList<>();

    void exerciseData();

}
