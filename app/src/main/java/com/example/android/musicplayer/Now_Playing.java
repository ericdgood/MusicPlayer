package com.example.android.musicplayer;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.musicplayer.Sort_Artist.KEY_ALBUM;
import static com.example.android.musicplayer.Sort_Artist.KEY_ARTIST;
import static com.example.android.musicplayer.Sort_Artist.KEY_SONG;
import static com.example.android.musicplayer.Sort_Artist.resId;

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
