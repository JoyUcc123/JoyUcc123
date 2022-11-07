package com.example.uccapp;

import android.os.Bundle;

import com.example.uccapp.databinding.ActivityCoursesBinding;


public class Courses extends DrawerBaseActivity{

    ActivityCoursesBinding activityCoursesBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityCoursesBinding = ActivityCoursesBinding.inflate(getLayoutInflater());
        setContentView(activityCoursesBinding.getRoot());
        allocateActivityTitle("Courses");

    }
}