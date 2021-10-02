package com.company;

public class Vocal extends SongDecorator{
    public Vocal(Song s){
        super(s);
    }
    @Override
    public void record(){
        super.record();
        System.out.print("Add Vocal. ");
    }
}
