import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number (or type 'exit' to quit): ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (isPrime(number)) {
                    System.out.println(number + " is a prime number.");
                } else {
                    System.out.println(number + " is not a prime number.");
                }
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting the program...");
                    break;
                } else {
                    System.err.println("Invalid Input, Please Enter an Integer Value...");
                }
            }
        }
        
        scanner.close();
    }


    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
