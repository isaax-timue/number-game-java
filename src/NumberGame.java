import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String playAgain = "yes";

        while (playAgain.equalsIgnoreCase("yes")) {

            int numberToGuess = random.nextInt(100) + 1;
            int userGuess = 0;
            int attempts = 0;
            int maxAttempts = 8;
            int score = 0;

            System.out.println("\n-----🎯 Welcome to the Number Game!-----");
            System.out.println("\nGuess a number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts.\n");

            while (userGuess != numberToGuess && attempts < maxAttempts) {

                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    // 🏆 Scoring logic
                    score = (maxAttempts - attempts + 1) * 20;

                    System.out.println("\n✅ Correct! You guessed it in " + attempts + " attempts.");
                    System.out.println("🏆 Your score: " + score);
                }
            }

            if (userGuess != numberToGuess) {
                System.out.println("\n❌ Game Over! The number was: " + numberToGuess);
                System.out.println("🏆 Your score: 0");
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            playAgain = scanner.next();
        }

        System.out.println("\n👋 Thanks for playing!");
    }
}