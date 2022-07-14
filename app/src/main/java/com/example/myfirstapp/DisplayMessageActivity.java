package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the intent that started this activity
        Intent myIntent = getIntent();

        // Get the extra from inside of main activity. Remember, it's stored in EXTRA_MESSAGE.
        String message = myIntent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Connect this code to the UI, and tell it it is a text view widget
        TextView textView = findViewById(R.id.textView);

        // Set the message in the text view to the message we grabbed above
        textView.setText(message);
    }
}