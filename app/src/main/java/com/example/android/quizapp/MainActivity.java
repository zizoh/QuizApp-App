package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    // This method handles the click event for Question 1 RadioButtons
    public void onQuestionOneRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_one_radio_button_a:
                if (checked)
                    // NaMeBeThis
                    break;
            case R.id.question_one_radio_button_b:
                if (checked)
                    // NAmeBEthis
                    break;
            case R.id.question_one_radio_button_c:
                if (checked)
                    // NAMEBETHIS
                    break;
            case R.id.question_one_radio_button_d:
                if (checked)
                    // naMeBeThis
                    break;
        }
    }

    // This method handles the click event for Question 2 RadioButtons
    public void onQuestionTwoRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_two_radio_button_a:
                if (checked)
                    // LinearLayout
                    break;
            case R.id.question_two_radio_button_b:
                if (checked)
                    // ImageView
                    break;
            case R.id.question_two_radio_button_c:
                if (checked)
                    // Button
                    break;
            case R.id.question_two_radio_button_d:
                if (checked)
                    // RelativeLayout
                    break;
        }
    }

    // This method handles the click event for Question 3 RadioButtons
    public void onQuestionThreeRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_three_radio_button_true:
                if (checked)
                    // True
                    break;
            case R.id.question_three_radio_button_false:
                if (checked)
                    // False
                    break;
        }
    }

    // This method handles the click event for Question 4 RadioButtons
    public void onQuestionFourRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_four_radio_button_a:
                if (checked)
                    // Question mark (?)
                    break;
            case R.id.question_four_radio_button_b:
                if (checked)
                    // Comma (,)
                    break;
            case R.id.question_four_radio_button_c:
                if (checked)
                    // Semi colon (;)
                    break;
            case R.id.question_four_radio_button_d:
                if (checked)
                    // Exclamation mark (!)
                    break;
        }
    }

    // This method handles the click event for Question 5 RadioButtons
    public void onQuestionFiveRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_five_radio_button_a:
                if (checked)
                    // sp
                    break;
            case R.id.question_five_radio_button_b:
                if (checked)
                    // tz
                    break;
            case R.id.question_five_radio_button_c:
                if (checked)
                    // jz
                    break;
            case R.id.question_five_radio_button_d:
                if (checked)
                    // sz
                    break;
        }
    }

    // This method handles the click event for Question 7 RadioButtons
    public void onQuestionSevenRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_seven_radio_button_a:
                if (checked)
                    // Layout
                    break;
            case R.id.question_seven_radio_button_b:
                if (checked)
                    // Styles
                    break;
            case R.id.question_seven_radio_button_c:
                if (checked)
                    // Drawable
                    break;
            case R.id.question_seven_radio_button_d:
                if (checked)
                    // Manifest
                    break;
        }
    }

    // This method handles the click event for Question 8 RadioButtons
    public void onQuestionEightRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.question_eight_radio_button_a:
                if (checked)
                    // Debug
                    break;
            case R.id.question_eight_radio_button_b:
                if (checked)
                    // Run
                    break;
            case R.id.question_eight_radio_button_c:
                if (checked)
                    // Refactor
                    break;
            case R.id.question_eight_radio_button_d:
                if (checked)
                    // Gradle
                    break;
        }
    }
}
