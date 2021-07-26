package main.java.com.jrDeffect.basePatterns.abstractFactory.BDayNightClub;

import main.java.com.jrDeffect.basePatterns.abstractFactory.Barman;

public class ExperiencedBarman implements Barman {
    @Override
    public void pourDrinks() {
        System.out.println("ExperiencedBarman pour free drinks...");
    }
}
