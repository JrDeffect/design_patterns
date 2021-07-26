package main.java.com.jrDeffect.basePatterns.abstractFactory.VisitingGroup;

import main.java.com.jrDeffect.basePatterns.abstractFactory.Administrator;
import main.java.com.jrDeffect.basePatterns.abstractFactory.Barman;
import main.java.com.jrDeffect.basePatterns.abstractFactory.Dj;
import main.java.com.jrDeffect.basePatterns.abstractFactory.NightClubTeamClubFactory;
import main.java.com.jrDeffect.basePatterns.abstractFactory.Security;

public  class VisitingGroupTeamFactory implements NightClubTeamClubFactory {
    @Override
    public Dj getDj() {
        return new DjOneTheRoad();
    }

    @Override
    public Barman getBarman() {
        return new BarmanOnTheRoad();
    }

    @Override
    public Security getSecurity() {
        return null;
    }

    @Override
    public Administrator getAdministratorNightClub() {
        return getAdministratorNightClub();
    }
}
