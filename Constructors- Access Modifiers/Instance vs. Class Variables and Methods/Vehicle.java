import java.util.Scanner;

public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 1500;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType +
                ", Registration Fee: ₹" + registrationFee);
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter new registration fee: ");
        double fee = sc.nextDouble();
        sc.nextLine();
        updateRegistrationFee(fee);

        System.out.print("How many vehicles? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details for Vehicle " + i + ":");
            System.out.print("Owner Name: ");
            String name = sc.nextLine();
            System.out.print("Vehicle Type: ");
            String type = sc.nextLine();

            Vehicle v = new Vehicle(name, type);
            v.displayVehicleDetails();
        }
    }
}
