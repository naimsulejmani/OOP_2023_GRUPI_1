package inheritance.payroll_app;

import java.time.LocalDate;

public class Paycheck {
    private int month;
    private int year;

    private Employee employee;
    private LocalDate date;

    public Paycheck(int month, int year, Employee employee) {
        this.month = month;
        this.year = year;
        this.employee = employee;
        date = LocalDate.now();
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        String result = "-----------------------------\n";
        result += "Pay slip per perioden "
                + String.format("%d/%d %n", month, year) ;
        result += "Leshuar me: " + date + " \n";
        result += "-----------------------------\n";
        result += employee;
        result += "\n-----------------------------\n";
        return result;
    }
}
