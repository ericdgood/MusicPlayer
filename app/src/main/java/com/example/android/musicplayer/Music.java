package com.example.android.musicplayer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.media.Image;
import android.support.annotation.DrawableRes;

public class Music {
    // NAME OF ARTIST (e.g. Elton John, John Denver, Queen)
    private String nameArtist;

    // NAME OF SONG (e.g. Rocket-Man, Country Road, Don't Stop Me Now)
    private String nameSong;

    // ALBUM COVER IMAGE
    private Integer coverAlbum;


    //     CREATING SONG INFO OBJECTS.
    public Music(String artistName, String songName, Integer albumCover) {
        nameArtist = artistName;
        nameSong = songName;
        coverAlbum = albumCover;
    }


    //    DISPLAY ARTIST NAME
    public String displayArtistName() {
        return nameArtist;
    }

    //    DISPLAY SONG NAME
    public String displaySongName() {
        return nameSong;
    }

    //    DISPLAY ALBUM COVER
    public Integer displayAlbumCover() {
        return coverAlbum;
    }


}

