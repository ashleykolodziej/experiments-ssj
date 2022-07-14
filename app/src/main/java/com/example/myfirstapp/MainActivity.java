package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // Declare the extra message constant
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the user taps the Send button. You need to go to the XML to create the connection using the onClick attribute.
     */
    public void sendMessage(View view) {
        // Bind this with the function (class, activity) this should start.
        Intent myIntent = new Intent(this, DisplayMessageActivity.class);

        // Create an editable text widget using the UI element in activity_main.xml
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);

        // Nope lol just a string
        String message = editText.getText().toString();

        // Gonna put some extra data in here: my message, and store it in the EXTRA_MESSAGE key
        myIntent.putExtra(EXTRA_MESSAGE, message);

        // Kick off the intent, using the DisplayMessageActivity (class) above
        startActivity(myIntent);
    }
}