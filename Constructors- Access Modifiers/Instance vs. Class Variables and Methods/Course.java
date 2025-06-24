import java.util.Scanner;

public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "Tech Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration +
                " weeks, Fee: Rs." + fee + ", Institute: " + instituteName);
    }

    public static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter institute name: ");
        String inst = sc.nextLine();
        updateInstituteName(inst);

        System.out.print("How many courses? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details for Course " + i + ":");
            System.out.print("Course Name: ");
            String name = sc.nextLine();
            System.out.print("Duration (weeks): ");
            int duration = sc.nextInt();
            System.out.print("Fee: ");
            double fee = sc.nextDouble();
            sc.nextLine();

            Course c = new Course(name, duration, fee);
            c.displayCourseDetails();
        }
    }
}
