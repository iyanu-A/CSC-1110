/*
 * Course: CSC1110 - My Section
 * Winter 2022-23
 * Lab 3 - Pig Game
 * Name: Iyanuoluwa
 * Created: 11-20-2023
 */
package adebayoi;

/**
 * Class with player data
 */
public abstract class Player {
    private final String name;
    private int score;

    /**
     * Creates a new player
     *
     * @param name the name of the player
     */
    public Player(String name) {
        this.name = name;
    }


    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }

    /**
     * adds points to the players score
     *
     * @param turnScore points they scored on a roll
     */
    public void addToScore(int turnScore){
        score += turnScore;
    }

    /**
     * player chooses to end their turn or continue rolling
     *
     * @param turnScore points they scored on a roll
     * @return to end or continue their turn
     */
    public abstract boolean chooseToHold(int turnScore);

    /**
     * Displays the players roll
     *
     * @return the roll the player got
     */
    public String toString(){
        return name + " rolled a ";
    }
}
