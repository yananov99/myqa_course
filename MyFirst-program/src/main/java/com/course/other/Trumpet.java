package com.course.other;

import javax.sound.midi.Instrument;

public class Trumpet implements Instruments {
    public Trumpet (int diameter){

        this.diameter = diameter;

    }
    public int diameter = 20;


    @Override
    public void play() {

        System.out.println("Trumpet play");
    }
}


