import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the Number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (number % 2 == 0) {
                    System.out.println("The entered number " + number + " is an even number.");
                } else {
                    System.out.println("The entered number " + number + " is an odd number.");
                }
                break;
            } else {
                System.err.println("Invalid Input, Please Enter an Integer Value...");
                scanner.next();
            }
        }
        scanner.close();
    }
}
