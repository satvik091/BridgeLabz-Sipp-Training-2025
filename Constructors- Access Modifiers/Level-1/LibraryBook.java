import java.util.Scanner;

public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;  // Available by default
    }

    public boolean borrowBook() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author +
                ", Price: ₹" + price + ", Available: " + (available ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter title: ");
        String title = sc.nextLine();

        System.out.print("Enter author: ");
        String author = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        LibraryBook book = new LibraryBook(title, author, price);

        book.display();

        System.out.print("Do you want to borrow the book? (yes/no): ");
        sc.nextLine(); // clear buffer
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            if (book.borrowBook()) {
                System.out.println("Book borrowed successfully!");
            } else {
                System.out.println("Book not available.");
            }
        }

        book.display();
    }
}
