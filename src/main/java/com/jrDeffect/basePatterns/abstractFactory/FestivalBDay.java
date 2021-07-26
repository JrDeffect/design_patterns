package main.java.com.jrDeffect.basePatterns.abstractFactory;

import main.java.com.jrDeffect.basePatterns.abstractFactory.BDayNightClub.BDTeamFactory;

public class FestivalBDay {
    public static void main(String[] args) {
        NightClubTeamClubFactory nightClubTeamClubFactory = new BDTeamFactory();
        Barman barman = nightClubTeamClubFactory.getBarman();
        Dj dj = nightClubTeamClubFactory.getDj();
        Security security = nightClubTeamClubFactory.getSecurity();
        Administrator administrator = nightClubTeamClubFactory.getAdministratorNightClub();

        System.out.println("Creating BDay party...");
        barman.pourDrinks();
        dj.playMusic();
        security.guards();
        administrator.manageNightClub();
    }
}
