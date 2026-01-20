package com.singhcse.systemdesign.designpatterns.strategy;

public class NormalBike extends Vehicle{
    NormalBike(DisplayStrategy displayStrategy) {
        super(displayStrategy);
    }
}
