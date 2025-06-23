import java.util.Scanner;

class Item {
    String itemCode;
    String itemName;
    double price;

    Item(String code, String name, double price) {
        this.itemCode = code;
        this.itemName = name;
        this.price = price;
    }

    void displayDetails(int quantity) {
        double total = price * quantity;
        System.out.println("\nItem Details:");
        System.out.println("Code     : " + itemCode);
        System.out.println("Name     : " + itemName);
        System.out.println("Price    : ₹" + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total Cost: ₹" + total);
    }
}

public class InventoryTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Code: ");
        String code = sc.nextLine();

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Item Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        Item item = new Item(code, name, price);
        item.displayDetails(quantity);

        sc.close();
    }
}
