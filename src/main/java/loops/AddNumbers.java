package loops;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // variable to control the condition
        boolean again;
        do {
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Sum of the given numbers is: " + (num1 + num2));
            // above here, the + sign is getting overloaded, being utilized in two different ways
            // append a value to a string, then for addition
            System.out.println("Do you want to run again? type false for no, true for yes");
            again = scanner.nextBoolean();
        }while(again);
    }
}
