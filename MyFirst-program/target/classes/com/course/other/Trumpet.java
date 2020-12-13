package com.course.other;

import javax.sound.midi.Instrument;

public class Trumpet extends Instrument implements Instruments {
    public int diameter = 20;

    public Trumpet(int diametr) {
        this.diameter = diametr;
    }

    @Override
    public void play() {
        System.out.println("Trumpet play");
    }
}


