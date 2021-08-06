package com.example.counterapp;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //declare all variables used in the class
    private int counter;
    private TextView counterDisplay;
    private Button incrementButton, decrementButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //biding view components
        counterDisplay = findViewById(R.id.counter);
        incrementButton = findViewById(R.id.add_button);

        //set the counter to 0 when the app created
        counterDisplay.setText("0");

        //add functionality to increment the counter by 1
        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = Integer.parseInt(counterDisplay.getText().toString());
                counter += 1;
                counterDisplay.setText(Integer.toString(counter));
            }
        });

        //add functionality to decrement the counter by 1
        decrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
            }
        });
    }
}