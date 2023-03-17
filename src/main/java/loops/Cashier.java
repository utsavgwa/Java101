package loops;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        System.out.println("Enter the number of items: ");
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();

        double total =0;

        for (int i=1; i<= quantity; i++){
            System.out.println("Enter the cost of item: " + i);
            double price = scanner.nextDouble();

            total = total + price;
        }
        scanner.close();
        System.out.println("The total cost of items is: "+ total );
    }
}
