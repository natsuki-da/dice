package dice;

import java.util.Random;

public class Dice {
    private int score;

    public void rollDice() {
        Random random = new Random();
        score = random.nextInt(1, 7);
        setScore(score);
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
