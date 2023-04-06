package inheritance;

import java.time.LocalDate;
import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student(
                "Edip", "Mripa", LocalDate.of(2000, 1, 1),
                'M', "K/shqiptar", 1, "2022/23",
                "programmim", "Cacttus Education"
        );
        System.out.println(student.getName());
        System.out.println(student.getCollege());
        System.out.println(student);

        StudentTest st = new StudentTest();
        System.out.println(st);

        ArrayList lista = new ArrayList();

    }
}













