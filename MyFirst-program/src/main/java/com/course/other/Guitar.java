package com.course.other;

import javax.sound.midi.Instrument;

public class Guitar implements Instruments {

    public int stringNum = 6;

    public Guitar(int stringNum) {
    }

    @Override
    public void play() {
        System.out.println("Guitar playing");

    }
}


