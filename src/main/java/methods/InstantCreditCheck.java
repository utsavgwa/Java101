package methods;

import java.util.Scanner;

public class InstantCreditCheck {
    // defined at class level, global variables
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        boolean qual = isUserQualified(salary, creditScore);
        notifyUser(qual);
    }

    public static void notifyUser(boolean qual) {
        if (qual) System.out.println("Congratulations, you have been approved");
        else System.out.println("Sorry, you've been declined");
    }

    public static boolean isUserQualified(double salary, int creditScore) {
        if (salary>=requiredSalary && creditScore>=requiredCreditScore){
            return true;
        }
        else return false;
    }

    public static double getSalary(){
        System.out.println("Enter you salary: ");
        double sal = scanner.nextDouble();
        return sal;
    }
    public static int getCreditScore(){
        System.out.println("Enter your credit score: ");
        int crd = scanner.nextInt();
        return crd;
    }
}
