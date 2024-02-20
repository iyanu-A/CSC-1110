/*
 * Course: CSC1110 - My Section
 * Winter 2022-23
 * Lab 3 - Pig Game
 * Name: Iyanuoluwa
 * Created: 11-20-2023
 */
package adebayoi;

/**
 * Class to create an AI Player with a threshold to its turn
 */
public class ThresholdAIPlayer extends AIPlayer {
    private final int threshold;
    private int tempThreshold;

    /**
     * Creates a new AI Player that ends it turn after it has scored a
     * set amount of points
     *
     * @param threshold set amount of points that ends its turn
     */
    public ThresholdAIPlayer(int threshold) {
        this.threshold = threshold;
        tempThreshold = threshold;
    }

    @Override
    public boolean chooseToHold(int turnScore) {
        if (super.getScore() >= tempThreshold){
            tempThreshold = threshold + super.getScore();
            return true;
        }
        return turnScore == 1;
    }

}
