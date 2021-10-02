package com.company;

public class Guitar extends SongDecorator{

    public Guitar(Song s){
        super(s);
    }
    @Override
    public void record(){
        super.record();
        System.out.print("Add guitar melody. ");
    }
}
