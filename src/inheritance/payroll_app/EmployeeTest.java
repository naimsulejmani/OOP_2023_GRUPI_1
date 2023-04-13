package inheritance.payroll_app;

public class EmployeeTest {
    public static void main(String[] args) {
        SalariedEmployee s1 = new SalariedEmployee(1,"Aldi","Krasniqi",
                1000,0);

        System.out.println(s1);
        System.out.println("-----------------------");
        HourlyEmployee e1 = new HourlyEmployee(2,"Elton","Kaqiu",90,20);
        System.out.println(e1);

        Paycheck p1 = new Paycheck(1, 2023, e1);
        System.out.println(p1);
}    } //2 sendwicha mix per rikin
    //  2 sendwicha mix per gazin






