package chapter5;


import java.util.Scanner;

public class InstantCreditCheck {

    static int requiredSalary = 25000;
    static int reqcreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();
        boolean validC = isValidCredit(creditScore, salary);
        notifyUser(validC);
    }

    public static double getSalary() {
        System.out.println("Salary: ");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore() {
        System.out.println("Credit Score: " );
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isValidCredit(int creditScore, double salary) {
        if (creditScore >= reqcreditScore && salary >= requiredSalary )
            return true;
        else
            return false;
    }

    public static void notifyUser(boolean isValidCredit) {
        if (isValidCredit)
            System.out.println("You're Approved!");
        else
            System.out.println("You're Rejected!");
    }
}
