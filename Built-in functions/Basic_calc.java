import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        double num1 = getNumber("Enter first number: ");
        double num2 = getNumber("Enter second number: ");
        char operation = getOperation();

        double result = performOperation(num1, num2, operation);
        displayResult(num1, num2, operation, result);
    }

    private static double getNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    private static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose operation (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    private static double performOperation(double a, double b, char op) {
        switch (op) {
            case '+': return add(a, b);
            case '-': return subtract(a, b);
            case '*': return multiply(a, b);
            case '/': return divide(a, b);
            default: 
                System.out.println("Invalid operation.");
                return 0;
        }
    }

    private static double add(double a, double b) { return a + b; }
    private static double subtract(double a, double b) { return a - b; }
    private static double multiply(double a, double b) { return a * b; }
    private static double divide(double a, double b) { 
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return 0;
        }
        return a / b; 
    }

    private static void displayResult(double a, double b, char op, double result) {
        System.out.println("Result: " + a + " " + op + " " + b + " = " + result);
    }
}
