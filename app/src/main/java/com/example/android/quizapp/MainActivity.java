package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int totalNumberOfQuestions = 9;
    int noOfQuestionsAnswered = 0;
    int numberOfCheckboxesChecked = 0;
    //int noOfCorrectQuestionsAnswered = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    /**
     * This method is called when the Submit Answers button is clicked.
     */

    public void submitAnswersButton(View view) {

        int finalMarks = markQuestions();

        Toast.makeText(this, "You answered " + finalMarks + " questions correctly!", Toast.LENGTH_SHORT).show();
    }

    // This method handles the click event for Question 1 RadioButtons
    public void onQuestionOneRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checkedQuestionOne = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_one_radio_button_a:
                if (checkedQuestionOne)
                    // NaMeBeThis
                    break;
            case R.id.question_one_radio_button_b:
                if (checkedQuestionOne)
                    // NAmeBEthis
                    break;
            case R.id.question_one_radio_button_c:
                if (checkedQuestionOne)
                    // NAMEBETHIS
                    break;
            case R.id.question_one_radio_button_d:
                if (checkedQuestionOne)
                    // naMeBeThis
                    break;
        }
    }

    // This method handles the click event for Question 2 RadioButtons
    public void onQuestionTwoRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checkedQuestionTwo = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_two_radio_button_a:
                if (checkedQuestionTwo)
                    // LinearLayout
                    break;
            case R.id.question_two_radio_button_b:
                if (checkedQuestionTwo)
                    // ImageView
                    break;
            case R.id.question_two_radio_button_c:
                if (checkedQuestionTwo)
                    // Button
                    break;
            case R.id.question_two_radio_button_d:
                if (checkedQuestionTwo)
                    // RelativeLayout
                    break;
        }
    }

    // This method handles the click event for Question 3 RadioButtons
    public void onQuestionThreeRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checkedQuestionThree = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_three_radio_button_true:
                if (checkedQuestionThree)
                    // True
                    break;
            case R.id.question_three_radio_button_false:
                if (checkedQuestionThree)
                    // False
                    break;
        }
    }

    // This method handles the click event for Question 4 RadioButtons
    public void onQuestionFourRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checkedQuestionFour = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_four_radio_button_a:
                if (checkedQuestionFour)
                    // Question mark (?)
                    break;
            case R.id.question_four_radio_button_b:
                if (checkedQuestionFour)
                    // Comma (,)
                    break;
            case R.id.question_four_radio_button_c:
                if (checkedQuestionFour)
                    // Semi colon (;)
                    break;
            case R.id.question_four_radio_button_d:
                if (checkedQuestionFour)
                    // Exclamation mark (!)
                    break;
        }
    }

    // This method handles the click event for Question 5 RadioButtons
    public void onQuestionFiveRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checkedQuestionFive = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_five_radio_button_a:
                if (checkedQuestionFive)
                    // sp
                    break;
            case R.id.question_five_radio_button_b:
                if (checkedQuestionFive)
                    // tz
                    break;
            case R.id.question_five_radio_button_c:
                if (checkedQuestionFive)
                    // jz
                    break;
            case R.id.question_five_radio_button_d:
                if (checkedQuestionFive)
                    // sz
                    break;
        }
    }

    // This method handles click events for Question 6 checkboxes
    // It allows the user to check only 3 checkboxes at a time
    // If 3 checkboxes are checked and the user changes his/her mind and wants to select the last unchecked button,
    // he/she has to uncheck one checkbox first
    public void onQuestionSixCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.question_six_checkbox_a:
                if (checked && numberOfCheckboxesChecked >= 3){
                    ((CheckBox) view).setChecked(false);
                    Toast.makeText(this, R.string.tooManyOptionsSelectedFloat, Toast.LENGTH_LONG).show();
                }
                else {
                    // the checkbox either got unchecked
                    // or there are less than 3 other checkboxes checked
                    if (checked) {
                        numberOfCheckboxesChecked ++;
                    }
                    else {
                        numberOfCheckboxesChecked --;
                    }
                }
                break;
            case R.id.question_six_checkbox_b: // Position the views - 1/3 of correct answer
                if (checked && numberOfCheckboxesChecked >= 3){
                    ((CheckBox) view).setChecked(false);
                    Toast.makeText(this, R.string.tooManyOptionsSelectedFloat, Toast.LENGTH_LONG).show();
                }
                else {
                    // the checkbox either got unchecked
                    // or there are less than 3 other checkboxes checked
                    if (checked) {
                        numberOfCheckboxesChecked ++;
                    }
                    else {
                        numberOfCheckboxesChecked --;
                    }
                }
                break;
            case R.id.question_six_checkbox_c: // Style the views - 1/3 of correct answer
                if (checked && numberOfCheckboxesChecked >= 3){
                    ((CheckBox) view).setChecked(false);
                    Toast.makeText(this, R.string.tooManyOptionsSelectedFloat, Toast.LENGTH_LONG).show();
                }
                else {
                    // the checkbox either got unchecked
                    // or there are less than 3 other checkboxes checked
                    if (checked) {
                        numberOfCheckboxesChecked ++;
                    }
                    else {
                        numberOfCheckboxesChecked --;
                    }
                }
                break;
            case R.id.question_six_checkbox_d: // Select the views - 1/3 of correct answer
                if (checked && numberOfCheckboxesChecked >= 3){
                    ((CheckBox) view).setChecked(false);
                    Toast.makeText(this, R.string.tooManyOptionsSelectedFloat, Toast.LENGTH_LONG).show();
                }
                else {
                    // the checkbox either got unchecked
                    // or there are less than 3 other checkboxes checked
                    if (checked) {
                        numberOfCheckboxesChecked ++;
                    }
                    else {
                        numberOfCheckboxesChecked --;
                    }
                }
                break;
        }
    }

    // This method handles the click event for Question 7 RadioButtons
    public void onQuestionSevenRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checkedQuestionSeven = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_seven_radio_button_a:
                if (checkedQuestionSeven)
                    // Layout
                    break;
            case R.id.question_seven_radio_button_b:
                if (checkedQuestionSeven)
                    // Styles
                    break;
            case R.id.question_seven_radio_button_c: // Correct answer
                if (checkedQuestionSeven)
                    // Drawable
                    break;
            case R.id.question_seven_radio_button_d:
                if (checkedQuestionSeven)
                    // Manifest
                    break;
        }
    }

    // This method handles the click event for Question 8 RadioButtons
    public void onQuestionEightRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checkedQuestionEight = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_eight_radio_button_a: // Correct answer
                if (checkedQuestionEight)
                    // Debug
                    break;
            case R.id.question_eight_radio_button_b:
                if (checkedQuestionEight)
                    // Run
                    break;
            case R.id.question_eight_radio_button_c:
                if (checkedQuestionEight)
                    // Refactor
                    break;
            case R.id.question_eight_radio_button_d:
                if (checkedQuestionEight)
                    // Gradle
                    break;
        }
    }

    // This method contains the marking scheme and assigns 1 point to every correct answer
    private int markQuestions(){

        // Correct Answers to questions (1, 2, 3, 4, 5, 7, 8)
        int noOfCorrectQuestionsAnswered = 0;

        // Question 1 (1 mark)
        RadioButton questionOneRadioButtonD = findViewById(R.id.question_one_radio_button_d);
        boolean answerQuestionOneRadioButtonD = questionOneRadioButtonD.isChecked();

        if (answerQuestionOneRadioButtonD){
            noOfCorrectQuestionsAnswered ++;
        }
        // Question 2 (1 mark)
        RadioButton questionTwoRadioButtonD = findViewById(R.id.question_two_radio_button_d);
        boolean answerQuestionTwoRadioButtonD = questionTwoRadioButtonD.isChecked();

        if (answerQuestionTwoRadioButtonD){
            noOfCorrectQuestionsAnswered ++;
        }
        // Question 3 (1 mark)
        RadioButton questionThreeRadioButtonTrue = findViewById(R.id.question_three_radio_button_true);
        boolean answerQuestionThreeRadioButtonTrue = questionThreeRadioButtonTrue.isChecked();

        if (answerQuestionThreeRadioButtonTrue){
            noOfCorrectQuestionsAnswered ++;
        }
        // Question 4 (1 mark)
        RadioButton questionFourRadioButtonC = findViewById(R.id.question_four_radio_button_c);
        boolean answerQuestionFourRadioButtonC = questionFourRadioButtonC.isChecked();

        if (answerQuestionFourRadioButtonC){
            noOfCorrectQuestionsAnswered ++;
        }
        // Question 5 (1 mark)
        RadioButton questionFiveRadioButtonA = findViewById(R.id.question_five_radio_button_a);
        boolean answerQuestionFiveRadioButtonA = questionFiveRadioButtonA.isChecked();

        if (answerQuestionFiveRadioButtonA){
            noOfCorrectQuestionsAnswered ++;
        }
        // Question 6 (1 mark)
        // Determines if the user checks B
        CheckBox questionSixCheckboxB = findViewById(R.id.question_six_checkbox_b);
        boolean answerQuestionSixCheckboxB = questionSixCheckboxB.isChecked();

        // Determines if the user checks C
        CheckBox questionSixCheckboxC = findViewById(R.id.question_six_checkbox_c);
        boolean answerQuestionSixCheckboxC = questionSixCheckboxC.isChecked();

        // Determines if the user checks D
        CheckBox questionSixCheckboxD = findViewById(R.id.question_six_checkbox_d);
        boolean answerQuestionSixCheckboxD = questionSixCheckboxD.isChecked();

        if (answerQuestionSixCheckboxB
                && answerQuestionSixCheckboxC
                && answerQuestionSixCheckboxD){
            noOfCorrectQuestionsAnswered ++;
        }
        // Question 7 (1 mark)
        RadioButton questionSevenRadioButtonC = findViewById(R.id.question_seven_radio_button_c);
        boolean answerQuestionSevenRadioButtonC = questionSevenRadioButtonC.isChecked();

        if (answerQuestionSevenRadioButtonC){
            noOfCorrectQuestionsAnswered ++;
        }
        // Question 8 (1 mark)
        RadioButton questionEightRadioButtonA = findViewById(R.id.question_eight_radio_button_a);
        boolean answerQuestionEightRadioButtonA = questionEightRadioButtonA.isChecked();

        if (answerQuestionEightRadioButtonA){
            noOfCorrectQuestionsAnswered ++;
        }
        return noOfCorrectQuestionsAnswered;
    }
}

