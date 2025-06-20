import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        int terms = getInput();

        if (terms <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            generateFibonacci(terms);
        }
    }

    // Function to get input from user
    private static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        return scanner.nextInt();
    }

    // Function to generate and print Fibonacci sequence
    private static void generateFibonacci(int terms) {
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci sequence up to " + terms + " terms:");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println(); // move to next line after sequence
    }
}
