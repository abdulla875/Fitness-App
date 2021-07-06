package com.example.fitnessapp;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RestFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RestFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    private static final String WORKOUTNAMETEXT = "workoutname";
    private static final String REPLISTTEXT = "replisttext";
    private static final String WORKOUTGIF = "gifs";
    private static final String EXERCISENUMBER = "exercisenumber";


    private OnFragmentInteractionListener mListener;

    // TODO: Rename and change types of parameters
    private String updatedWorkoutName;
    private String updatedRepsList;
    private int updatedGif;
    private String updateNextWorkoutNumber;

    private TextView workoutNameTextView;
    private TextView nextRepsTextView;
    private ImageView buttonFragmentImageView;
    private ImageView showNextWorkoutGifsImageView;
    private TextView nextWorkoutNumberTextView;
    private TextView countdownTimerTextView;


    public RestFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment BlankFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RestFragment newInstance(String workoutName, String repsList, int gifIndex, String nextWorkoutNumber) {
        RestFragment fragment = new RestFragment();
        Bundle args = new Bundle();

        args.putString(WORKOUTNAMETEXT, workoutName);
        args.putString(REPLISTTEXT,repsList);
        args.putInt(WORKOUTGIF,gifIndex);
        args.putString(EXERCISENUMBER,nextWorkoutNumber);

        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            updatedWorkoutName = getArguments().getString(WORKOUTNAMETEXT);
            updatedRepsList = getArguments().getString(REPLISTTEXT);
            updatedGif =  getArguments().getInt(WORKOUTGIF);
            updateNextWorkoutNumber = getArguments().getString(EXERCISENUMBER);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_rest, container, false);
        workoutNameTextView = view.findViewById(R.id.fragmentWorkoutName);
        nextRepsTextView = view.findViewById(R.id.nextReps);
        buttonFragmentImageView = view.findViewById(R.id.skipBtn);
        showNextWorkoutGifsImageView = view.findViewById(R.id.restGifs);
        nextWorkoutNumberTextView = view.findViewById(R.id.nextWorkoutNumber);

        workoutNameTextView.setText(updatedWorkoutName);
        nextRepsTextView.setText(updatedRepsList);
        showNextWorkoutGifsImageView.setImageResource(updatedGif);
        nextWorkoutNumberTextView.setText(updateNextWorkoutNumber);

        nextRepsTextView.requestFocus();
        workoutNameTextView.requestFocus();
        showNextWorkoutGifsImageView.requestFocus();
        nextWorkoutNumberTextView.requestFocus();

        buttonFragmentImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newWorkoutName = workoutNameTextView.getText().toString();
//                String newRepList = nextReps.getText().toString();
                sendBack(newWorkoutName);
            }
        });
        return view;
    }
    public void sendBack(String workoutName) {
        if (mListener != null) {
            mListener.onFragmentInteraction(workoutName);
        }
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(String sendBackWorkoutName);
    }
}