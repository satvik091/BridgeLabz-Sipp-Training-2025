import java.util.Scanner;

public class GcdLcmCalculator {
    public static void main(String[] args) {
        int a = getInput("Enter first number: ");
        int b = getInput("Enter second number: ");

        int gcd = computeGCD(a, b);
        int lcm = computeLCM(a, b, gcd);

        displayResult(a, b, gcd, lcm);
    }

    private static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private static int computeGCD(int a, int b) {
        if (b == 0) return a;
        return computeGCD(b, a % b);
    }

    private static int computeLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    private static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is " + lcm);
    }
}
