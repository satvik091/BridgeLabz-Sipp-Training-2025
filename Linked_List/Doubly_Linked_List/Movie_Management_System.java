class MovieNode {
    String title;
    String director;
    int year;
    double rating;
    MovieNode next;
    MovieNode prev;

    public MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

public class MovieDoublyLinkedList {
    private MovieNode head;
    private MovieNode tail;

    public MovieDoublyLinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // Add at beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add at end
    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add at specific position (1-based index)
    public void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }

        if (position == 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode newNode = new MovieNode(title, director, year, rating);
        MovieNode current = head;

        for (int i = 1; i < position - 1; i++) {
            if (current == null) {
                System.out.println("Position out of bounds.");
                return;
            }
            current = current.next;
        }

        if (current == tail) {
            addAtEnd(title, director, year, rating);
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
    }

    // Remove by movie title
    public void removeByTitle(String title) {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }

        MovieNode current = head;
        while (current != null && !current.title.equalsIgnoreCase(title)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Movie not found.");
            return;
        }

        if (current == head && current == tail) {
            head = tail = null;
        } else if (current == head) {
            head = head.next;
            head.prev = null;
        } else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        System.out.println("Movie \"" + title + "\" removed.");
    }

    // Search by Director
    public void searchByDirector(String director) {
        MovieNode current = head;
        boolean found = false;
        while (current != null) {
            if (current.director.equalsIgnoreCase(director)) {
                displayMovie(current);
                found = true;
            }
            current = current.next;
        }
        if (!found) System.out.println("No movies found for director: " + director);
    }

    // Search by Rating
    public void searchByRating(double rating) {
        MovieNode current = head;
        boolean found = false;
        while (current != null) {
            if (current.rating == rating) {
                displayMovie(current);
                found = true;
            }
            current = current.next;
        }
        if (!found) System.out.println("No movies found with rating: " + rating);
    }

    // Update rating by title
    public void updateRating(String title, double newRating) {
        MovieNode current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                current.rating = newRating;
                System.out.println("Rating updated for \"" + title + "\" to " + newRating);
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found.");
    }

    // Display all (forward)
    public void displayForward() {
        if (isEmpty()) {
            System.out.println("No movies to display.");
            return;
        }

        System.out.println("Movies (Forward):");
        MovieNode current = head;
        while (current != null) {
            displayMovie(current);
            current = current.next;
        }
    }

    // Display all (reverse)
    public void displayReverse() {
        if (isEmpty()) {
            System.out.println("No movies to display.");
            return;
        }

        System.out.println("Movies (Reverse):");
        MovieNode current = tail;
        while (current != null) {
            displayMovie(current);
            current = current.prev;
        }
    }

    // Display a single movie
    private void displayMovie(MovieNode node) {
        System.out.println("Title: " + node.title +
                ", Director: " + node.director +
                ", Year: " + node.year +
                ", Rating: " + node.rating);
    }
}


public class Main {
    public static void main(String[] args) {
        MovieDoublyLinkedList movieList = new MovieDoublyLinkedList();

        movieList.addAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        movieList.addAtBeginning("The Godfather", "Francis Ford Coppola", 1972, 9.2);
        movieList.addAtPosition(2, "Interstellar", "Christopher Nolan", 2014, 8.6);
        movieList.addAtEnd("Parasite", "Bong Joon-ho", 2019, 8.6);

        movieList.displayForward();
        movieList.displayReverse();

        movieList.updateRating("Interstellar", 9.0);
        movieList.searchByDirector("Christopher Nolan");
        movieList.searchByRating(8.6);

        movieList.removeByTitle("Inception");
        movieList.displayForward();
    }
}

