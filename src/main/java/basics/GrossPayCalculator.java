//this is required
package basics;

import java.util.Scanner;

// class declaration, name of class has to be the same as the name of file
public class GrossPayCalculator {
    public static void main(String[] args){

        System.out.println("How many hours do you work?");
        // declared scanner,
        Scanner scanner = new Scanner(System.in);
        // scanner.next(); next reads the last string thing, that was on the console
        int hours = scanner.nextInt();// it says, i am expecting an integar

        System.out.println("What is your hourly pay rate?");
        double rate = scanner.nextDouble();
        // now, done with input, close the scanner
        scanner.close();

        double payRate = hours * rate;
        System.out.println("Gross Pay: " + payRate);
    }
}

// learned the ver basics of java in this program, such as:
// packages
// classes
// main method
// input
// output

// what happens when you don't close the scanner?
// A: the resource is left open, it runs in the background, interferes with other resources in a long program, in an enterprise application, it can cause performance issues.
