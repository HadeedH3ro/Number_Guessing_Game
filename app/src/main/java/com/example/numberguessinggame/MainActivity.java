package com.example.numberguessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int n;
    String message = "";

    public void randomNumberGenerator(){
        Random rand = new Random();
        n = rand.nextInt(20) + 1;
    }

    public void guess(View view){
        EditText guess = (EditText) findViewById(R.id.guess);
        int guessInt = Integer.parseInt(guess.getText().toString());

        if(n> guessInt){
            message = "Higher";
        }
        else if (n < guessInt){
            message = "Lower";
        }
        else if(n == guessInt){
            message = "That's right Play again";
            randomNumberGenerator();
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randomNumberGenerator();
    }
}