package dice;

import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;
    private Dice dice;
    Scanner scanner;

    public void setting() {
        player1 = new Player();
        player1.setPlayer();
        dice = new Dice();
        player2 = new Player();
        player2.setPlayer();
    }

    private void compareScores() {
        scanner = new Scanner(System.in);
        if (player1.getScore() > player2.getScore()) {
            System.out.println("\n" + "\uD83D\uDC51" + " " + "\uD83D\uDC51" + " " + "\uD83D\uDC51");
            System.out.println("The winner is " + player1.getFullName());
            System.out.println("\uD83D\uDC51" + " " + "\uD83D\uDC51" + " " + "\uD83D\uDC51" + " \n");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("\n" + "\uD83D\uDC51" + " " + "\uD83D\uDC51" + " " + "\uD83D\uDC51");
            System.out.println("The winner is " + player2.getFullName());
            System.out.println("\uD83D\uDC51" + " " + "\uD83D\uDC51" + " " + "\uD83D\uDC51" + " \n");
        } else {
            System.out.println("\n" + "It's a tie!" + "\n");
        }
    }

//    public void startGame() {
//        //Scanner scanner = new Scanner(System.in);
//        System.out.println("Write 'PLAY' if you want to start the game: ");
//        String gameStart = scanner.nextLine();
//        String gameStarter = gameStart.toUpperCase();
//
//        if (gameStarter.equals("PLAY")) {
//            setting();
//            String player1name = player1.getFirstName();
//            String player2name = player2.getFirstName();
//            for (int i = 0; i < 2; i++) {
//                System.out.println(player1name + ", your turn!");
//                dice.rollDice();
//                System.out.println("Try" + (i + 1) + " : " + dice.getScore());
//                totalScore1 = player1.addToScore(dice.getScore());
//                System.out.println("Player1's total score: " + totalScore1);
//
//                System.out.println(player2name + ", your turn!");
//                dice.rollDice();
//                System.out.println("Try" + (i + 1) + " : " + dice.getScore());
//                totalScore2 = player2.addToScore(dice.getScore());
//                System.out.println("Player2's total score: " + totalScore2);
//            }
//            compareScores(totalScore1, totalScore2);
//        } else if (gameStarter.equals("QUIT")) {
//            System.out.println("Quit the game");
//        } else {
//            System.out.println("Please write your choice: ");
//            gameStarter = scanner.nextLine();
//            gameStarter.toUpperCase();
//        }
//    }

    public void startGame() {
        boolean continueGame = true;
        while (continueGame) {
            System.out.println("Write 'PLAY' to start the game\nWrite 'Quit' to leave ");
            scanner = new Scanner(System.in);
            String gameStart = scanner.nextLine();
            String gameStarter = gameStart.toUpperCase();

            if (gameStarter.equals("PLAY")) {
                setting();
                String player1name = player1.getFirstName();
                String player2name = player2.getFirstName();
                System.out.println();
                for (int i = 0; i < 2; i++) {
                    System.out.print(player1name + ", your turn!");
                    scanner.nextLine();
                    System.out.println("\uD83C\uDFB2");
                    dice.rollDice();
                    System.out.println("Try" + (i + 1) + " : " + dice.getScore());
                    player1.addToScore(dice.getScore());
                    System.out.println("Player1's total score: " + player1.getScore() + "\n");

                    System.out.print(player2name + ", your turn!");
                    scanner.nextLine();
                    System.out.println("\uD83C\uDFB2");
                    dice.rollDice();
                    System.out.println("Try" + (i + 1) + " : " + dice.getScore());
                    player2.addToScore(dice.getScore());
                    System.out.println("Player2's total score: " + player2.getScore() + "\n");
                }
                compareScores();
            } else if (gameStarter.equals("QUIT")) {
                System.out.println("Quit the game");
                continueGame = false;
            }
        }
    }
}