import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private static int lowerBound = 1;
    private static int upperBound = 100;
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");
        System.out.println("After each guess, type: high / low / correct");

        boolean guessedCorrectly = false;
        while (!guessedCorrectly && lowerBound <= upperBound) {
            int guess = generateGuess();
            System.out.println("Is your number " + guess + "?");
            String feedback = getUserFeedback();

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number.");
                guessedCorrectly = true;
            } else if (feedback.equals("low")) {
                lowerBound = guess + 1;
            } else if (feedback.equals("high")) {
                upperBound = guess - 1;
            } else {
                System.out.println("Invalid input. Please type high / low / correct.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Hmm, something went wrong! Did you provide consistent feedback?");
        }
    }

    private static int generateGuess() {
        // Generate a random guess within current bounds
        return lowerBound + random.nextInt(upperBound - lowerBound + 1);
    }

    private static String getUserFeedback() {
        System.out.print("Your feedback: ");
        return scanner.nextLine().trim().toLowerCase();
    }
}
