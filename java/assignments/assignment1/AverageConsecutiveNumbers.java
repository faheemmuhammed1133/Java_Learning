import java.util.Scanner;

public class AverageConsecutiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();  
        int sumEven = 0;
        for (int i = 1; i <= N; i++) {
            sumEven += 2 * i;
        }
        double averageEven = (double) sumEven / N;
        int sumOdd = 0;
        for (int i = 1; i <= N; i++) {
            sumOdd += 2 * i - 1;
        }
        double averageOdd = (double) sumOdd / N;
        System.out.println("The average of the first " + N + " even numbers is: " + averageEven);
        System.out.println("The average of the first " + N + " odd numbers is: " + averageOdd); 
        scanner.close();
    }
}