package inheritance.payroll_app;

public class Programmer extends SalariedEmployee{
    public Programmer(int id, String name, String surname, float salary, float bonus) {
        super(id, name, surname, salary, bonus);
    }

    public Programmer(int id, String name, String surname, float salary) {
        super(id, name, surname, salary);
    }

    @Override
    public String toString() {
        return "Titulli: Programmer \n" + super.toString();
    }
}
