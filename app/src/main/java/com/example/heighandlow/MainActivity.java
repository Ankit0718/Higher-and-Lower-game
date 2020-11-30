package com.example.heighandlow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    int randomNumber;
    public void generateRandomNumber(){
        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }
    public void click(View view){
        EditText editText = findViewById(R.id.editText);
         int GuessValue = Integer.parseInt(editText.getText().toString());
         String message;
         if (GuessValue > randomNumber)
         {
             message = "LOWER!";
         }
         else if(GuessValue < randomNumber){
             message = "HIGHER!";
        }
         else {
             message = "You got it!,try again!";
             generateRandomNumber();
         }
        Toast.makeText(this,message ,Toast.LENGTH_SHORT).show();
        Log.i("Entered Value",editText.getText().toString());
        Log.i("Random Number",Integer.toString(randomNumber));

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          generateRandomNumber();
    }
}