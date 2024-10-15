import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String num = Integer.toString(number);
        int len=num.length();
        int sum=0;
        for (int i = 0; i < len; i++) {
            int digit = Character.getNumericValue(num.charAt(i));
            sum += Math.pow(digit, len);
        }
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        scanner.close();
    }
}