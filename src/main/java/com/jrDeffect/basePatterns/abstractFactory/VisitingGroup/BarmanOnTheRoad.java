package main.java.com.jrDeffect.basePatterns.abstractFactory.VisitingGroup;

import main.java.com.jrDeffect.basePatterns.abstractFactory.Barman;

public class BarmanOnTheRoad implements Barman {
    @Override
    public void pourDrinks() {
        System.out.println("BarmanOnTheRoad pour your drinks xD...");
    }
}
