import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeManager manager = new GradeManager();
        int choice;

        do {
            System.out.println("\n===== Student Grade Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by RollNo");
            System.out.println("4. Show Average Marks");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();
                    manager.addStudent(new Student(name, roll, marks));
                    break;
                case 2:
                    manager.displayAllStudents();
                    break;
                case 3:
                    System.out.print("Enter Roll No to search: ");
                    int r = sc.nextInt();
                    manager.searchStudent(r);
                    break;
                case 4:
                    System.out.println("Average Marks: " + manager.getAverageMarks());
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
        sc.close();
    }
}
