package com.example.uccapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;

import com.example.uccapp.databinding.ActivityFacultyBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class Faculty extends DrawerBaseActivity {

    ActivityFacultyBinding activityFacultyBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityFacultyBinding = ActivityFacultyBinding.inflate(getLayoutInflater());
        setContentView(activityFacultyBinding.getRoot());
        allocateActivityTitle("Faculty & Staff");

        // on below line we are initializing the variables.
        FloatingActionButton eFAB = findViewById(R.id.eFAB);
        CardView card =findViewById(R.id.card);
        CardView card2 =findViewById(R.id.card2);
        CardView card3 =findViewById(R.id.card3);
        CardView card4 =findViewById(R.id.card4);


        // on click listener for email
        card.setOnClickListener(v -> {

            Intent Email = new Intent(Intent.ACTION_SEND);
            Email.setType("text/email");

            Email.putExtra(Intent.EXTRA_EMAIL, new String[]{"JaneDoe@ucc.co"});
            Email.putExtra(Intent.EXTRA_SUBJECT, "Add your Subject");
            Email.putExtra(Intent.EXTRA_TEXT, "Dear Sir/Madam," + "");
            startActivity(Intent.createChooser(Email, "Send Feedback:"));
        });

        // on click listener for email
        card2.setOnClickListener(v -> {

            Intent Email = new Intent(Intent.ACTION_SEND);
            Email.setType("text/email");

            Email.putExtra(Intent.EXTRA_EMAIL, new String[]{"SamJones@ucc.co"});
            Email.putExtra(Intent.EXTRA_SUBJECT, "Add your Subject");
            Email.putExtra(Intent.EXTRA_TEXT, "Dear Sir/Madam," + "");
            startActivity(Intent.createChooser(Email, "Send Feedback:"));
        });

        // on click listener for email
        card3.setOnClickListener(v -> {

            Intent Email = new Intent(Intent.ACTION_SEND);
            Email.setType("text/email");

            Email.putExtra(Intent.EXTRA_EMAIL, new String[]{"JackMoore@ucc.co"});
            Email.putExtra(Intent.EXTRA_SUBJECT, "Add your Subject");
            Email.putExtra(Intent.EXTRA_TEXT, "Dear Sir/Madam," + "");
            startActivity(Intent.createChooser(Email, "Send Feedback:"));
        });

        // on click listener for email
        card4.setOnClickListener(v -> {

            Intent Email = new Intent(Intent.ACTION_SEND);
            Email.setType("text/email");

            Email.putExtra(Intent.EXTRA_EMAIL, new String[]{"KenCole@ucc.co"});
            Email.putExtra(Intent.EXTRA_SUBJECT, "Add your Subject");
            Email.putExtra(Intent.EXTRA_TEXT, "Dear Sir/Madam," + "");
            startActivity(Intent.createChooser(Email, "Send Feedback:"));
        });

        // on click listener for email
        eFAB.setOnClickListener(v -> {

                Intent Email = new Intent(Intent.ACTION_SEND);
                Email.setType("text/email");

                Email.putExtra(Intent.EXTRA_EMAIL, new String[]{"HOD@ucc.co"});
                Email.putExtra(Intent.EXTRA_SUBJECT, "Add your Subject");
                Email.putExtra(Intent.EXTRA_TEXT, "Dear Sir/Madam," + "");
                startActivity(Intent.createChooser(Email, "Send Feedback:"));
        });
    }

}