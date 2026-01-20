package com.singhcse.systemdesign.designpatterns.strategy;

public class DigitalDisplay implements DisplayStrategy{
    @Override
    public void display() {
        System.out.println("This method is only for Digital Display purpose...");
    }
}
