package com.example.ayush.quizproject;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int points = 0;

    public void submitButton(View v) {
        checkallquestionanswers();
        Toast.makeText(MainActivity.this, "Correct Answers: " + points + "/4", Toast.LENGTH_LONG).show();
        resetallanswers();
    }

    private void resetallanswers() {
        points = 0;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Getting the value of answer 1 from user
     *
     * @return
     */

    private String getquestion1answer() {
        EditText ques1userinput = (EditText) findViewById(R.id.userinputquestion1);
        String answer1 = ques1userinput.getText().toString();
        return String.valueOf(answer1);
    }

    /**
     * Checking the value of answer entered ny user
     */
    private void checkanswer1() {
        String name = getquestion1answer();
        if (name.trim().equalsIgnoreCase("Bitcoin")) {
            points += 1;
        }
    }

    /**
     * Checking the answer of question 2
     */
    private void checkanswer2() {
        @SuppressLint("WrongViewCast") RadioButton radioButtonPortal2 = findViewById(R.id.r1b);
        boolean isradiobuttonquestion2checked = radioButtonPortal2.isChecked();
        if (isradiobuttonquestion2checked) {
            points += 1;
        }
    }

    /**
     * Checking the answer of question 3
     */
    private void checkanswer3() {
        @SuppressLint("WrongViewCast") RadioButton radioButtonPortal3 = findViewById(R.id.c1a);
        boolean isradiobuttonquestion3checked = radioButtonPortal3.isChecked();
        if (isradiobuttonquestion3checked) {
            points += 1;
        }
    }

    private void checkanswer4() {
        CheckBox question4optionb = (CheckBox) findViewById(R.id.c4b);
        CheckBox question4optiona = (CheckBox) findViewById(R.id.c4a);
        CheckBox question4optionc = (CheckBox) findViewById(R.id.c4c);
        CheckBox question4optiond = (CheckBox) findViewById(R.id.c4d);


        boolean isquetion4optionbchecked = question4optionb.isChecked();


        boolean isquetion4optionachecked = question4optiona.isChecked();
        boolean isquetion4optioncchecked = question4optionc.isChecked();
        boolean isquetion4optiondchecked = question4optiond.isChecked();
        if (isquetion4optionachecked && !isquetion4optionbchecked && isquetion4optioncchecked && isquetion4optiondchecked) {
            points += 1;
        }
    }

    private void checkallquestionanswers() {
        checkanswer1();
        checkanswer2();
        checkanswer3();
        checkanswer4();
    }

}

