import java.util.*;

public class DayOfWeek {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        // Input from command line: month, day, year
	System.out.println("Enter a Month Number: ");
        int m = sc.nextInt();
	System.out.println("Enter a Day Number: ");
        int d = sc.nextInt();
	System.out.println("Enter a Year Number: ");
        int y = sc.nextInt();

        // Step 1: Compute y0
        int y0 = y - (14 - m) / 12;

        // Step 2: Compute x
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Step 3: Compute m0
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Step 4: Compute d0 (day of the week)
        int d0 = (d + x + 31 * m0 / 12) % 7;

        System.out.println("Day of the week (0=Sunday, ..., 6=Saturday): " + d0);
    }
}
