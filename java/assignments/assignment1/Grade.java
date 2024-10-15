import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the Marks: ");
        double marks = scanner.nextDouble();
        
        String grade;
        if (marks >= 75) {
            grade = "A";
        } else if (marks >= 60) {
            grade = "B";
        } else if (marks >= 40) {
            grade = "C";
        } else {
            grade = "F";
        }
        switch (grade) {
            case "A":
                System.out.println("With " + marks + " marks, you have passed with grade " + grade + ".");
                break;
            case "B":
                System.out.println("With " + marks + " marks, you have passed with grade " + grade + ".");
                break;
            case "C":
                System.out.println("With " + marks + " marks, you have passed with grade " + grade + ".");
                break;
            case "F":
                System.out.println("With " + marks + " marks, you have failed the exam with grade " + grade + ".");
                break;
            default:
                System.err.println("Invalid grade category.");
                break;
        }
        scanner.close();
    }
}