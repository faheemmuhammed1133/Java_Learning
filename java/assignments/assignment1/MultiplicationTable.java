import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number (or type 'exit' to quit): ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                for (int i = 1; i <= 10; i++) {
                    System.out.println(number + " x " + i + " = " + (number * i));
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
}
