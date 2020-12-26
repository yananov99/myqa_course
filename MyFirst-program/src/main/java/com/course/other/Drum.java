package com.course.other;

import javax.sound.midi.Instrument;

public class Drum implements Instruments {

    public Drum(int size) {

        this.size = size;
    }

    public int size = 8;


    @Override
    public void play() {
        System.out.println("Now Play DrumSet");

    }
}



