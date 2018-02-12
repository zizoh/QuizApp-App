package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int totalNumberOfQuestions = 8;
    int noOfQuestionsAnswered = 0;
    int numberOfCheckboxesChecked = 0;
    int questionOneAnswered = 0;
    int questionTwoAnswered = 0;
    int questionThreeAnswered = 0;
    int questionFourAnswered = 0;
    int questionFiveAnswered = 0;
    int questionSixAnswered = 0;
    int questionSevenAnswered = 0;
    int questionEightAnswered = 0;

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

    public void submitAnswers(View view) {

        int finalMarks = markQuestions();
        EditText userName = (EditText) findViewById(R.id.username);

        Toast.makeText(this, "Hey " + userName.getText() + ", you scored " + finalMarks + "/" + totalNumberOfQuestions + "!", Toast.LENGTH_LONG).show();
    }

    // This method handles the click event for Question 1 RadioButtons
    public void onQuestionOneRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checkedQuestionOne = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_one_radio_button_a:
                if (checkedQuestionOne && questionOneAnswered == 1) {
                } else {
                    if (checkedQuestionOne) {    // NaMeBeThis
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionOneAnswered = 1;
                    }
                }
                    break;
            case R.id.question_one_radio_button_b:
                if (checkedQuestionOne && questionOneAnswered == 1) {
                } else {
                    if (checkedQuestionOne) {    // NAmeBEthis
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionOneAnswered = 1;
                    }
                }
                    break;
            case R.id.question_one_radio_button_c:
                if (checkedQuestionOne && questionOneAnswered == 1) {
                } else {
                    if (checkedQuestionOne) {    // NAMEBETHIS
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionOneAnswered = 1;
                    }
                }
                    break;
            case R.id.question_one_radio_button_d:
                if (checkedQuestionOne && questionOneAnswered == 1) {
                } else {
                    if (checkedQuestionOne) {    // naMeBeThis
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionOneAnswered = 1;
                    }
                }
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
                if (checkedQuestionTwo && questionTwoAnswered == 1) {
                } else {
                    if (checkedQuestionTwo) {    // LinearLayout
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionTwoAnswered = 1;
                    }
                }
                    break;
            case R.id.question_two_radio_button_b:
                if (checkedQuestionTwo && questionTwoAnswered == 1) {
                } else {
                    if (checkedQuestionTwo) {    // ImageView
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionTwoAnswered = 1;
                    }
                }
                    break;
            case R.id.question_two_radio_button_c:
                if (checkedQuestionTwo && questionTwoAnswered == 1) {
                } else {
                    if (checkedQuestionTwo) {    // Button
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionTwoAnswered = 1;
                    }
                }
                    break;
            case R.id.question_two_radio_button_d:
                if (checkedQuestionTwo && questionTwoAnswered == 1) {
                } else {
                    if (checkedQuestionTwo) {    // RelativeLayout
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionTwoAnswered = 1;
                    }
                }
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
                if (checkedQuestionThree && questionThreeAnswered == 1) {
                } else {
                    if (checkedQuestionThree) {  // True
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionThreeAnswered = 1;
                    }
                }
                    break;
            case R.id.question_three_radio_button_false:
                if (checkedQuestionThree && questionThreeAnswered == 1) {
                } else {
                    if (checkedQuestionThree) {  // False
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionThreeAnswered = 1;
                    }
                }
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
                if (checkedQuestionFour && questionFourAnswered == 1) {
                } else {
                    if (checkedQuestionFour) {   // Question mark (?)
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionFourAnswered = 1;
                    }
                }
                    break;
            case R.id.question_four_radio_button_b:
                if (checkedQuestionFour && questionFourAnswered == 1) {
                } else {
                    if (checkedQuestionFour) {   // Comma (,)
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionFourAnswered = 1;
                    }
                }
                    break;
            case R.id.question_four_radio_button_c:
                if (checkedQuestionFour && questionFourAnswered == 1) {
                } else {
                    if (checkedQuestionFour) {   // Semi colon (;)
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionFourAnswered = 1;
                    }
                }
                    break;
            case R.id.question_four_radio_button_d:
                if (checkedQuestionFour && questionFourAnswered == 1) {
                } else {
                    if (checkedQuestionFour) {   // Exclamation mark (!)
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionFourAnswered = 1;
                    }
                }
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
                if (checkedQuestionFive && questionFiveAnswered == 1) {
                } else {
                    if (checkedQuestionFive) {   // sp
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionFiveAnswered = 1;
                    }
                }
                    break;
            case R.id.question_five_radio_button_b:
                if (checkedQuestionFive && questionFiveAnswered == 1) {
                } else {
                    if (checkedQuestionFive) {   // tz
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionFiveAnswered = 1;
                    }
                }
                    break;
            case R.id.question_five_radio_button_c:
                if (checkedQuestionFive && questionFiveAnswered == 1) {
                } else {
                    if (checkedQuestionFive) {   // jz
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionFiveAnswered = 1;
                    }
                }
                    break;
            case R.id.question_five_radio_button_d:
                if (checkedQuestionFive && questionFiveAnswered == 1) {
                } else {
                    if (checkedQuestionFive) {   // sz
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionFiveAnswered = 1;
                    }
                }
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
        switch (view.getId()) {
            case R.id.question_six_checkbox_a:
                // If the 4th Checkbox is checked when the 3 are already checked
                if (checked && numberOfCheckboxesChecked == 3) {
                    ((CheckBox) view).setChecked(false);
                    Toast.makeText(this, R.string.tooManyOptionsSelectedFloat, Toast.LENGTH_LONG).show();
                }
                // This was the first time one of the Checkboxes is checked
                else if (checked && numberOfCheckboxesChecked == 0) {
                    numberOfCheckboxesChecked++;
                    noOfQuestionsAnswered++;
                    checkProgressBar(view);
                    questionSixAnswered++;// Copy the views
                }
                // If at least 1 Checkbox is checked
                else if (checked && numberOfCheckboxesChecked >= 1) {
                    numberOfCheckboxesChecked++;
                } else {
                    // If only 1 Checkbox was Checked and now unchecked
                    // the question becomes unanswered
                    if (numberOfCheckboxesChecked == 1) {
                        numberOfCheckboxesChecked--;
                        noOfQuestionsAnswered--;
                        checkProgressBar(view);
                        questionSixAnswered--;
                    }
                    // If more than 1 Checkboxes were checked and one is now unchecked
                    else if (numberOfCheckboxesChecked > 1) {
                        numberOfCheckboxesChecked--;
                    }
                }
                break;
            case R.id.question_six_checkbox_b: // Position the views - 1/3 of correct answer
                // If the 4th Checkbox is checked when the 3 are already checked
                if (checked && numberOfCheckboxesChecked == 3) {
                    ((CheckBox) view).setChecked(false);
                    Toast.makeText(this, R.string.tooManyOptionsSelectedFloat, Toast.LENGTH_LONG).show();
                }
                // This was the first time one of the Checkboxes is checked
                else if (checked && numberOfCheckboxesChecked == 0) {
                    numberOfCheckboxesChecked++;
                    noOfQuestionsAnswered++;
                    checkProgressBar(view);
                    questionSixAnswered++;// Copy the views
                }
                // If at least 1 Checkbox is checked
                else if (checked && numberOfCheckboxesChecked >= 1) {
                    numberOfCheckboxesChecked++;
                } else {
                    // If only 1 Checkbox was Checked and now unchecked
                    // the question becomes unanswered
                    if (numberOfCheckboxesChecked == 1) {
                        numberOfCheckboxesChecked--;
                        noOfQuestionsAnswered--;
                        checkProgressBar(view);
                        questionSixAnswered--;
                    }
                    // If more than 1 Checkboxes were checked and one is now unchecked
                    else if (numberOfCheckboxesChecked > 1) {
                        numberOfCheckboxesChecked--;
                    }
                }
                break;
            case R.id.question_six_checkbox_c: // Style the views - 1/3 of correct answer
                // If the 4th Checkbox is checked when the 3 are already checked
                if (checked && numberOfCheckboxesChecked == 3) {
                    ((CheckBox) view).setChecked(false);
                    Toast.makeText(this, R.string.tooManyOptionsSelectedFloat, Toast.LENGTH_LONG).show();
                }
                // This was the first time one of the Checkboxes is checked
                else if (checked && numberOfCheckboxesChecked == 0) {
                    numberOfCheckboxesChecked++;
                    noOfQuestionsAnswered++;
                    checkProgressBar(view);
                    questionSixAnswered++;// Copy the views
                }
                // If at least 1 Checkbox is checked
                else if (checked && numberOfCheckboxesChecked >= 1) {
                    numberOfCheckboxesChecked++;
                } else {
                    // If only 1 Checkbox was Checked and now unchecked
                    // the question becomes unanswered
                    if (numberOfCheckboxesChecked == 1) {
                        numberOfCheckboxesChecked--;
                        noOfQuestionsAnswered--;
                        checkProgressBar(view);
                        questionSixAnswered--;
                    }
                    // If more than 1 Checkboxes were checked and one is now unchecked
                    else if (numberOfCheckboxesChecked > 1) {
                        numberOfCheckboxesChecked--;
                    }
                }
                break;
            case R.id.question_six_checkbox_d: // Select the views - 1/3 of correct answer
                // If the 4th Checkbox is checked when the 3 are already checked
                if (checked && numberOfCheckboxesChecked == 3) {
                    ((CheckBox) view).setChecked(false);
                    Toast.makeText(this, R.string.tooManyOptionsSelectedFloat, Toast.LENGTH_LONG).show();
                }
                // This was the first time one of the Checkboxes is checked
                else if (checked && numberOfCheckboxesChecked == 0) {
                    numberOfCheckboxesChecked++;
                    noOfQuestionsAnswered++;
                    checkProgressBar(view);
                    questionSixAnswered++;// Copy the views
                }
                // If at least 1 Checkbox is checked
                else if (checked && numberOfCheckboxesChecked >= 1) {
                    numberOfCheckboxesChecked++;
                } else {
                    // If only 1 Checkbox was Checked and now unchecked
                    // the question becomes unanswered
                    if (numberOfCheckboxesChecked == 1) {
                        numberOfCheckboxesChecked--;
                        noOfQuestionsAnswered--;
                        checkProgressBar(view);
                        questionSixAnswered--;
                    }
                    // If more than 1 Checkboxes were checked and one is now unchecked
                    else if (numberOfCheckboxesChecked > 1) {
                        numberOfCheckboxesChecked--;
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
                if (checkedQuestionSeven && questionSevenAnswered == 1) {
                } else {
                    if (checkedQuestionSeven) {  // Layout
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionSevenAnswered = 1;
                    }
                }
                    break;
            case R.id.question_seven_radio_button_b:
                if (checkedQuestionSeven && questionSevenAnswered == 1) {
                } else {
                    if (checkedQuestionSeven) {  // Styles
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionSevenAnswered = 1;
                    }
                }
                    break;
            case R.id.question_seven_radio_button_c: // Correct answer
                if (checkedQuestionSeven && questionSevenAnswered == 1) {
                } else {
                    if (checkedQuestionSeven) {  // Drawable
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionSevenAnswered = 1;
                    }
                }
                    break;
            case R.id.question_seven_radio_button_d:
                if (checkedQuestionSeven && questionSevenAnswered == 1) {
                } else {
                    if (checkedQuestionSeven) {  // Manifest
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionSevenAnswered = 1;
                    }
                }
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
                if (checkedQuestionEight && questionEightAnswered == 1) {
                } else {
                    if (checkedQuestionEight) {  // Debug
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionEightAnswered = 1;
                    }
                }
                    break;
            case R.id.question_eight_radio_button_b:
                if (checkedQuestionEight && questionEightAnswered == 1) {
                } else {
                    if (checkedQuestionEight) {  // Run
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionEightAnswered = 1;
                    }
                }
                    break;
            case R.id.question_eight_radio_button_c:
                if (checkedQuestionEight && questionEightAnswered == 1) {
                } else {
                    if (checkedQuestionEight) {  // Refactor
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionEightAnswered = 1;
                    }
                }
                    break;
            case R.id.question_eight_radio_button_d:
                if (checkedQuestionEight && questionEightAnswered == 1) {
                } else {
                    if (checkedQuestionEight) {  // Gradle
                        noOfQuestionsAnswered++;
                        checkProgressBar(view);
                        questionEightAnswered = 1;
                    }
                }
                    break;
        }
    }

    // This method contains the marking scheme and assigns 1 point to every correct answer
    private int markQuestions() {

        // Correct Answers to all questions
        int noOfCorrectQuestionsAnswered = 0;

        // Question 1 correct answer Button D (1 mark)
        RadioButton questionOneRadioButtonD = findViewById(R.id.question_one_radio_button_d);
        boolean answerQuestionOneRadioButtonD = questionOneRadioButtonD.isChecked();

        if (answerQuestionOneRadioButtonD) {
            noOfCorrectQuestionsAnswered++;
        }
        // Question 2 correct answer Button D (1 mark)
        RadioButton questionTwoRadioButtonD = findViewById(R.id.question_two_radio_button_d);
        boolean answerQuestionTwoRadioButtonD = questionTwoRadioButtonD.isChecked();

        if (answerQuestionTwoRadioButtonD) {
            noOfCorrectQuestionsAnswered++;
        }
        // Question 3 correct answer Button True (1 mark)
        RadioButton questionThreeRadioButtonTrue = findViewById(R.id.question_three_radio_button_true);
        boolean answerQuestionThreeRadioButtonTrue = questionThreeRadioButtonTrue.isChecked();

        if (answerQuestionThreeRadioButtonTrue) {
            noOfCorrectQuestionsAnswered++;
        }
        // Question 4 correct answer Button C (1 mark)
        RadioButton questionFourRadioButtonC = findViewById(R.id.question_four_radio_button_c);
        boolean answerQuestionFourRadioButtonC = questionFourRadioButtonC.isChecked();

        if (answerQuestionFourRadioButtonC) {
            noOfCorrectQuestionsAnswered++;
        }
        // Question 5 correct answer Button A (1 mark)
        RadioButton questionFiveRadioButtonA = findViewById(R.id.question_five_radio_button_a);
        boolean answerQuestionFiveRadioButtonA = questionFiveRadioButtonA.isChecked();

        if (answerQuestionFiveRadioButtonA) {
            noOfCorrectQuestionsAnswered++;
        }
        // Question 6 correct answer Checkboxes B, C and D (1 mark)
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
                && answerQuestionSixCheckboxD) {
            noOfCorrectQuestionsAnswered++;
        }
        // Question 7 correct answer Button C (1 mark)
        RadioButton questionSevenRadioButtonC = findViewById(R.id.question_seven_radio_button_c);
        boolean answerQuestionSevenRadioButtonC = questionSevenRadioButtonC.isChecked();

        if (answerQuestionSevenRadioButtonC) {
            noOfCorrectQuestionsAnswered++;
        }
        // Question 8 correct answer Button A (1 mark)
        RadioButton questionEightRadioButtonA = findViewById(R.id.question_eight_radio_button_a);
        boolean answerQuestionEightRadioButtonA = questionEightRadioButtonA.isChecked();

        if (answerQuestionEightRadioButtonA) {
            noOfCorrectQuestionsAnswered++;
        }
        return noOfCorrectQuestionsAnswered;
    }

    // This method is called when the retakeQuiz Button is clicked
    public void retakeQuiz(View view) {

        // Question 1
        RadioButton questionOneRadioButtonA = findViewById(R.id.question_one_radio_button_a);
        questionOneRadioButtonA.setChecked(false);
        RadioButton questionOneRadioButtonB = findViewById(R.id.question_one_radio_button_b);
        questionOneRadioButtonB.setChecked(false);
        RadioButton questionOneRadioButtonC = findViewById(R.id.question_one_radio_button_c);
        questionOneRadioButtonC.setChecked(false);
        RadioButton questionOneRadioButtonD = findViewById(R.id.question_one_radio_button_d);
        questionOneRadioButtonD.setChecked(false);

        // Question 2
        RadioButton questionTwoRadioButtonA = findViewById(R.id.question_two_radio_button_a);
        questionTwoRadioButtonA.setChecked(false);
        RadioButton questionTwoRadioButtonB = findViewById(R.id.question_two_radio_button_b);
        questionTwoRadioButtonB.setChecked(false);
        RadioButton questionTwoRadioButtonC = findViewById(R.id.question_two_radio_button_c);
        questionTwoRadioButtonC.setChecked(false);
        RadioButton questionTwoRadioButtonD = findViewById(R.id.question_two_radio_button_d);
        questionTwoRadioButtonD.setChecked(false);

        // Question 3
        RadioButton questionThreeRadioButtonTrue = findViewById(R.id.question_three_radio_button_true);
        questionThreeRadioButtonTrue.setChecked(false);
        RadioButton questionThreeRadioButtonFalse = findViewById(R.id.question_three_radio_button_false);
        questionThreeRadioButtonFalse.setChecked(false);

        // Question 4
        RadioButton questionFourRadioButtonA = findViewById(R.id.question_four_radio_button_a);
        questionFourRadioButtonA.setChecked(false);
        RadioButton questionFourRadioButtonB = findViewById(R.id.question_four_radio_button_b);
        questionFourRadioButtonB.setChecked(false);
        RadioButton questionFourRadioButtonC = findViewById(R.id.question_four_radio_button_c);
        questionFourRadioButtonC.setChecked(false);
        RadioButton questionFourRadioButtonD = findViewById(R.id.question_four_radio_button_d);
        questionFourRadioButtonD.setChecked(false);

        // Question 5
        RadioButton questionFiveRadioButtonA = findViewById(R.id.question_five_radio_button_a);
        questionFiveRadioButtonA.setChecked(false);
        RadioButton questionFiveRadioButtonB = findViewById(R.id.question_five_radio_button_b);
        questionFiveRadioButtonB.setChecked(false);
        RadioButton questionFiveRadioButtonC = findViewById(R.id.question_five_radio_button_c);
        questionFiveRadioButtonC.setChecked(false);
        RadioButton questionFiveRadioButtonD = findViewById(R.id.question_five_radio_button_d);
        questionFiveRadioButtonD.setChecked(false);

        // Question 6
        CheckBox questionSixCheckboxA = findViewById(R.id.question_six_checkbox_a);
        questionSixCheckboxA.setChecked(false);
        CheckBox questionSixCheckboxB = findViewById(R.id.question_six_checkbox_b);
        questionSixCheckboxB.setChecked(false);
        CheckBox questionSixCheckboxC = findViewById(R.id.question_six_checkbox_c);
        questionSixCheckboxC.setChecked(false);
        CheckBox questionSixCheckboxD = findViewById(R.id.question_six_checkbox_d);
        questionSixCheckboxD.setChecked(false);

        // Question 7
        RadioButton questionSevenRadioButtonA = findViewById(R.id.question_seven_radio_button_a);
        questionSevenRadioButtonA.setChecked(false);
        RadioButton questionSevenRadioButtonB = findViewById(R.id.question_seven_radio_button_b);
        questionSevenRadioButtonB.setChecked(false);
        RadioButton questionSevenRadioButtonC = findViewById(R.id.question_seven_radio_button_c);
        questionSevenRadioButtonC.setChecked(false);
        RadioButton questionSevenRadioButtonD = findViewById(R.id.question_seven_radio_button_d);
        questionSevenRadioButtonD.setChecked(false);

        // Question 8
        RadioButton questionEightRadioButtonA = findViewById(R.id.question_eight_radio_button_a);
        questionEightRadioButtonA.setChecked(false);
        RadioButton questionEightRadioButtonB = findViewById(R.id.question_eight_radio_button_b);
        questionEightRadioButtonB.setChecked(false);
        RadioButton questionEightRadioButtonC = findViewById(R.id.question_eight_radio_button_c);
        questionEightRadioButtonC.setChecked(false);
        RadioButton questionEightRadioButtonD = findViewById(R.id.question_eight_radio_button_d);
        questionEightRadioButtonD.setChecked(false);

        noOfQuestionsAnswered = 0;
        numberOfCheckboxesChecked = 0;
        questionOneAnswered = 0;
        questionTwoAnswered = 0;
        questionThreeAnswered = 0;
        questionFourAnswered = 0;
        questionFiveAnswered = 0;
        questionSixAnswered = 0;
        questionSevenAnswered = 0;
        questionEightAnswered = 0;
        checkProgressBar(view);
    }

    public void checkProgressBar(View view) {
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setIndeterminate(false);
        progressBar.setMax(totalNumberOfQuestions);
        progressBar.setProgress(noOfQuestionsAnswered, true);
    }
}

