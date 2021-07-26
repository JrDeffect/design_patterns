package main.java.com.jrDeffect.basePatterns.abstractFactory.VisitingGroup;

import main.java.com.jrDeffect.basePatterns.abstractFactory.Dj;

public class DjOneTheRoad implements Dj {
    @Override
    public void playMusic() {
        System.out.println("DjOneTheRoad playing music on request...");
    }
}
