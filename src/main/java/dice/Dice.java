package dice;

import java.util.Random;

public class Dice {
    //private int score;
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
    /*
    Skapa en Dice-klass med en metod som används för att slå ett tärningsslag
     */
}
