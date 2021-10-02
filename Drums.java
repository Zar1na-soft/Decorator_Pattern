package com.company;

public class Drums extends SongDecorator{

    public Drums(Song s){
        super(s);
    }
    @Override
    public void record(){
        super.record();
        System.out.print("Add drums melody. ");
    }
}
