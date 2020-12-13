package com.course.other;

import javax.sound.midi.Instrument;

public class Drum extends Instrument implements Instruments {

    public DrumSet(int size) {
        this.size = size;
    }

    public int size = 10;

    @Override
    public void play() {
        System.out.println("Drum playing");

    }
}

