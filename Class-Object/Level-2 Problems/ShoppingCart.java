import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String name, double price, int qty) {
        this.itemName = name;
        this.price = price;
        this.quantity = qty;
    }

    double getTotal() {
        return price * quantity;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CartItem> cart = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Total");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Item Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    cart.add(new CartItem(name, price, qty));
                    System.out.println("Item added!");
                }
                case 2 -> {
                    System.out.print("Enter Item Name to remove: ");
                    String name = sc.nextLine();
                    cart.removeIf(item -> item.itemName.equalsIgnoreCase(name));
                    System.out.println("Item removed if it existed.");
                }
                case 3 -> {
                    double total = 0;
                    System.out.println("\nItems in Cart:");
                    for (CartItem item : cart) {
                        System.out.printf("- %s x%d = Rs. %.2f\n", item.itemName, item.quantity, item.getTotal());
                        total += item.getTotal();
                    }
                    System.out.printf("Total Cost: Rs. %.2f\n", total);
                }
                case 4 -> {
                    System.out.println("Exiting cart. Thank you!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid option!");
            }
        }
    }
}
