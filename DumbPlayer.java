/*
 * Course: CSC1110 - My Section
 * Winter 2022-23
 * Lab 3 - Pig Game
 * Name: Iyanuoluwa
 * Created: 11-20-2023
 */
package adebayoi;

/**
 * Class for a dumb AI Player
 */
public class DumbPlayer extends AIPlayer {
    private final Die coin;

    /**
     * Creates a new AI player that has a 50% chance to end or continue its turn
     */
    public DumbPlayer() {
        this.coin = new Die(2);
    }

    @Override
    public boolean chooseToHold(int turnScore){
        return coin.roll() == 1 || turnScore == 1;
    }
}


