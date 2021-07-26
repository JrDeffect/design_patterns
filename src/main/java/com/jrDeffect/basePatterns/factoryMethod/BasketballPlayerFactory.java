package main.java.com.jrDeffect.basePatterns.factoryMethod;

public class BasketballPlayerFactory implements PlayerFactory{
    @Override
    public Player createPlayer() {
        return new BasketballPlayer();
    }
}
