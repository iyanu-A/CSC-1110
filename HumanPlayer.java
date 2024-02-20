/*
 * Course: CSC1110 - My Section
 * Winter 2022-23
 * Lab 3 - Pig Game
 * Name: Iyanuoluwa
 * Created: 11-20-2023
 */
package adebayoi;

import java.util.Scanner;

/**
 * Class for the human player
 */
public class HumanPlayer extends Player {
    private final Scanner in;

    /**
     * Creates a new human player
     *
     * @param name the name of the player
     * @param in Scanner Object
     */
    public HumanPlayer(String name, Scanner in) {
        super(name);
        this.in = in;
    }

    @Override
    public boolean chooseToHold(int turnScore){
        if (turnScore == 1){
            return true;
        }

        boolean isTurn;
        String input;

        do {
            System.out.println("Hold? [y/n]");
            input = in.nextLine();
            isTurn = input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n");
        } while (!isTurn);

        return input.equalsIgnoreCase("y");
    }
}
