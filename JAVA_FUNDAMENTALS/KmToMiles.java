import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        double km;
        Scanner input = new Scanner(System.in);
        km = input.nextDouble();
        double miles = km / 1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}