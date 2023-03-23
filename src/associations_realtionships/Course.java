package associations_realtionships;

public class Course {
    private final long ID;
    private String name;
    private static final int MAX_STUDENTS = 100;
    private Student[] enrolledStudents;
    private int numStudents;

    public Course(long ID, String name) {
        this.ID = ID;
        this.name = name;
        this.enrolledStudents = new Student[MAX_STUDENTS];
    }

    public void enrollStudent(Student student) {
        if (student != null && numStudents < MAX_STUDENTS) {
            enrolledStudents[numStudents++] = student;
        }
    }

    public void printStudentList() {
        System.out.printf("Total students in %s registered: %d%n", name, numStudents);
        for (Student student : enrolledStudents) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }
}








