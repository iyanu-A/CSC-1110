/*
 * Course: CSC1110 - My Section
 * Fall 2023
 * Lab 12 - The Game of Pig
 * Name: Iyanuoluwa
 * Created: 11-20-2023
 */
package adebayoi;

import java.util.ArrayList;

/**
 * Code to run the PigGame
 */
public class PigGame {
    private static final int WINNING_POINTS = 100;
    private final Die die;
    private final ArrayList<Player> players;

    /**
     * Sets up the game
     */
    public PigGame() {
        this.die = new Die();
        players = new ArrayList<>();
    }

    /**
     * Adds players to the game
     *
     * @param player a human, dumb AI, threshold AI
     */
    public void addPlayer(Player player) {
        players.add(player);
    }

    /**
     * Starts the game
     *
     * @return the winner
     */
    public Player playGame() {
        Player player;
        int playerTurn = new Die(players.size()).roll() -1;
        boolean haveWinner = false;

        do {
            if (playerTurn == players.size()){
                playerTurn = 0;
            }

            player = players.get(playerTurn);
            System.out.println(this);
            int cumulativeScore = 0;
            int turnScore;

            do {
                turnScore = die.roll();
                cumulativeScore += turnScore;

                takeTurn(player);

                if (turnScore == 1){
                    cumulativeScore *= -1;
                    player.addToScore(cumulativeScore);
                }

            } while (!players.get(playerTurn).chooseToHold(turnScore));

            if (players.get(playerTurn).getScore() >= WINNING_POINTS){
                haveWinner = true;
            }

            playerTurn++;

        } while (!haveWinner);

        System.out.println(this);
        return player;
    }

    /**
     * Prints the points of all the players
     *
     * @return player info
     */
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\n");
        for (Player player : players) {
            str.append(player.getName()).append(" :\t").append(player.getScore()).append("\n");
        }
        return str.toString();
    }

    /**
     * Player takes their turn
     *
     * @param player the player that is taking their turn
     */
    public void takeTurn(Player player) {
        player.addToScore(die.getCurrentValue());
        if (die.getCurrentValue() == 1){
            System.out.println(player + " " + die.getCurrentValue());
            System.out.println(player.getName() + " busts.");
        } else {
            System.out.println(player + " " + die.getCurrentValue());
        }

    }
}
