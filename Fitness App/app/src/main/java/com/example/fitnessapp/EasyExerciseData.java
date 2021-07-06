package com.example.fitnessapp;

public class EasyExerciseData implements Exercises {


    protected int index = 0;
    protected int exerciseNon = 1;

    @Override
    public void exerciseData() {
        workoutList.add("Diamond Push Up");
        workoutList.add("Pike Push Up");
        workoutList.add("Star Push Up");

        repsList.add("X 12");
        repsList.add("X 16");
        repsList.add("X 20");

        repMap.put(workoutList.get(0), repsList.get(0));
        repMap.put(workoutList.get(1), repsList.get(1));
        repMap.put(workoutList.get(2), repsList.get(2));


        map.put(workoutList.get(0), R.drawable.diamondpushup);
        map.put(workoutList.get(1), R.drawable.pikepushup);
        map.put(workoutList.get(2), R.drawable.starpushup);
    }

}
