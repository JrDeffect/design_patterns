package main.java.com.jrDeffect.basePatterns.factoryMethod;

public class SportGame {
    public static void main(String[] args) {
        PlayerFactory playerFactory = createPlayerByGame("volleyball");
        Player player = playerFactory.createPlayer();

        player.playGame();
    }

    static PlayerFactory createPlayerByGame(String game){
        if (game.equalsIgnoreCase("football")){
            return new FootballPlayerFactory();
        }else if (game.equalsIgnoreCase("basketball")){
            return new BasketballPlayerFactory();
        } else if (game.equalsIgnoreCase("volleyball")){
            return new VolleyballPlayerFactory();
        }
        else{
            throw new RuntimeException(game + " is unknown game.");
        }
    }
}