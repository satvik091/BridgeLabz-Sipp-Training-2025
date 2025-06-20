import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        int number = getInput();
        
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to get integer input from user
    private static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        return scanner.nextInt();
    }

    // Function to check if a number is prime
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0, 1 and negative numbers are not prime
        }
        if (n == 2) {
            return true; // 2 is the only even prime number
        }
        if (n % 2 == 0) {
            return false; // eliminate even numbers > 2
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
