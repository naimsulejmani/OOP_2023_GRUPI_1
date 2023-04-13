package inheritance.payroll_app;

public class Employee {

    private final float MIN_SALARY = 250f;
    private final int id;
    private String name;
    private String surname;


    public Employee(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float pay() {
        return MIN_SALARY;
    }

    @Override
    public String toString() {
        return String.format("%d - %s %s ", id, name, surname);
    }
}
