import java.util.Scanner;

public class GreaterAmongTwo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the Number 1 (or type 'exit' to quit): ");

            if (scanner.hasNextInt()) {
                int number1 = scanner.nextInt();

                System.out.print("Enter the Number 2: ");
                if (scanner.hasNextInt()) {
                    int number2 = scanner.nextInt();

                    String output =(number1 > number2) ? 
                                    number1 + " is greater than " + number2 :
                                    (number1 == number2) ? 
                                    number1 + " is equal to " + number2 :
                                    number2 + " is greater than " + number1;
                    System.out.println(output);
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
