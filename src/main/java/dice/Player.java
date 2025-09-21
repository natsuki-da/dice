package dice;

import java.util.Scanner;

public class Player {
    private String firstName;
    private String lastName;
    private int totalScore = 0;

    public void setPlayer() {
        Scanner scanner = new Scanner(System.in);
        boolean validName = false;
        while (!validName) {
            try {
                System.out.println("Please write your first name: ");
                firstName = scanner.nextLine();
                System.out.println("Last name: ");
                lastName = scanner.nextLine();
                if (firstName.isEmpty() || lastName.isEmpty()) {
                    throw new IllegalArgumentException("First name and last name cannot be empty.");
                }
                validName = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFullName() {
        String fullName = firstName.concat(" " + lastName);
        return fullName;
    }

    public void addToScore(int score) {
        totalScore += score;
    }

    public int getScore() {
        return totalScore;
    }

}
