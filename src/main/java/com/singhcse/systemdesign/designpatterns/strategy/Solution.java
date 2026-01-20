package com.singhcse.systemdesign.designpatterns.strategy;

public class Solution {
    public static void main(String[] args) {
        Vehicle v1 = new NormalBike(new AnalogDisplay());
        v1.display();
        v1.setDisplayStrategy(new DigitalDisplay());
        v1.display();
        Vehicle v2 = new SportsBike(new DigitalDisplay());
        v2.display();
        v2.setDisplayStrategy(new AnalogDisplay());
        v2.display();
    }
}
