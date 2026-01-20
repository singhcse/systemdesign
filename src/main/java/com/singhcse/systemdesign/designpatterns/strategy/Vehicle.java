package com.singhcse.systemdesign.designpatterns.strategy;

public class Vehicle{
    private DisplayStrategy displayStrategy;
    protected Vehicle(DisplayStrategy displayStrategy){
        this.displayStrategy = displayStrategy;
    }
    public void display(){
        displayStrategy.display();
    }
    public void setDisplayStrategy(DisplayStrategy displayStrategy) {
        this.displayStrategy = displayStrategy;
    }
}