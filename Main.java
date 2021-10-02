package com.company;

public class Main {
    public static void main(String[] args) {
        Song drumsmelody = new Drums(new RockSong());
        drumsmelody.record();
        System.out.println("\n*****");

        Song vocalmelody = new Vocal(new Drums(new RockSong()));
        vocalmelody.record();
        System.out.println("\n*****");

        Song guitarmelody = new Guitar(new Vocal(new Drums(new RockSong())));
        guitarmelody.record();
        System.out.println("\n*****");
    }

}
