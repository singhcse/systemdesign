package com.singhcse.systemdesign.designpatterns.strategy;

public class AnalogDisplay implements DisplayStrategy{
    @Override
    public void display() {
        System.out.println("This method is only for Analog Display purpose...");
    }
}
