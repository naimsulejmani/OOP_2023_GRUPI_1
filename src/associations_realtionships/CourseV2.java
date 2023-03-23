package associations_realtionships;

import java.util.ArrayList;

public class CourseV2 {
    private static int generateId = 0;
    private final int ID;
    private String name;
    private ArrayList<Student> enrolledStudents;
    private static final int MAX_STUDENTS = 100;

    public CourseV2(String name) {
        this.ID = ++generateId;
        this.name = name;
        enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        if (student != null && enrolledStudents.size() < MAX_STUDENTS) {
            enrolledStudents.add(student);
        }
    }

    public void printStudentList() {
        System.out.printf("Totali i studenteve ne lenden %d-%s te regjistuar eshte: %d%n",
                ID, name, enrolledStudents.size());
        for (Student student : enrolledStudents) {
            System.out.println(student);
        }
    }
}







