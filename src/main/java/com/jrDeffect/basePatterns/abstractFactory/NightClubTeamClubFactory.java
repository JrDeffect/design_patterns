package main.java.com.jrDeffect.basePatterns.abstractFactory;

public interface NightClubTeamClubFactory {
    Dj getDj();
    Barman getBarman();
    Security getSecurity();
    Administrator getAdministratorNightClub();
}
