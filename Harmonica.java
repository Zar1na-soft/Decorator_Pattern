package com.company;

public class Harmonica extends SongDecorator{
    public Harmonica(Song s){
        super(s);
    }

    @Override
    public void record(){
        super.record();
        System.out.print("Add harmonica melody. ");
    }
}
