package dice;

import java.util.Random;

public class Dice {
    private int score;

    public void rollDice() {
        Random random = new Random();
        score = random.nextInt(1, 7);
    }

    public int getScore() {
        return score;
    }
}
