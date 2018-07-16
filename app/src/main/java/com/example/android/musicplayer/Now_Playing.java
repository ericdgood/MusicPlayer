package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.android.musicplayer.Song_List.KEY_ALBUM;
import static com.example.android.musicplayer.Song_List.KEY_ARTIST;
import static com.example.android.musicplayer.Song_List.KEY_SONG;
import static com.example.android.musicplayer.Song_List.resId;

public class Now_Playing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now__playing);

        String playingSong = "";
        String playingArtist = "";
        Integer playingAlbum = 0;


        // Gets intent and ListView item data from MainActivity
        Intent intent = getIntent();
        if (null != intent) {
            playingSong = intent.getStringExtra(KEY_SONG);
            playingArtist = intent.getStringExtra(KEY_ARTIST);
            playingAlbum = intent.getIntExtra(KEY_ALBUM, resId);
        }

        // Sets data to appropriate TextViews
        TextView playingSongText = (TextView) findViewById(R.id.songName);
        playingSongText.setText(playingSong);

        ImageView playingAlbumText = (ImageView) findViewById(R.id.albumCover);
        playingAlbumText.setImageResource(playingAlbum);

        final TextView playingArtistText = (TextView) findViewById(R.id.artistName);
        playingArtistText.setText(playingArtist);
    }
}
