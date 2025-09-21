package dice;

import java.util.Scanner;

public class Player {
    private String firstName;
    private String lastName;
    private int totalScore = 0;

    public void setPlayer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write your first name: ");
        firstName = scanner.nextLine();
        System.out.println("Last name: ");
        lastName = scanner.nextLine();
        //scanner.close();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFullName() {
        String fullName = firstName.concat(" " + lastName);
        return fullName;
    }

    public int addToScore(int score) {
        totalScore += score;
        return totalScore;
    }

    public int getScore() {
        return totalScore;
    }

}
