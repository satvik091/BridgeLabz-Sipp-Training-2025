import java.util.Scanner;

public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this("Guest", "Standard", 1);
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this(other.guestName, other.roomType, other.nights);
    }

    private double calculateCost() {
        double rate = switch (roomType.toLowerCase()) {
            case "deluxe" -> 3000;
            case "suite" -> 5000;
            default -> 2000;
        };
        return rate * nights;
    }

    public void displayDetails() {
        System.out.println("Guest: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("Total Cost: Rs." + calculateCost());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter guest name: ");
        String name = sc.nextLine();

        System.out.print("Enter room type (Standard/Deluxe/Suite): ");
        String type = sc.nextLine();

        System.out.print("Enter number of nights: ");
        int nights = sc.nextInt();

        HotelBooking booking = new HotelBooking(name, type, nights);
        HotelBooking copyBooking = new HotelBooking(booking);

        System.out.println("Original Booking:");
        booking.displayDetails();

        System.out.println("Copied Booking:");
        copyBooking.displayDetails();
    }
}
