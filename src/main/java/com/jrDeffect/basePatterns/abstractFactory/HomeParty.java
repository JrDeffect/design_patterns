package main.java.com.jrDeffect.basePatterns.abstractFactory;

import main.java.com.jrDeffect.basePatterns.abstractFactory.VisitingGroup.VisitingGroupTeamFactory;

public class HomeParty {
    public static void main(String[] args) {
        NightClubTeamClubFactory nightClubTeamClubFactory = new VisitingGroupTeamFactory();
        Barman barman = nightClubTeamClubFactory.getBarman();
        Dj dj = nightClubTeamClubFactory.getDj();

        System.out.println("creating visiting group...");
        barman.pourDrinks();
        dj.playMusic();
    }
}
