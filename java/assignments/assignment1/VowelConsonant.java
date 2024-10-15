import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the character: ");
        char character = scanner.next().charAt(0);
        if (character == 'A' || character == 'a' || 
            character == 'E' || character == 'e' || 
            character == 'I' || character == 'i' || 
            character == 'O' || character == 'o' || 
            character == 'U' || character == 'u') {
            System.out.println(character + " is a vowel.");
        } else if ((character >= 'a' && character <= 'z') || 
                   (character >= 'A' && character <= 'Z')) {
            System.out.println(character + " is a consonant.");
        } else {
            System.out.println(character + " is not a letter.");
        }
        scanner.close();
    }
}