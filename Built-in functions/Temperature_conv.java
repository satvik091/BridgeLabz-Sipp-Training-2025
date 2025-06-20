import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter choice (1 or 2): ");
        int choice = scanner.nextInt();

        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();

        if (choice == 1) {
            System.out.println("Fahrenheit: " + celsiusToFahrenheit(temp));
        } else if (choice == 2) {
            System.out.println("Celsius: " + fahrenheitToCelsius(temp));
        } else {
            System.out.println("Invalid choice.");
        }
    }

    private static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    private static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
