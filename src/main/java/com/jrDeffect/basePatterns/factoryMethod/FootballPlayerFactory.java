package main.java.com.jrDeffect.basePatterns.factoryMethod;

public class FootballPlayerFactory implements  PlayerFactory{
    @Override
    public Player createPlayer() {
        return new FootballPlayer();
    }
}
