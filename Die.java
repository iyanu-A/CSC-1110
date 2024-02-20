/*
 * Course: CSC1110 - My Section
 * Winter 2022-23
 * Lab 3 - Pig Game
 * Name: Iyanuoluwa
 * Created: 11-20-2023
 */

package adebayoi;

import java.util.Random;

/**
 * Die class to roll a random number
 */
public class Die {
    private static final int MIN_SIDES = 2;
    private static final int MAX_SIDES = 100;
    private static final int DEFAULT_SIDES = 6;
    private final Random generator = new Random();
    private final int numSides;
    private int currentValue;

    /**
     * Creates a new die with a specific amount of sides
     *
     * @param numSides number of sides the dice will have
     */
    public Die(int numSides){
        this.numSides = numSides;
    }

    /**
     * Creates a new die with DEFAULT SIDES
     */
    public Die(){
        this(DEFAULT_SIDES);
    }

    public int getCurrentValue(){
        return currentValue;

    }

    /**
     * Rolls the diece and returns a random number based on the
     * number of sides the dice has
     *
     * @return current value of the die
     */
    public int roll(){
        currentValue = generator.nextInt(numSides)+1;
        return currentValue;
    }
}
