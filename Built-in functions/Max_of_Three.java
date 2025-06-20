import java.util.Scanner;

public class MaxOfThree {

    public static void main(String[] args) {
        System.out.println("Enter three integers:");
        int num1 = getInput("First number: ");
        int num2 = getInput("Second number: ");
        int num3 = getInput("Third number: ");

        int max = calculateMax(num1, num2, num3);

        System.out.println("The maximum of the three numbers is: " + max);
    }

    // Function to get integer input from user
    private static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Function to calculate maximum of three integers
    private static int calculateMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
