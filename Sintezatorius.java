package com.company;

public class Sintezatorius extends SongDecorator{

    public Sintezatorius(Song s){
        super(s);
    }

    @Override
    public void record(){
        super.record();
        System.out.print("Add Sintezatorius melody. ");
    }
}
