package loops;

import java.util.Scanner;

public class AvgTestScore {
    public static void main(String[] args) {
        // initialize the variables
        int numberOfStudents = 5;
        int numberOfTests = 3;

        Scanner scanner = new Scanner(System.in);

        // for all students
        for (int i=0; i < numberOfStudents; i++){
            double total = 0;
            // for each student grade
            for (int j=0; j<numberOfTests; j++){
                System.out.println("Score of test subject "+ (j+1)+ " for student "+(i+1)+" is:");
                double score = scanner.nextDouble();
                total = total + score;
            }
            double average = total/numberOfTests;
            System.out.println("The average test score for student "+(i+1)+" is "+ average);
        }
        scanner.close();
    }
}
