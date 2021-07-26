package main.java.com.jrDeffect.basePatterns.abstractFactory.BDayNightClub;

import main.java.com.jrDeffect.basePatterns.abstractFactory.Administrator;
import main.java.com.jrDeffect.basePatterns.abstractFactory.Barman;
import main.java.com.jrDeffect.basePatterns.abstractFactory.Dj;
import main.java.com.jrDeffect.basePatterns.abstractFactory.NightClubTeamClubFactory;
import main.java.com.jrDeffect.basePatterns.abstractFactory.Security;

public class BDTeamFactory implements NightClubTeamClubFactory {
    @Override
    public Dj getDj() {
        return new DjZxc();
    }

    @Override
    public Barman getBarman() {
        return new ExperiencedBarman();
    }

    @Override
    public Security getSecurity() {
        return new Checking();
    }

    @Override
    public Administrator getAdministratorNightClub() {
        return new JrAdmin();
    }
}
