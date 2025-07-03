class StudentNode {
    int rollNo;
    String name;
    int age;
    String grade;
    StudentNode next;

    public StudentNode(int rollNo, String name, int age, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

public class StudentLinkedList {
    private StudentNode head;

    public StudentLinkedList() {
        this.head = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    // Add at beginning
    public void addAtBeginning(int rollNo, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addAtEnd(int rollNo, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        if (isEmpty()) {
            head = newNode;
            return;
        }

        StudentNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Add at specific position (1-based index)
    public void addAtPosition(int position, int rollNo, String name, int age, String grade) {
        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }

        if (position == 1) {
            addAtBeginning(rollNo, name, age, grade);
            return;
        }

        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        StudentNode current = head;

        for (int i = 1; i < position - 1; i++) {
            if (current == null) {
                System.out.println("Position out of bounds.");
                return;
            }
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Delete by Roll Number
    public void deleteByRollNo(int rollNo) {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }

        if (head.rollNo == rollNo) {
            head = head.next;
            System.out.println("Deleted student with roll number " + rollNo);
            return;
        }

        StudentNode current = head;
        while (current.next != null && current.next.rollNo != rollNo) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Deleted student with roll number " + rollNo);
        } else {
            System.out.println("Student with roll number " + rollNo + " not found.");
        }
    }

    // Search by Roll Number
    public StudentNode searchByRollNo(int rollNo) {
        StudentNode current = head;
        while (current != null) {
            if (current.rollNo == rollNo) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Update Grade
    public void updateGrade(int rollNo, String newGrade) {
        StudentNode student = searchByRollNo(rollNo);
        if (student != null) {
            student.grade = newGrade;
            System.out.println("Updated grade for roll number " + rollNo + " to " + newGrade);
        } else {
            System.out.println("Student with roll number " + rollNo + " not found.");
        }
    }

    // Display all student records
    public void displayAll() {
        if (isEmpty()) {
            System.out.println("No student records to display.");
            return;
        }

        StudentNode current = head;
        System.out.println("Student Records:");
        while (current != null) {
            System.out.println("Roll No: " + current.rollNo +
                               ", Name: " + current.name +
                               ", Age: " + current.age +
                               ", Grade: " + current.grade);
            current = current.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        list.addAtEnd(101, "Alice", 20, "A");
        list.addAtBeginning(102, "Bob", 21, "B");
        list.addAtPosition(2, 103, "Charlie", 22, "C");

        list.displayAll();

        list.updateGrade(103, "A+");
        list.deleteByRollNo(101);

        list.displayAll();
    }
}
