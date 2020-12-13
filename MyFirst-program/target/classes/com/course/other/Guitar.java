package com.course.other;

import javax.sound.midi.Instrument;

public class Guitar extends Instrument implements Instruments {

    public int stringNum = 6;

    public Guitar(int stringNum) {
        super("Guitar");
        this.stringNum = this.stringNum;
    }
    @Override
    public void play() {
        System.out.println("Guitar playing");

    }
}


