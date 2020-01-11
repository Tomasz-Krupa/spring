package org.example;

import java.util.Random;

public class MyRandom {
    private int value;

    public MyRandom createRandom(){
        return new MyRandom();
    }

    public MyRandom() {
        System.out.println("Losujemy: "+ this.toString());
        this.value = new Random().nextInt(100);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
