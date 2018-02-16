/*
package com.example.android.quizapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

*/
/**
 * Created by Zizoh on 12/02/2018.
 * <p>
 * This is our own custom constructor (it doesn't mirror a superclass constructor).
 * The context is used to inflate the layout file, and the list is the data we want
 * to populate into the lists.
 *
 * @param context The current context. Used to inflate the layout file.
 * @param words   A List of Word objects to display in a list
 * <p>
 * Provides a view for an AdapterView (ListView, GridView, etc.)
 * @param position    The position in the list of data that should be displayed in the
 * list item view.
 * @param convertView The recycled view to populate.
 * @param parent      The parent ViewGroup that is used for inflation.
 * @return The View for the position in the AdapterView.
 * <p>
 * This is our own custom constructor (it doesn't mirror a superclass constructor).
 * The context is used to inflate the layout file, and the list is the data we want
 * to populate into the lists.
 * @param context The current context. Used to inflate the layout file.
 * @param words   A List of Word objects to display in a list
 * <p>
 * Provides a view for an AdapterView (ListView, GridView, etc.)
 * @param position    The position in the list of data that should be displayed in the
 * list item view.
 * @param convertView The recycled view to populate.
 * @param parent      The parent ViewGroup that is used for inflation.
 * @return The View for the position in the AdapterView.
 * <p>
 * This is our own custom constructor (it doesn't mirror a superclass constructor).
 * The context is used to inflate the layout file, and the list is the data we want
 * to populate into the lists.
 * @param context The current context. Used to inflate the layout file.
 * @param words   A List of Word objects to display in a list
 * <p>
 * Provides a view for an AdapterView (ListView, GridView, etc.)
 * @param position    The position in the list of data that should be displayed in the
 * list item view.
 * @param convertView The recycled view to populate.
 * @param parent      The parent ViewGroup that is used for inflation.
 * @return The View for the position in the AdapterView.
 * <p>
 * This is our own custom constructor (it doesn't mirror a superclass constructor).
 * The context is used to inflate the layout file, and the list is the data we want
 * to populate into the lists.
 * @param context The current context. Used to inflate the layout file.
 * @param words   A List of Word objects to display in a list
 * <p>
 * Provides a view for an AdapterView (ListView, GridView, etc.)
 * @param position    The position in the list of data that should be displayed in the
 * list item view.
 * @param convertView The recycled view to populate.
 * @param parent      The parent ViewGroup that is used for inflation.
 * @return The View for the position in the AdapterView.
 *//*


*/
/*
* {@link QuestionAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
* based on a data source, which is a list of {@link Question} objects.
*//*


public class QuestionAdapter extends ArrayAdapter<Question> {
    private static final String LOG_TAG = QuestionAdapter.class.getSimpleName();

    */
/**
 * This is our own custom constructor (it doesn't mirror a superclass constructor).
 * The context is used to inflate the layout file, and the list is the data we want
 * to populate into the lists.
 *
 * @param context The current context. Used to inflate the layout file.
 * @param words   A List of Word objects to display in a list
 *//*

    public QuestionAdapter(Activity context, ArrayList<Question> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, questions);
    }

    */
/**
 * Provides a view for an AdapterView (ListView, GridView, etc.)
 *
 * @param position    The position in the list of data that should be displayed in the
 *                    list item view.
 * @param convertView The recycled view to populate.
 * @param parent      The parent ViewGroup that is used for inflation.
 * @return The View for the position in the AdapterView.
 *//*

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Question} object located at this position in the list
        Question currentQuestion = getItem(position);

        */
/*//*
/ Find the TextView in the list_item.xml layout with the ID username_prompt_text
        TextView userName = (TextView) listItemView.findViewById(R.id.username_prompt_text);
        // Get the username prompt text from the current Question object and
        // set this text on the username prompt text TextView
        userName.setText(currentQuestion.getmUserName());

        // Find the EditTextView in the list_item.xml layout with the ID username
        EditText userNameEditText = (EditText) listItemView.findViewById(R.id.username);
        // Get the default translation from the current Word object and
        // set this text on the username EditText
        userNameEditText.setText(currentQuestion.getmUserNameEdittext());*//*


        // Find the TextView in the list_item.xml layout with the ID question_one_number
        TextView questionNumber = (TextView) listItemView.findViewById(R.id.question_one_number);
        // Get the question number resource ID from the current Question object and
        // set the TextView to questionNumber
        questionNumber.setText(currentQuestion.getmQuestionNumber());

        // Find the TextView in the list_item.xml layout with the ID question_text
        TextView questionText = (TextView) listItemView.findViewById(R.id.question_text);
        // Get the question text resource ID from the current Question object and
        // set the TextView to questionText
        questionText.setText(currentQuestion.getmQuestionText());

        // Find the RadioButton in the list_item.xml layout with the ID question_one_radio_button_a
        RadioButton radioButtonA = (RadioButton) listItemView.findViewById(R.id.question_one_radio_button_a);
        // Get the radio button A resource ID from the current Question object and
        // set the RadioButton to radioButtonA
        radioButtonA.setText(currentQuestion.getmRadioButtonOptionAText());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}*/
