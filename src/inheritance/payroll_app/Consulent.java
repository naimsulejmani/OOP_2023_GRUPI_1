package inheritance.payroll_app;

public class Consulent extends HourlyEmployee{
    public Consulent(int id, String name, String surname, int hours, float hourlyWage) {
        super(id, name, surname, hours, hourlyWage);
    }

    @Override
    public String toString() {
        return "Titulli: Konsulent \n" + super.toString();
    }
}
