package com.singhcse.systemdesign.designpatterns.strategy;

public interface DisplayStrategy {
    void display();

    /*We have multiple display behaviors that may vary independently from vehicle types.
    Strategy allows us to encapsulate these behaviors and compose them dynamically without modifying vehicle classes.*/
}
