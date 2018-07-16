package com.example.android.musicplayer;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.media.Image;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class Song_List extends AppCompatActivity {

    // Creates keys for ListView item data
    public static final String KEY_SONG = "KEY_SONG";
    public static final String KEY_ARTIST = "KEY_ARTIST";
    public static final String KEY_ALBUM = "";
    public static Integer resId = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list_view);


//        CREATING ARRAYLIST FOR songs
        ArrayList<Music> music = new ArrayList<Music>();

        music.add(new Music("Micheal Jackson", "Thriller", R.drawable.thriller));
        music.add(new Music("Elton John", "Rocket Man", R.drawable.elton));
        music.add(new Music("Queen", "Don't stop me now", R.drawable.queen));
        music.add(new Music("John Denver", "Country road", R.drawable.john));
        music.add(new Music("Journey", "Don't stop believing", R.drawable.journey));
        music.add(new Music("Run D.M.C", "It's tricky", R.drawable.run));
        music.add(new Music("Fleetwood Mac", "Landslide", R.drawable.fleet));
        music.add(new Music("John Lennon", "Imagine", R.drawable.imagine));
        music.add(new Music("Chuck Berry", "Johnny B Goode", R.drawable.chuck));

        final MusicAdapter adapter = new MusicAdapter(this, music);

        ListView listView = findViewById(R.id.artistlist);

        listView.setAdapter(adapter);

        // When listView item is clicked, item data is sent to new activity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Music item = adapter.getItem(position);
                Intent nowPlaying = new Intent(getApplicationContext(), Now_Playing.class);
                nowPlaying.putExtra(KEY_SONG, item.displaySongName());
                resId = item.displayAlbumCover();
                nowPlaying.putExtra(KEY_ALBUM, resId);
                nowPlaying.putExtra(KEY_ARTIST, item.displayArtistName());
                startActivity(nowPlaying);
            }
        });

    }
}
