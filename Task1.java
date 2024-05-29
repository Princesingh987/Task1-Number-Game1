import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
      int maxRange = 100;
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + minRange + " and " + maxRange + ".");
        
        int userGuess;
        boolean hasGuessedCorrectly = false;
        int attempts = 0; // Track the number of attempts
        
        while (!hasGuessedCorrectly && attempts < 5) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++; // Increment the attempts counter
            
            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number correctly.");
                hasGuessedCorrectly = true;
            }
        }
        
        if (!hasGuessedCorrectly) {
            System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNumber);
        }
        
        scanner.close();
    }
}