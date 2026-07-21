import java.util.ArrayList;

public class GradeManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!");
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }
        System.out.println("\n--- Student List ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void searchStudent(int rollNo) {
        for (Student s : students) {
            if (s.getRollNo() == rollNo) {
                System.out.println("\nStudent Found: " + s);
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public double getAverageMarks() {
        if (students.isEmpty()) return 0;
        double total = 0;
        for (Student s : students) {
            total += s.getMarks();
        }
        return total / students.size();
    }
}
