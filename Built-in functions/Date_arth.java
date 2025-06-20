import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmeticExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String dateInput = scanner.nextLine();

        LocalDate date = LocalDate.parse(dateInput);

        LocalDate resultDate = date.plusDays(7)
                                   .plusMonths(1)
                                   .plusYears(2)
                                   .minusWeeks(3);

        System.out.println("Resulting date after adding 7 days, 1 month, 2 years and subtracting 3 weeks: " + resultDate);
        scanner.close();
    }
}
