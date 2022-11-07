package com.example.uccapp;

import android.os.Bundle;

import com.example.uccapp.databinding.ActivityTimetableBinding;

public class Timetable extends DrawerBaseActivity {

    ActivityTimetableBinding activityTimetableBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityTimetableBinding = ActivityTimetableBinding.inflate(getLayoutInflater());
        setContentView(activityTimetableBinding.getRoot());
        allocateActivityTitle("Timetable");
    }
}