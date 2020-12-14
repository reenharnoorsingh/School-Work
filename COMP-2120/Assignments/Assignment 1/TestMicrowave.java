package com.company.Assignment1;

public class TestMicrowave {
    public static void main(String[] args) {
        Microwave mw = new Microwave();
        mw.increaseTime30();
        mw.increaseTime30();
        mw.changePowerLevel();
        mw.start();
        mw.reset();
        mw.increaseTime30();
        mw.stop();
    }
}
