package associations_realtionships;

public class CourseTest {
    public static void main(String[] args) {
        Course oop = new Course(1, "Object Oriented Programming");
        Student erblini = new Student(1, "Erlbin", "Spedikushi");
        Student edipi = new Student(2, "Edip", "Edipi");
        Student filan = new Student(3, "Filan", "Fisteku");
        oop.enrollStudent(erblini);
        oop.enrollStudent(edipi);
        oop.enrollStudent(filan);
        oop.printStudentList();
        System.out.println("VERZIONI I DYTE");
        System.out.println("-------------------------------------");
        CourseV2 etika = new CourseV2("ETIKA NE BIZNES");
        CourseV2 asdha = new CourseV2("Algoritmet");
        CourseV2 db = new CourseV2("Baza e te dhenave");
        db.enrollStudent(edipi);
        db.enrollStudent(filan);
        db.printStudentList();
        etika.printStudentList();
        asdha.printStudentList();
    }
}







