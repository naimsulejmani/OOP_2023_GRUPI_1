package inheritance.payroll_app;

public class Manager extends SalariedEmployee{

    public Manager(int id, String name, String surname, float salary, float bonus) {
        super(id, name, surname, salary, bonus);
    }

    public Manager(int id, String name, String surname, float salary) {
        super(id, name, surname, salary);
    }

    @Override
    public String toString() {
        return "Titulli: Menaxher \n" + super.toString();
    }
}
