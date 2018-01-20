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
    int noOfCorrectQuestionsAnswered = 0;

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

    public void submitAnswersButton(View view){

        // Check answer to Question 1
        RadioButton questionOneRadioButtonA = (RadioButton) findViewById(R.id.question_one_radio_button_a);
        boolean answerquestionOneRadioButtonA = questionOneRadioButtonA.isChecked();

        RadioButton questionOneRadioButtonB = (RadioButton) findViewById(R.id.question_one_radio_button_b);
        boolean answerquestionOneRadioButtonB = questionOneRadioButtonB.isChecked();

        RadioButton questionOneRadioButtonC = (RadioButton) findViewById(R.id.question_one_radio_button_c);
        boolean answerquestionOneRadioButtonC = questionOneRadioButtonC.isChecked();

        RadioButton questionOneRadioButtonD = (RadioButton) findViewById(R.id.question_one_radio_button_d);
        boolean answerquestionOneRadioButtonD = questionOneRadioButtonD.isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_one_radio_button_a:
                if (answerquestionOneRadioButtonA)
                    // NaMeBeThis
                    break;
            case R.id.question_one_radio_button_b:
                if (answerquestionOneRadioButtonB)
                    // NAmeBEthis
                    break;
            case R.id.question_one_radio_button_c:
                if (answerquestionOneRadioButtonC)
                    // NAMEBETHIS
                    break;
            case R.id.question_one_radio_button_d:
                if (answerquestionOneRadioButtonD)
                    // naMeBeThis
                    break;
        }

        // Check answer to Question 2
        RadioButton questionTwoRadioButtonA = (RadioButton) findViewById(R.id.question_two_radio_button_a);
        boolean answerquestionTwoRadioButtonA = questionTwoRadioButtonA.isChecked();

        RadioButton questionTwoRadioButtonB = (RadioButton) findViewById(R.id.question_two_radio_button_b);
        boolean answerquestionTwoRadioButtonB = questionTwoRadioButtonB.isChecked();

        RadioButton questionTwoRadioButtonC = (RadioButton) findViewById(R.id.question_two_radio_button_c);
        boolean answerquestionTwoRadioButtonC = questionTwoRadioButtonC.isChecked();

        RadioButton questionTwoRadioButtonD = (RadioButton) findViewById(R.id.question_two_radio_button_d);
        boolean answerquestionTwoRadioButtonD = questionTwoRadioButtonD.isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_two_radio_button_a:
                if (answerquestionTwoRadioButtonA)
                    // LinearLayout
                    break;
            case R.id.question_two_radio_button_b:
                if (answerquestionTwoRadioButtonB)
                    // ImageView
                    break;
            case R.id.question_two_radio_button_c:
                if (answerquestionTwoRadioButtonC)
                    // Button
                    break;
            case R.id.question_two_radio_button_d:
                if (answerquestionTwoRadioButtonD)
                    // RelativeLayout
                    break;
        }
        // Check answer to Question 3
        RadioButton questionThreeRadioButtonTrue = (RadioButton) findViewById(R.id.question_three_radio_button_true);
        boolean answerquestionThreeRadioButtonTrue = questionThreeRadioButtonTrue.isChecked();

        RadioButton questionThreeRadioButtonFalse = (RadioButton) findViewById(R.id.question_three_radio_button_false);
        boolean answerquestionThreeRadioButtonFalse = questionThreeRadioButtonFalse.isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_three_radio_button_true:
                if (answerquestionThreeRadioButtonTrue)
                    // True
                    break;
            case R.id.question_three_radio_button_false:
                if (answerquestionThreeRadioButtonFalse)
                    // False
                    break;
        }

        // Check answer to Question 4
        RadioButton questionFourRadioButtonA = (RadioButton) findViewById(R.id.question_four_radio_button_a);
        boolean answerquestionFourRadioButtonA = questionFourRadioButtonA.isChecked();

        RadioButton questionFourRadioButtonB = (RadioButton) findViewById(R.id.question_four_radio_button_b);
        boolean answerquestionFourRadioButtonB = questionFourRadioButtonB.isChecked();

        RadioButton questionFourRadioButtonC = (RadioButton) findViewById(R.id.question_four_radio_button_c);
        boolean answerquestionFourRadioButtonC = questionFourRadioButtonC.isChecked();

        RadioButton questionFourRadioButtonD = (RadioButton) findViewById(R.id.question_four_radio_button_d);
        boolean answerquestionFourRadioButtonD = questionFourRadioButtonD.isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_four_radio_button_a:
                if (answerquestionFourRadioButtonA)
                    // NaMeBeThis
                    break;
            case R.id.question_four_radio_button_b:
                if (answerquestionFourRadioButtonB)
                    // NAmeBEthis
                    break;
            case R.id.question_four_radio_button_c:
                if (answerquestionFourRadioButtonC)
                    // NAMEBETHIS
                    break;
            case R.id.question_four_radio_button_d:
                if (answerquestionFourRadioButtonD)
                    // naMeBeThis
                    break;
        }

        // Check answer to Question 5
        RadioButton questionFiveRadioButtonA = (RadioButton) findViewById(R.id.question_five_radio_button_a);
        boolean answerquestionFiveRadioButtonA = questionFiveRadioButtonA.isChecked();

        RadioButton questionFiveRadioButtonB = (RadioButton) findViewById(R.id.question_five_radio_button_b);
        boolean answerquestionFiveRadioButtonB = questionFiveRadioButtonB.isChecked();

        RadioButton questionFiveRadioButtonC = (RadioButton) findViewById(R.id.question_five_radio_button_c);
        boolean answerquestionFiveRadioButtonC = questionFiveRadioButtonC.isChecked();

        RadioButton questionFiveRadioButtonD = (RadioButton) findViewById(R.id.question_five_radio_button_d);
        boolean answerquestionFiveRadioButtonD = questionFiveRadioButtonD.isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_five_radio_button_a:
                if (answerquestionFiveRadioButtonA)
                    // NaMeBeThis
                    break;
            case R.id.question_five_radio_button_b:
                if (answerquestionFiveRadioButtonB)
                    // NAmeBEthis
                    break;
            case R.id.question_five_radio_button_c:
                if (answerquestionFiveRadioButtonC)
                    // NAMEBETHIS
                    break;
            case R.id.question_five_radio_button_d:
                if (answerquestionFiveRadioButtonD)
                    // naMeBeThis
                    break;
        }

        // Check answer to Question 7
        RadioButton questionSevenRadioButtonA = (RadioButton) findViewById(R.id.question_seven_radio_button_a);
        boolean answerquestionSevenRadioButtonA = questionSevenRadioButtonA.isChecked();

        RadioButton questionSevenRadioButtonB = (RadioButton) findViewById(R.id.question_seven_radio_button_b);
        boolean answerquestionSevenRadioButtonB = questionSevenRadioButtonB.isChecked();

        RadioButton questionSevenRadioButtonC = (RadioButton) findViewById(R.id.question_seven_radio_button_c);
        boolean answerquestionSevenRadioButtonC = questionSevenRadioButtonC.isChecked();

        RadioButton questionSevenRadioButtonD = (RadioButton) findViewById(R.id.question_seven_radio_button_d);
        boolean answerquestionSevenRadioButtonD = questionSevenRadioButtonD.isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_seven_radio_button_a:
                if (answerquestionSevenRadioButtonA)
                    // NaMeBeThis
                    break;
            case R.id.question_seven_radio_button_b:
                if (answerquestionSevenRadioButtonB)
                    // NAmeBEthis
                    break;
            case R.id.question_seven_radio_button_c:
                if (answerquestionSevenRadioButtonC)
                    // NAMEBETHIS
                    break;
            case R.id.question_seven_radio_button_d:
                if (answerquestionSevenRadioButtonD)
                    // naMeBeThis
                    break;
        }

        // Check answer to Question 8
        RadioButton questionEightRadioButtonA = (RadioButton) findViewById(R.id.question_eight_radio_button_a);
        boolean answerquestionEightRadioButtonA = questionEightRadioButtonA.isChecked();

        RadioButton questionEightRadioButtonB = (RadioButton) findViewById(R.id.question_eight_radio_button_b);
        boolean answerquestionEightRadioButtonB = questionEightRadioButtonB.isChecked();

        RadioButton questionEightRadioButtonC = (RadioButton) findViewById(R.id.question_eight_radio_button_c);
        boolean answerquestionEightRadioButtonC = questionEightRadioButtonC.isChecked();

        RadioButton questionEightRadioButtonD = (RadioButton) findViewById(R.id.question_eight_radio_button_d);
        boolean answerquestionEightRadioButtonD = questionEightRadioButtonD.isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_eight_radio_button_a:
                if (answerquestionEightRadioButtonA)
                    // NaMeBeThis
                    break;
            case R.id.question_eight_radio_button_b:
                if (answerquestionEightRadioButtonB)
                    // NAmeBEthis
                    break;
            case R.id.question_eight_radio_button_c:
                if (answerquestionEightRadioButtonC)
                    // NAMEBETHIS
                    break;
            case R.id.question_eight_radio_button_d:
                if (answerquestionEightRadioButtonD)
                    // naMeBeThis
                    break;
        }

        int finalMarks = markQuestions(answerquestionOneRadioButtonD,
                answerquestionTwoRadioButtonD,
                answerquestionThreeRadioButtonTrue,
                answerquestionFourRadioButtonC,
                answerquestionFiveRadioButtonA,
                answerquestionSevenRadioButtonC,
                answerquestionEightRadioButtonA);
        Toast.makeText(this, "You answered " + finalMarks +" questions correctly!", Toast.LENGTH_LONG).show();
    }

    private int markQuestions(boolean answerquestionOneRadioButtonD,
                              boolean answerquestionTwoRadioButtonD,
                              boolean answerquestionThreeRadioButtonTrue,
                              boolean answerquestionFourRadioButtonC,
                              boolean answerquestionFiveRadioButtonA,
                              boolean answerquestionSevenRadioButtonC,
                              boolean answerquestionEightRadioButtonA){

        // Correct Answers to all questions
        if (answerquestionOneRadioButtonD){
            noOfCorrectQuestionsAnswered += 1;
        }
        if (answerquestionTwoRadioButtonD){
            noOfCorrectQuestionsAnswered += 1;
        }
        if (answerquestionThreeRadioButtonTrue){
            noOfCorrectQuestionsAnswered += 1;
        }
        if (answerquestionFourRadioButtonC){
            noOfCorrectQuestionsAnswered += 1;
        }
        if (answerquestionFiveRadioButtonA){
            noOfCorrectQuestionsAnswered += 1;
        }
        if (answerquestionSevenRadioButtonC){
            noOfCorrectQuestionsAnswered += 1;
        }
        if (answerquestionEightRadioButtonA){
            noOfCorrectQuestionsAnswered += 1;
        }
        return noOfCorrectQuestionsAnswered;
    }


    // This method handles the click event for Question 1 RadioButtons
    public void onQuestionOneRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checkedQuestionOne = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        /** switch (view.getId()) {
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
        } */
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

    // This method handles the click event for Question 6 Checkboxes
    public void onQuestionSixCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checkedQuestionSix = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked

        //switch (view.getId()) {
            //case R.id.question_six_checkbox_a:
                //if (checkedQuestionSix)
                //// Put some meat on the sandwich
                //else
                //// Remove the meat
                //break;
            //case R.id.question_six_checkbox_b:
                //if (checkedQuestionSix)
                //// Cheese me
                //else
                //// I'm lactose intolerant
                //break;
            //// TODO: Veggie sandwich
        //}
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
            case R.id.question_seven_radio_button_c:
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
            case R.id.question_eight_radio_button_a:
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
}
