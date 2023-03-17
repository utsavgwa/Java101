package loops;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {

        double rate = 15;
        double maxHours = 40;
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        // now, to validate this input now
        while (hoursWorked>maxHours || hoursWorked<0){
            System.out.println("Invalid entry, Your working hours must be between 1 and 40./n ");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();
        double GrossPay = hoursWorked*rate;
        System.out.println("Gross Pay: "+ GrossPay);
    }
}
