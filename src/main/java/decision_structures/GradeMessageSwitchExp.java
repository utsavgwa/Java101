package decision_structures;

import java.util.Scanner;

public class GradeMessageSwitchExp {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        // initialize a message based on the grade, using switch expression
        String message = switch (grade){
            case "A"-> "Excellent job, keep it up!";
            case "B"->"Great job";
            case "C"->"It's OK, there's scope for improvement";
            case "D"->"You need to work harder, take it seriously";
            case "F"->"Uh Oh! You have not passed the minimum threshold";
            default-> "Error, Invalid Grade";
        };
        System.out.println(message);
    }
}
