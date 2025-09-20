package dice;

import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;
    private Dice dice;
    private int totalScore1;
    private int totalScore2;
    Scanner scanner;
    /*
    I main-metoden skapar du bara en instans av Game-klassen och anropar en metod i
Game-klassen där spellogiken körs
     */

    public void setting() {
        player1 = new Player();
        player1.setPlayer();
        dice = new Dice();
        player2 = new Player();
        player2.setPlayer();
    }

    public void compareScores(int totalScore1, int totalScore2) {
        scanner = new Scanner(System.in);
        if (totalScore1 > totalScore2) {
            System.out.println("The winner is " + player1.getFullName());
        } else if (totalScore1 < totalScore2) {
            System.out.println("The winner is " + player2.getFullName());
        } else {
            System.out.println("It's a tie!");
        }
        System.out.println("Wanna play again?\nChoose 1 if you want to continue, \nchoose 2 if stop.");
        String choice = scanner.nextLine();
        int yourChoice = Integer.parseInt(choice);
        if (yourChoice < 2) {
            System.out.println("Game continues...");
        } else {
            System.out.println("Game ended");
        }

    }

    public void startGame() {
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Write 'PLAY' if you want to start the game: ");
        String gameStart = scanner.nextLine();
        String gameStarter = gameStart.toUpperCase();

        if (gameStarter.equals("PLAY")) {
            setting();
            String player1name = player1.getFirstName();
            String player2name = player2.getFirstName();
            for (int i = 0; i < 2; i++) {
                System.out.println(player1name + ", your turn!");
                dice.rollDice();
                System.out.println("Try" + (i + 1) + " : " + dice.getScore());
                totalScore1 = player1.addToScore(dice.getScore());
                System.out.println("Player1's total score: " + totalScore1);

                System.out.println(player2name + ", your turn!");
                dice.rollDice();
                System.out.println("Try" + (i + 1) + " : " + dice.getScore());
                totalScore2 = player2.addToScore(dice.getScore());
                System.out.println("Player2's total score: " + totalScore2);
            }
            compareScores(totalScore1, totalScore2);
        } else if (gameStarter.equals("QUIT")) {
            System.out.println("Quit the game");
        } else {
            System.out.println("Please write your choice: ");
            gameStarter = scanner.nextLine();
            gameStarter.toUpperCase();
        }
    }
}
