package com.course.other;

public class InstrumentMain {
    public static void main(String[] args) {

        Instruments[] instruments = new Instruments[3];
        instruments[0] = new Guitar(6);
        instruments[1] = new Drum(8);
        instruments[2] = new Trumpet(20);

        for (Instruments music:instruments){
            music.play();


        }

    }
}

