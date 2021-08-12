package com.example.fitnessapp;

public class MediumExerciseData implements Exercises {

    protected int index = 0;
    protected int exerciseNon = 1;

    /**
     * This Class show all the data for the medium level workout.
     */
    @Override
    public void exerciseData() {

        //Using the workoutList ArrayList to add all the exercise name

        workoutList.add("Warm up");
        workoutList.add("knee trap");
        workoutList.add("Lunges-to-Squat");

        workoutList.add("Push-ups");
        workoutList.add("Diamond Push-ups");
        workoutList.add("Star Push-ups");
        workoutList.add("Pike-Push-Up");


        workoutList.add("Squat-Jumps");
        workoutList.add("Plank-Frog-Jumps");
        workoutList.add("Squats");
        workoutList.add("Narrow Squats");

        workoutList.add("Crunches");
        workoutList.add("Twisting Crunches");
        workoutList.add("Crunch Kicks");

        workoutList.add("Plank");
        workoutList.add("Commando Plank");
        workoutList.add("Buzzsaw Plank");


        // using the repsList ArrayList to add reps for each exercise

        repsList.add("1 M");
        repsList.add("X 15");
        repsList.add("X 20");

        repsList.add("X 20");
        repsList.add("X 20");
        repsList.add("X 15");
        repsList.add("X 20");

        repsList.add("X 15");
        repsList.add("X 12");
        repsList.add("X 20");
        repsList.add("X 20");

        repsList.add("X 30");
        repsList.add("X 20");
        repsList.add("X 20");

        repsList.add("1 M");
        repsList.add("40 S");
        repsList.add("30 S");



//        repMap.put(workoutList.get(0), repsList.get(0));
//        repMap.put(workoutList.get(1), repsList.get(1));
//        repMap.put(workoutList.get(2), repsList.get(2));
//        repMap.put(workoutList.get(0), repsList.get(3));
//        repMap.put(workoutList.get(1), repsList.get(4));
//        repMap.put(workoutList.get(2), repsList.get(5));
//        repMap.put(workoutList.get(0), repsList.get(6));
//        repMap.put(workoutList.get(1), repsList.get(7));
//        repMap.put(workoutList.get(2), repsList.get(8));
//        repMap.put(workoutList.get(0), repsList.get(9));
//        repMap.put(workoutList.get(1), repsList.get(10));
//        repMap.put(workoutList.get(2), repsList.get(11));
//        repMap.put(workoutList.get(0), repsList.get(12));
//        repMap.put(workoutList.get(1), repsList.get(13));
//        repMap.put(workoutList.get(2), repsList.get(14));
//

        // With the HashMap Adding all the exercise Gifs and using workout names as an ID//
        map.put(workoutList.get(0), R.drawable.warmup);
        map.put(workoutList.get(1), R.drawable.kneetrap);
        map.put(workoutList.get(2), R.drawable.lungestosquat);

        map.put(workoutList.get(3), R.drawable.pushups);
        map.put(workoutList.get(4), R.drawable.diamondpushup);
        map.put(workoutList.get(5), R.drawable.starpushup);
        map.put(workoutList.get(6), R.drawable.pikepushup);

        map.put(workoutList.get(7), R.drawable.squatjumps);
        map.put(workoutList.get(8), R.drawable.plankfrogjumps);
        map.put(workoutList.get(9), R.drawable.squat);
        map.put(workoutList.get(10), R.drawable.narrowsquats);

        map.put(workoutList.get(11), R.drawable.crunches);
        map.put(workoutList.get(12), R.drawable.twistingcrunches);
        map.put(workoutList.get(13), R.drawable.crunchkicks);

        map.put(workoutList.get(14), R.drawable.plank);
        map.put(workoutList.get(15), R.drawable.commandoplank);
        map.put(workoutList.get(16), R.drawable.buzzsawplank);

    }
}
