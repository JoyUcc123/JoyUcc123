package com.example.uccapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.example.uccapp.databinding.ActivityAdmissionsBinding;

public class Admissions extends DrawerBaseActivity {

    ActivityAdmissionsBinding activityAdmissionsBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityAdmissionsBinding = ActivityAdmissionsBinding.inflate(getLayoutInflater());
        setContentView(activityAdmissionsBinding.getRoot());
        allocateActivityTitle("Admissions");

        // on below line we are initializing the variables
        Button applybtn = findViewById(R.id.applybtn);
        ImageView instagram = findViewById(R.id.instagram);
        ImageView facebook = findViewById(R.id.facebook);
        ImageView twitter = findViewById(R.id.twitter);


        // on click listener for links
        applybtn.setOnClickListener(v -> {

            Uri uri = Uri.parse("https://ucc.edu.jm/apply");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        instagram.setOnClickListener(v -> {

            Uri uri = Uri.parse("https://instagram.com/uccjamaica");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        facebook.setOnClickListener(v -> {

            Uri uri = Uri.parse("https://m.facebook.com/uccjamaica");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        twitter.setOnClickListener(v -> {

            Uri uri = Uri.parse("https://twitter.com/uccjamaica");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });
    }
}