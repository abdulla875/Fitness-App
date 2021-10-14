package com.example.fitnessapp;

public class EasyExerciseData implements Exercises {


    protected int index = 0;
    protected int exerciseNon = 1;

    @Override
    public void exerciseData() {
        workoutList.add("Warm up");
        workoutList.add("Lunges");

        workoutList.add("Wall Push-ups");
        workoutList.add("Push-ups");
        workoutList.add("Diamond Push-ups");
        workoutList.add("Star Push-ups");

        workoutList.add("Crunches");
        workoutList.add("Seated Oblique Bends");
        workoutList.add("Crunch Kicks");

        workoutList.add("Squats");
        workoutList.add("Chair Squat");
        workoutList.add("Narrow Squats");

        workoutList.add("Plank");
        workoutList.add("Side Plank");
        workoutList.add("Buzzsaw Plank");





        repsList.add("40 S");
        repsList.add("X 10");

        repsList.add("X 20");
        repsList.add("X 12");
        repsList.add("X 10");
        repsList.add("X 10");

        repsList.add("X 20");
        repsList.add("X 16");
        repsList.add("X 12");

        repsList.add("X 20");
        repsList.add("X 16");
        repsList.add("X 20");

        repsList.add("30 S");
        repsList.add("20 S");
        repsList.add("X 10");



        repMap.put(workoutList.get(0), repsList.get(0));
        repMap.put(workoutList.get(1), repsList.get(1));
        repMap.put(workoutList.get(2), repsList.get(2));
        repMap.put(workoutList.get(0), repsList.get(3));
        repMap.put(workoutList.get(1), repsList.get(4));
        repMap.put(workoutList.get(2), repsList.get(5));
        repMap.put(workoutList.get(0), repsList.get(6));
        repMap.put(workoutList.get(1), repsList.get(7));
        repMap.put(workoutList.get(2), repsList.get(8));
        repMap.put(workoutList.get(0), repsList.get(9));
        repMap.put(workoutList.get(1), repsList.get(10));
        repMap.put(workoutList.get(2), repsList.get(11));
        repMap.put(workoutList.get(0), repsList.get(12));
        repMap.put(workoutList.get(1), repsList.get(13));
        repMap.put(workoutList.get(2), repsList.get(14));



        map.put(workoutList.get(0), R.drawable.warmup);
        map.put(workoutList.get(1), R.drawable.lunges);

        map.put(workoutList.get(2), R.drawable.wallpushup);
        map.put(workoutList.get(3), R.drawable.pushups);
        map.put(workoutList.get(4), R.drawable.diamondpushup);
        map.put(workoutList.get(5), R.drawable.starpushup);

        map.put(workoutList.get(6), R.drawable.crunches);
        map.put(workoutList.get(7), R.drawable.seatedobliquebends);
        map.put(workoutList.get(8), R.drawable.crunchkicks);

        map.put(workoutList.get(9), R.drawable.squat);
        map.put(workoutList.get(10), R.drawable.chairsquat);
        map.put(workoutList.get(11), R.drawable.narrowsquats);

        map.put(workoutList.get(12), R.drawable.plank);
        map.put(workoutList.get(13), R.drawable.sideplank);
        map.put(workoutList.get(14), R.drawable.buzzsawplank);
    }

}
