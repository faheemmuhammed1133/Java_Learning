import java.util.Scanner;

public class GreaterAmongThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the Number 1 (or type 'exit' to quit): ");
            if (scanner.hasNextInt()) {
                int number1 = scanner.nextInt();
                System.out.print("Enter the Number 2: ");
                if (scanner.hasNextInt()) {
                    int number2 = scanner.nextInt();
                    System.out.print("Enter the Number 3: ");
                    if (scanner.hasNextInt()) {
                        int number3 = scanner.nextInt();
                        int greatest;
                        if (number1 >= number2 && number1 >= number3) {
                            greatest = number1;
                        } else if (number2 >= number1 && number2 >= number3) {
                            greatest = number2;
                        } else {
                            greatest = number3;
                        }
                        System.out.println("The greatest number among " + number1 + ", " + number2 + ", and " + number3 + " is " + greatest + ".");
                    } else {
                        String input = scanner.next();
                        if (input.equalsIgnoreCase("exit")) {
                            System.out.println("Exiting the program...");
                            break;
                        } else {
                            System.err.println("Invalid Input, Please Enter an Integer Value...");
                        }
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