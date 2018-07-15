package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Sort_Song extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list_view);


//        CREATING ARRAYLIST FOR songs
        ArrayList<Music> music = new ArrayList<Music>();
//
//        music.add(new Music("Queen", "Don't stop me now", R.drawable.queen));
//        music.add(new Music("John Denver", "Country road", R.drawable.john));
//        music.add(new Music("Micheal Jackson", "Thriller", R.drawable.thriller));
//        music.add(new Music("Elton John", "Rocket Man", R.drawable.elton));


        MusicAdapter adapter = new MusicAdapter(this, music);

        ListView listView = findViewById(R.id.artistlist);

        listView.setAdapter(adapter);
    }
}
