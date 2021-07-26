package main.java.com.jrDeffect.basePatterns.factoryMethod;

public class VolleyballPlayerFactory implements PlayerFactory {
    @Override
    public Player createPlayer() {
        return new VolleyballPlayer();
    }
}
