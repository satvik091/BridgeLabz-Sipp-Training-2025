import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        int number = getInput();
        long result = factorial(number);
        displayResult(number, result);
    }

    private static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        return scanner.nextInt();
    }

    private static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    private static void displayResult(int n, long fact) {
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
