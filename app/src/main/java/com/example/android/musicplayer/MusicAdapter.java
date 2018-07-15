package com.example.android.musicplayer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music>{

    MusicAdapter(Activity context, ArrayList<Music> music) {
        super(context, 0, music);
    }
//    MusicAdapter(Activity context, ArrayList<Music> music) {
//        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
//        // the second argument is used when the ArrayAdapter is populating a single TextView.
//        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
//        // going to use this second argument, so it can be any value. Here, we used 0.
//        super(context, 0, music);
//    }

    // Class to hold ArrayList Views.
    // Reference: https://dzone.com/articles/optimizing-your-listview
    private static class ViewHolder {
        private TextView songTextView;
        private ImageView albumTextView;
        private TextView artistTextView;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the {@link Song} object located at current position
        Music currentSong = getItem(position);

        ViewHolder holder;

        // Checks if the view is being reused, otherwise inflate
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_view, parent, false);
            holder = new ViewHolder();
            // Finds Song, Album, and Artist TextViews
            holder.songTextView = (TextView) convertView.findViewById(R.id.songName);
            holder.albumTextView = (ImageView) convertView.findViewById(R.id.albumCover);
            holder.artistTextView = (TextView) convertView.findViewById(R.id.artistName);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        // Sets the text to current Song object
        holder.songTextView.setText(currentSong.displaySongName());

        // Sets the text to current Album object
        holder.albumTextView.setImageResource(currentSong.displayAlbumCover());

    // Sets the text to current Artist object
        holder.artistTextView.setText(currentSong.displayArtistName());
    // End reference

    // Return the whole list_item layout
        return convertView;
}
}

