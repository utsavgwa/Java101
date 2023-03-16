package decision_structures;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;
        System.out.println("Enter the number of sales made this week: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales >= quota){
            System.out.println("Congratulations, you met the quota for weekly sales.");
        }
        else {
            int salesShort = quota - sales;
            System.out.println("You did not met your quota this week. You were "+salesShort+" sales short." );

        }
    }
}
