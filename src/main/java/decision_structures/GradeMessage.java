package decision_structures;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        // initialize a message based on the grade
        String message;

        switch (grade){
            case "A":
                message = "Excellent job, keep it up!";
                break;
            case "B":
                message = "Great job";
                break;
            case "C":
                message = "It's OK, there's scope for improvement";
                break;
            case "D":
                message = "You need to work harder, take it seriously";
                break;
            case "F":
                message = "Uh Oh! You have not passed the minimum threshold";
                break;
            default:
                message = "Error, Invalid Grade";
                break;
        }
        System.out.println(message);
    }
}
