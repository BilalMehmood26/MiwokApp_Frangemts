package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param words A List of AndroidFlavor objects to display in a list
     */
    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_items, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word langTranslation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView mewokTextView = (TextView) listItemView.findViewById(R.id.mewok_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        mewokTextView.setText(langTranslation.getMiwokTranslation());

        ImageView iconImage = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        iconImage.setImageResource(langTranslation.getImagesResourceId());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        englishTextView.setText(langTranslation.getDefaultTranslation());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
