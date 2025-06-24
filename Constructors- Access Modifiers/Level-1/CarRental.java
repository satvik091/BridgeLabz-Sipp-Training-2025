import java.util.Scanner;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    public CarRental() {
        this("Customer", "Basic", 1);
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    private double calculateCost() {
        double rate = switch (carModel.toLowerCase()) {
            case "suv" -> 2500;
            case "sedan" -> 2000;
            default -> 1500;
        };
        return rate * rentalDays;
    }

    public void displayDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: Rs." + calculateCost());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter car model (Basic/Sedan/SUV): ");
        String model = sc.nextLine();

        System.out.print("Enter rental days: ");
        int days = sc.nextInt();

        CarRental rental = new CarRental(name, model, days);
        rental.displayDetails();
    }
}
