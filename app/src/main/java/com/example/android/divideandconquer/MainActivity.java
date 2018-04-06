package com.example.android.divideandconquer;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int numberCorrectAnswers = 0;
    CheckBox question_5aCorrect;
    CheckBox question_5bCorrect;
    CheckBox question_5dCorrect;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//This is the radiobutton list for question one, with choice B as the correct answer

    public void onQuestionOneClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question1bCorrect:
                if (checked)
                    // Correct answer, and one point is added to the number of correct answers
                    numberCorrectAnswers = numberCorrectAnswers + 1;
                break;
            case R.id.question_1a:
                if (checked)
                    break;
            case R.id.question_1c:
                if (checked)
                    break;
            case R.id.question_1d:
                if (checked)
                    break;
        }
    }

    //This is the radiobutton list for question two, with choice A as the correct answer
    public void onQuestionTwoClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_2aCorrect:
                if (checked)
                    // Correct answer, and one point is added to the number of correct answers
                    numberCorrectAnswers = numberCorrectAnswers + 1;
                break;
            case R.id.question2b:
                if (checked)
                    break;
            case R.id.question_2c:
                if (checked)
                    break;
            case R.id.question_2d:
                if (checked)
                    break;
        }
    }

    //This is the radiobutton list for question three, with choice B as the correct answer
    public void onQuestionThreeClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question3bCorrect:
                if (checked)
                    // Correct answer, and one point is added to the number of correct answers
                    numberCorrectAnswers = numberCorrectAnswers + 1;
                break;
            case R.id.question_3a:
                if (checked)
                    break;
            case R.id.question_3c:
                if (checked)
                    break;
            case R.id.question_3d:
                if (checked)
                    break;
        }
    }

    //This is the radiobutton list for question four, with choice B as the correct answer
    public void onQuestionFourClicked(View view) {
        // Is the button now clicked?
        boolean clicked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question4bCorrect:
                if (clicked)
                    // Correct answer, and one point is added to the number of correct answers
                    numberCorrectAnswers = numberCorrectAnswers + 1;
                break;
            case R.id.question_4a:
                if (clicked)
                    break;
            case R.id.question_4c:
                if (clicked)
                    break;
            case R.id.question_4d:
                if (clicked)
                    break;
        }
    }

    //This is the checkbox list for question five, where A, B, and D have to be checked in order for a point to be added.
    public void onQuestionFiveClicked(View view) {
        question_5aCorrect = findViewById(R.id.question_5aCorrect);
        boolean correctAnswer5aChecked = question_5aCorrect.isChecked();

        question_5bCorrect = findViewById(R.id.question_5bCorrect);
        boolean correctAnswer5bChecked = question_5bCorrect.isChecked();

        question_5dCorrect = findViewById(R.id.question_5dCorrect);
        boolean correctAnswer5dChecked = question_5dCorrect.isChecked();

        // Correct answer when A, B, and D are checked, and one point is added to the number of correct answers
        if (correctAnswer5aChecked && correctAnswer5bChecked && correctAnswer5dChecked) {
            numberCorrectAnswers = numberCorrectAnswers + 1;
        } else {
            numberCorrectAnswers = numberCorrectAnswers + 0;
        }
    }

    //This is the input text question number six. The user has to enter "divisor" and press enter.
    public void onQuestionSixClicked(View view) {
        EditText inputTextQuestion6 = findViewById(R.id.question_6Answered);
        String questionSixAnswer = inputTextQuestion6.getText().toString();
        String question_6_text_answer = "divisor";

        // Correct answer, case doesn't matter, and one point is added to the number of correct answers
        if (questionSixAnswer.equalsIgnoreCase(question_6_text_answer)) {
            numberCorrectAnswers = numberCorrectAnswers + 1;
        }
    }

    //This method happens when the Submit button is clicked, showing a Toast message with the score.
    public void submitButtonClicked(View submit_answers) {
        Context context = getApplicationContext();
        CharSequence text = "You got " + numberCorrectAnswers + " out of 6 problems correct!";
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    //This method happens when the Reset button is clicked, restarting the entire activity.
    public void resetButton(View view) {
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }
}


