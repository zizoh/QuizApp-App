package com.example.android.quizapp;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import static android.text.TextUtils.isEmpty;

@SuppressWarnings("RedundantCast")
public class MainActivity extends AppCompatActivity {

    // Keys to identify the data saved
    static final String STATE_NUMBEROFQUESTIONSANSWERED = "noOfQuestionsAnswered";
    static final String STATE_QUESTIONONEANSWERED = "questionOneAnswered";
    static final String STATE_QUESTIONTWOANSWERED = "questionTwoAnswered";
    static final String STATE_QUESTIONTHREEANSWERED = "questionThreeAnswered";
    static final String STATE_QUESTIONFOURANSWERED = "questionFourAnswered";
    static final String STATE_QUESTIONFIVEANSWERED = "questionFiveAnswered";
    static final String STATE_QUESTIONSIXANSWERED = "questionSixAnswered";
    static final String STATE_NUMBEROFCHECKBOXESCHECKED = "numberOfCheckboxesChecked";
    static final String STATE_QUESTIONSEVENANSWERED = "questionSevenAnswered";
    static final String STATE_QUESTIONEIGHTANSWERED = "questionEightAnswered";
    static final String STATE_NUMBEROFCORRECTQUESTIONSANSWERED = "noOfCorrectQuestionsAnswered";

    int totalNumberOfQuestions = 8;
    int totalMarks = 10;
    int noOfQuestionsAnswered = 0;
    int questionOneAnswered = 0;
    int questionTwoAnswered = 0;
    int questionThreeAnswered = 0;
    int questionFourAnswered = 0;
    int questionFiveAnswered = 0;
    int questionSixAnswered = 0;
    int numberOfCheckboxesChecked = 0;
    int questionSevenAnswered = 0;
    int questionEightAnswered = 0;
    int noOfCorrectQuestionsAnswered = 0;
    EditText questionTwoAnswerEdittext;
    ProgressBar progressBar;
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Recovering the instance state
        // Check whether a previously destroyed instance is being recreated
        if (savedInstanceState != null) {
            // Restore value of members from saved state
            noOfQuestionsAnswered = savedInstanceState.getInt(STATE_NUMBEROFQUESTIONSANSWERED);
            questionOneAnswered = savedInstanceState.getInt(STATE_QUESTIONONEANSWERED);
            questionTwoAnswered = savedInstanceState.getInt(STATE_QUESTIONTWOANSWERED);
            questionThreeAnswered = savedInstanceState.getInt(STATE_QUESTIONTHREEANSWERED);
            questionFourAnswered = savedInstanceState.getInt(STATE_QUESTIONFOURANSWERED);
            questionFiveAnswered = savedInstanceState.getInt(STATE_QUESTIONFIVEANSWERED);
            questionSixAnswered = savedInstanceState.getInt(STATE_QUESTIONSIXANSWERED);
            numberOfCheckboxesChecked = savedInstanceState.getInt(STATE_NUMBEROFCHECKBOXESCHECKED);
            questionSevenAnswered = savedInstanceState.getInt(STATE_QUESTIONSEVENANSWERED);
            questionEightAnswered = savedInstanceState.getInt(STATE_NUMBEROFQUESTIONSANSWERED);
            noOfCorrectQuestionsAnswered = savedInstanceState.getInt(STATE_NUMBEROFCORRECTQUESTIONSANSWERED);
        }

        // Initialize ProgressBar
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        checkProgressBar();

        //This method handles when the user answers Question 2
        questionTwoAnswerEdittext = (EditText) findViewById(R.id.question_two_answer_edittext);
        questionTwoAnswerEdittext.addTextChangedListener(new TextWatcher() {
            @SuppressWarnings("StatementWithEmptyBody")
            public void afterTextChanged(Editable s) {
                CharSequence questionTwoAnswer = questionTwoAnswerEdittext.getText().toString();
                if (isEmpty(questionTwoAnswer) && questionTwoAnswered == 0) {
                } else if (questionTwoAnswer.length() == 1 && questionTwoAnswered == 0) {
                    questionTwoAnswered = 1;
                    noOfQuestionsAnswered++;
                    checkProgressBar();
                } else if (isEmpty(questionTwoAnswer) && questionTwoAnswered == 1) {
                    questionTwoAnswered = 0;
                    noOfQuestionsAnswered--;
                    checkProgressBar();
                }
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });
    }

    // This method is called when the Submit Answers button is clicked.
    public void submitAnswers(View view) {
        int finalMarks = markQuestions();
        EditText userNameEdittext = (EditText) findViewById(R.id.username);

        // If no username is provided
        if (userNameEdittext.getText().toString().isEmpty()) {
            // Sets focus on userNameEdittext and show the keyboard
            userNameEdittext.requestFocus();

            // Brings window focus to top of scrollView, so that user can enter name
            scrollView = (ScrollView) findViewById(R.id.scrollView);
            scrollView.smoothScrollTo(0, view.getTop());

            // Show softInputKeyboard and show Toast
            InputMethodManager imm = (InputMethodManager)
                    MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
            if (imm != null) {
                imm.showSoftInput(userNameEdittext, InputMethodManager.SHOW_IMPLICIT);
                Toast.makeText(this, R.string.emptyUsernameToast, Toast.LENGTH_SHORT).show();
            }

        } else {
            // Keep window focus at submit button, hide softInputKeyboard and show Toast
            Button submitButton = (Button) findViewById(R.id.submit_answers_button);
            submitButton.requestFocusFromTouch();
            InputMethodManager imm = (InputMethodManager)
                    MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
            if (imm != null) {
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                Toast.makeText(this, userNameEdittext.getText()
                        + ", you scored " + finalMarks + "/" + totalMarks + "!", Toast.LENGTH_LONG).show();
            }
        }
    }

    // This method handles the click event for Question 1 radio buttons to update progress bar
    public void onQuestionOneRadioButtonClicked(View view) {
        if (questionOneAnswered == 0) {
            noOfQuestionsAnswered++;
            checkProgressBar();
            questionOneAnswered = 1;
        }
    }

    // This method handles the click event for Question 3 radio buttons to update progress bar
    public void onQuestionThreeRadioButtonClicked(View view) {
        if (questionThreeAnswered == 0) {
            noOfQuestionsAnswered++;
            checkProgressBar();
            questionThreeAnswered = 1;
        }
    }

    // This method handles the click event for Question 4 radio buttons to update progress bar
    public void onQuestionFourRadioButtonClicked(View view) {
        if (questionFourAnswered == 0) {
            noOfQuestionsAnswered++;
            checkProgressBar();
            questionFourAnswered = 1;
        }
    }

    // This method handles the click event for Question 5 radio buttons to update progress bar
    public void onQuestionFiveRadioButtonClicked(View view) {
        if (questionFiveAnswered == 0) {
            noOfQuestionsAnswered++;
            checkProgressBar();
            questionFiveAnswered = 1;
        }
    }

    // This method handles click events for Question 6 checkboxes to update progress bar
    // It allows the user to check only 3 checkboxes at a time
    public void onQuestionSixCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checkedQuestionSix = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.question_six_checkbox_a: // Copy the views
                // If the 4th checkbox is checked when 3 checkboxes are already checked
                if (checkedQuestionSix && numberOfCheckboxesChecked == 3) {
                    ((CheckBox) view).setChecked(false);
                    Toast.makeText(this, R.string.tooManyOptionsSelectedFloat, Toast.LENGTH_SHORT).show();
                }
                // If the first time a checkbox is checked
                else if (checkedQuestionSix && numberOfCheckboxesChecked == 0) {
                    numberOfCheckboxesChecked++;
                    noOfQuestionsAnswered++;
                    checkProgressBar();
                    questionSixAnswered++;
                }
                // If at least 1 checkbox is checked
                else if (checkedQuestionSix && numberOfCheckboxesChecked >= 1) {
                    numberOfCheckboxesChecked++;
                } else {
                    // If only 1 checkbox was checked and now unchecked
                    // the question becomes unanswered
                    if (numberOfCheckboxesChecked == 1) {
                        numberOfCheckboxesChecked--;
                        noOfQuestionsAnswered--;
                        checkProgressBar();
                        questionSixAnswered--;
                    }
                    // If more than 1 checkboxes were checked and 1 is now unchecked
                    else if (numberOfCheckboxesChecked > 1) {
                        numberOfCheckboxesChecked--;
                    }
                }
                break;
            case R.id.question_six_checkbox_b: // Position the views
                // If the 4th checkbox is checked when 3 checkboxes are already checked
                if (checkedQuestionSix && numberOfCheckboxesChecked == 3) {
                    ((CheckBox) view).setChecked(false);
                    Toast.makeText(this, R.string.tooManyOptionsSelectedFloat, Toast.LENGTH_SHORT).show();
                }
                // If the first time a checkbox is checked
                else if (checkedQuestionSix && numberOfCheckboxesChecked == 0) {
                    numberOfCheckboxesChecked++;
                    noOfQuestionsAnswered++;
                    checkProgressBar();
                    questionSixAnswered++;
                }
                // If at least 1 checkbox is checked
                else if (checkedQuestionSix && numberOfCheckboxesChecked >= 1) {
                    numberOfCheckboxesChecked++;
                } else {
                    // If only 1 checkbox was checked and now unchecked
                    // the question becomes unanswered
                    if (numberOfCheckboxesChecked == 1) {
                        numberOfCheckboxesChecked--;
                        noOfQuestionsAnswered--;
                        checkProgressBar();
                        questionSixAnswered--;
                    }
                    // If more than 1 checkboxes were checked and one is now unchecked
                    else if (numberOfCheckboxesChecked > 1) {
                        numberOfCheckboxesChecked--;
                    }
                }
                break;
            case R.id.question_six_checkbox_c: // Style the views
                // If the 4th checkbox is checked when 3 checkboxes are already checked
                if (checkedQuestionSix && numberOfCheckboxesChecked == 3) {
                    ((CheckBox) view).setChecked(false);
                    Toast.makeText(this, R.string.tooManyOptionsSelectedFloat, Toast.LENGTH_SHORT).show();
                }
                // If the first time a checkbox is checked
                else if (checkedQuestionSix && numberOfCheckboxesChecked == 0) {
                    numberOfCheckboxesChecked++;
                    noOfQuestionsAnswered++;
                    checkProgressBar();
                    questionSixAnswered++;
                }
                // If at least 1 checkbox is checked
                else if (checkedQuestionSix && numberOfCheckboxesChecked >= 1) {
                    numberOfCheckboxesChecked++;
                } else {
                    // If only 1 checkbox was checked and now unchecked
                    // the question becomes unanswered
                    if (numberOfCheckboxesChecked == 1) {
                        numberOfCheckboxesChecked--;
                        noOfQuestionsAnswered--;
                        checkProgressBar();
                        questionSixAnswered--;
                    }
                    // If more than 1 checkboxes were checked and one is now unchecked
                    else if (numberOfCheckboxesChecked > 1) {
                        numberOfCheckboxesChecked--;
                    }
                }
                break;
            case R.id.question_six_checkbox_d: // Select the views
                // If the 4th checkbox is checked when 3 checkboxes are already checked
                if (checkedQuestionSix && numberOfCheckboxesChecked == 3) {
                    ((CheckBox) view).setChecked(false);
                    Toast.makeText(this, R.string.tooManyOptionsSelectedFloat, Toast.LENGTH_SHORT).show();
                }
                // If the first time a checkbox is checked
                else if (checkedQuestionSix && numberOfCheckboxesChecked == 0) {
                    numberOfCheckboxesChecked++;
                    noOfQuestionsAnswered++;
                    checkProgressBar();
                    questionSixAnswered++;
                }
                // If at least 1 checkbox is checked
                else if (checkedQuestionSix && numberOfCheckboxesChecked >= 1) {
                    numberOfCheckboxesChecked++;
                } else {
                    // If only 1 checkbox was checked and now unchecked
                    // the question becomes unanswered
                    if (numberOfCheckboxesChecked == 1) {
                        numberOfCheckboxesChecked--;
                        noOfQuestionsAnswered--;
                        checkProgressBar();
                        questionSixAnswered--;
                    }
                    // If more than 1 checkboxes were checked and one is now unchecked
                    else if (numberOfCheckboxesChecked > 1) {
                        numberOfCheckboxesChecked--;
                    }
                }
                break;
        }
    }

    // This method handles the click event for Question 7 radio buttons to update progress bar
    public void onQuestionSevenRadioButtonClicked(View view) {
        if (questionSevenAnswered == 0) {
            noOfQuestionsAnswered++;
            checkProgressBar();
            questionSevenAnswered = 1;
        }
    }

    // This method handles the click event for Question 8 radio buttons to update progress bar
    public void onQuestionEightRadioButtonClicked(View view) {
        if (questionEightAnswered == 0) {
            noOfQuestionsAnswered++;
            checkProgressBar();
            questionEightAnswered = 1;
        }
    }

    // This method contains the marking scheme and assigns 1 point to every correct answer
    private int markQuestions() {
        // Question 1 correct answer D (1 mark)
        RadioButton questionOneRadioButtonD = (RadioButton) findViewById(R.id.question_one_radio_button_d);
        boolean answerQuestionOneRadioButtonD = questionOneRadioButtonD.isChecked();

        if (answerQuestionOneRadioButtonD) {
            noOfCorrectQuestionsAnswered++;
        }
        // Question 2 correct answer RelativeLayout (1 mark)
        questionTwoAnswerEdittext = (EditText) findViewById(R.id.question_two_answer_edittext);
        // Get the string the user entered
        String questionTwoAnswer = questionTwoAnswerEdittext.getText().toString().toUpperCase().replaceAll("\\s", "");

        if (questionTwoAnswer.equals("RELATIVELAYOUT")
                || questionTwoAnswer.equals("RELATIVELAYOUT.")) {
            noOfCorrectQuestionsAnswered++;
        }

        // Question 3 correct answer True (1 mark)
        RadioButton questionThreeRadioButtonTrue = (RadioButton) findViewById(R.id.question_three_radio_button_true);
        boolean answerQuestionThreeRadioButtonTrue = questionThreeRadioButtonTrue.isChecked();

        if (answerQuestionThreeRadioButtonTrue) {
            noOfCorrectQuestionsAnswered++;
        }

        // Question 4 correct answer C (1 mark)
        RadioButton questionFourRadioButtonC = (RadioButton) findViewById(R.id.question_four_radio_button_c);
        boolean answerQuestionFourRadioButtonC = questionFourRadioButtonC.isChecked();

        if (answerQuestionFourRadioButtonC) {
            noOfCorrectQuestionsAnswered++;
        }

        // Question 5 correct answer A (1 mark)
        RadioButton questionFiveRadioButtonA = (RadioButton) findViewById(R.id.question_five_radio_button_a);
        boolean answerQuestionFiveRadioButtonA = questionFiveRadioButtonA.isChecked();

        if (answerQuestionFiveRadioButtonA) {
            noOfCorrectQuestionsAnswered++;
        }

        // Question 6 correct answer Checkboxes B, C and D (3 marks)
        CheckBox questionSixCheckboxB = (CheckBox) findViewById(R.id.question_six_checkbox_b);
        boolean answerQuestionSixCheckboxB = questionSixCheckboxB.isChecked();

        CheckBox questionSixCheckboxC = (CheckBox) findViewById(R.id.question_six_checkbox_c);
        boolean answerQuestionSixCheckboxC = questionSixCheckboxC.isChecked();

        CheckBox questionSixCheckboxD = (CheckBox) findViewById(R.id.question_six_checkbox_d);
        boolean answerQuestionSixCheckboxD = questionSixCheckboxD.isChecked();

        if (answerQuestionSixCheckboxB) { // Determines if the user checks B
            noOfCorrectQuestionsAnswered++;
        }
        if (answerQuestionSixCheckboxC) { // Determines if the user checks C
            noOfCorrectQuestionsAnswered++;
        }
        if (answerQuestionSixCheckboxD) { // Determines if the user checks D
            noOfCorrectQuestionsAnswered++;
        }

        // Question 7 correct answer C (1 mark)
        RadioButton questionSevenRadioButtonC = (RadioButton) findViewById(R.id.question_seven_radio_button_c);
        boolean answerQuestionSevenRadioButtonC = questionSevenRadioButtonC.isChecked();

        if (answerQuestionSevenRadioButtonC) {
            noOfCorrectQuestionsAnswered++;
        }

        // Question 8 correct answer A (1 mark)
        RadioButton questionEightRadioButtonA = (RadioButton) findViewById(R.id.question_eight_radio_button_a);
        boolean answerQuestionEightRadioButtonA = questionEightRadioButtonA.isChecked();

        if (answerQuestionEightRadioButtonA) {
            noOfCorrectQuestionsAnswered++;
        }
        return noOfCorrectQuestionsAnswered;
    }

    // This method is called when the Reset button is clicked
    public void resetQuiz(View view) {
        // Brings window focus to top of scrollView so user can retake quiz
        scrollView = (ScrollView) findViewById(R.id.scrollView);
        scrollView.smoothScrollTo(0, view.getTop());

        // Question 1
        RadioGroup questionOneRadioGroup = (RadioGroup) findViewById(R.id.question_one_radio_group);
        if (questionOneRadioGroup != null) {
            questionOneRadioGroup.clearCheck();
        }

        // Question 2
        questionTwoAnswerEdittext.setText("");

        // Question 3
        RadioGroup questionThreeRadioGroup = (RadioGroup) findViewById(R.id.question_three_radio_group);
        if (questionThreeRadioGroup != null) {
            questionThreeRadioGroup.clearCheck();
        }

        // Question 4
        RadioGroup questionFourRadioGroup = (RadioGroup) findViewById(R.id.question_four_radio_group);
        if (questionFourRadioGroup != null) {
            questionFourRadioGroup.clearCheck();
        }

        // Question 5
        RadioGroup questionFiveRadioGroup = (RadioGroup) findViewById(R.id.question_five_radio_group);
        if (questionFiveRadioGroup != null) {
            questionFiveRadioGroup.clearCheck();
        }

        // Question 6
        CheckBox questionSixCheckboxA = (CheckBox) findViewById(R.id.question_six_checkbox_a);
        if (questionSixCheckboxA != null) {
            questionSixCheckboxA.setChecked(false);
        }
        CheckBox questionSixCheckboxB = (CheckBox) findViewById(R.id.question_six_checkbox_b);
        if (questionSixCheckboxB != null) {
            questionSixCheckboxB.setChecked(false);
        }
        CheckBox questionSixCheckboxC = (CheckBox) findViewById(R.id.question_six_checkbox_c);
        if (questionSixCheckboxC != null) {
            questionSixCheckboxC.setChecked(false);
        }
        CheckBox questionSixCheckboxD = (CheckBox) findViewById(R.id.question_six_checkbox_d);
        if (questionSixCheckboxD != null) {
            questionSixCheckboxD.setChecked(false);
        }

        // Question 7
        RadioGroup questionSevenRadioGroup = (RadioGroup) findViewById(R.id.question_seven_radio_group);
        if (questionSevenRadioGroup != null) {
            questionSevenRadioGroup.clearCheck();
        }

        // Question 8
        RadioGroup questionEightRadioGroup = (RadioGroup) findViewById(R.id.question_eight_radio_group);
        if (questionEightRadioGroup != null) {
            questionEightRadioGroup.clearCheck();
        }

        noOfQuestionsAnswered = 0;
        questionOneAnswered = 0;
        questionTwoAnswered = 0;
        questionThreeAnswered = 0;
        questionFourAnswered = 0;
        questionFiveAnswered = 0;
        questionSixAnswered = 0;
        numberOfCheckboxesChecked = 0;
        questionSevenAnswered = 0;
        questionEightAnswered = 0;
        noOfCorrectQuestionsAnswered = 0;
        checkProgressBar();
    }

    // This method implements the progress bar
    public void checkProgressBar() {
        progressBar.setIndeterminate(false);
        progressBar.setMax(totalNumberOfQuestions);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            progressBar.setProgress(noOfQuestionsAnswered, true);
        }
    }

    // Method invoked before the activity is temporarily destroyed, save the instance state here
    // Values saved to the bundle using key value pairs
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the current integer values
        savedInstanceState.putInt(STATE_NUMBEROFQUESTIONSANSWERED, noOfQuestionsAnswered);
        savedInstanceState.putInt(STATE_QUESTIONONEANSWERED, questionOneAnswered);
        savedInstanceState.putInt(STATE_QUESTIONTWOANSWERED, questionTwoAnswered);
        savedInstanceState.putInt(STATE_QUESTIONTHREEANSWERED, questionThreeAnswered);
        savedInstanceState.putInt(STATE_QUESTIONFOURANSWERED, questionFourAnswered);
        savedInstanceState.putInt(STATE_QUESTIONFIVEANSWERED, questionFiveAnswered);
        savedInstanceState.putInt(STATE_QUESTIONSIXANSWERED, questionSixAnswered);
        savedInstanceState.putInt(STATE_NUMBEROFCHECKBOXESCHECKED, numberOfCheckboxesChecked);
        savedInstanceState.putInt(STATE_QUESTIONSEVENANSWERED, questionSevenAnswered);
        savedInstanceState.putInt(STATE_QUESTIONEIGHTANSWERED, questionEightAnswered);
        savedInstanceState.putInt(STATE_NUMBEROFCORRECTQUESTIONSANSWERED, noOfCorrectQuestionsAnswered);

        // Call to superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }
}