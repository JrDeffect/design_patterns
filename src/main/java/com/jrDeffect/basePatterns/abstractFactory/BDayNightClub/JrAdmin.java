package main.java.com.jrDeffect.basePatterns.abstractFactory.BDayNightClub;

import main.java.com.jrDeffect.basePatterns.abstractFactory.Administrator;

public class JrAdmin implements Administrator {
    @Override
    public void manageNightClub() {
        System.out.println("JrAdmin book a place...");
    }
}
