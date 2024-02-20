/*
 * Course: CSC1110 - My Section
 * Winter 2022-23
 * Lab 3 - Pig Game
 * Name: Iyanuoluwa
 * Created: 11-20-2023
 */
package adebayoi;

/**
 * Class to create an AI player
 */
public abstract class AIPlayer extends Player {
    private static int numbersOfAIPlayers = 0;

    /**
     * creates a new AI player
     */
    public AIPlayer() {
        super("Bot #"+ numbersOfAIPlayers);
        numbersOfAIPlayers++;
    }
}
