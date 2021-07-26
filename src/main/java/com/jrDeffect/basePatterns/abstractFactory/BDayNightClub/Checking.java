package main.java.com.jrDeffect.basePatterns.abstractFactory.BDayNightClub;

import main.java.com.jrDeffect.basePatterns.abstractFactory.Security;

public class Checking implements Security {
    @Override
    public void guards() {
        System.out.println("The security guard checks the presence of a VIP pass... ");
    }
}
