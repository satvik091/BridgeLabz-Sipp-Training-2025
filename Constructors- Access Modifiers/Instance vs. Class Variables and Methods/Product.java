import java.util.Scanner;

public class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName + ", Price: ₹" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many products? ");
        int count = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 1; i <= count; i++) {
            System.out.println("Enter details for Product " + i + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine(); // consume newline

            Product p = new Product(name, price);
            p.displayProductDetails();
        }

        Product.displayTotalProducts();
    }
}
