import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int userGuess = 0;
        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess > randomNumber) {
                System.out.println("Too high, try again.");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
            }
        }
        scanner.close();
    }
}