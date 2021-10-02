package com.company;

public abstract class SongDecorator implements Song {

    protected Song song;

    public SongDecorator(Song s){
        this.song=s;
    }
    @Override
    public void record() {
        this.song.record();
    }
}
