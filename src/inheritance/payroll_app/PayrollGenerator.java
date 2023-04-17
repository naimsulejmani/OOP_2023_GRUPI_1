package inheritance.payroll_app;

import java.util.ArrayList;

public class PayrollGenerator {
    public static void main(String[] args) {
        String fileText = "1,Naim,Sulejmani,programer,2022,1,500,0;" +
                "2,Filan,Fisteku,manager,2022,1,450,10;" +
                "3,Aldi,Krasniqi,consulent,2022,1,90,20;";


        String[] employeeStrings = fileText.split(";");

        ArrayList<Paycheck> paychecks = new ArrayList<>();

        for (String employeeStr : employeeStrings) {
            String[] employeeAttrs = employeeStr.split(","); // ["1","Naim","Sulejmani",...]
            int id = Integer.parseInt(employeeAttrs[0]);
            String name = employeeAttrs[1];
            String surname = employeeAttrs[2];
            String title = employeeAttrs[3].toLowerCase();
            int year = Integer.parseInt(employeeAttrs[4]);
            int month = Integer.parseInt(employeeAttrs[5]);

            float salaryOrHours = Float.parseFloat(employeeAttrs[6]);
            float bonusOrHourlyWage = Float.parseFloat(employeeAttrs[7]);

            Employee employee;

            switch (title) {
                case "programer" -> {
                    employee = new Programmer(id, name, surname, salaryOrHours, bonusOrHourlyWage);
                }
                case "manager" -> {
                    employee = new Manager(id, name, surname, salaryOrHours, bonusOrHourlyWage);
                }
                case "consulent" -> {
                    employee = new Consulent(id, name, surname, (int) salaryOrHours, bonusOrHourlyWage);
                }
                default -> employee = null;
            }

            if (employee != null) {
                Paycheck paycheck = new Paycheck(month, year, employee);
                paychecks.add(paycheck);
            }

        }

        for (Paycheck paycheck : paychecks) {
            System.out.println(paycheck);
        }


//        ArrayList<Employee> employees = new ArrayList<>();
//        ArrayList<Paycheck> paychecks = new ArrayList<>();
//
//        String[] empString = fileText.split(";");
//
//        for (String employeeStr : empString) {
//            String[] attributes = employeeStr.split(",");
//            int id = Integer.parseInt(attributes[0]);
//            String name = attributes[1];
//            String surname = attributes[2];
//            String title = attributes[3].toLowerCase();
//            int year = Integer.parseInt(attributes[4]);
//            int month = Integer.parseInt(attributes[5]);
//
//            switch (title) {
//                case "programer", "manager" -> {
//                    float salary = Float.parseFloat(attributes[6]);
//                    float bonus = Float.parseFloat(attributes[7]);
//
//                    Employee e = title.equals("programer") ?
//                            new Programmer(id, name, surname, salary, bonus) :
//                            new Manager(id, name, surname, salary, bonus);
//
//                    paychecks.add(new Paycheck(month, year, e));
//                }
//                case "consulent" -> {
//                    int hours = Integer.parseInt(attributes[6]);
//                    float hourlyWage = Float.parseFloat(attributes[7]);
//
//                    Employee e = new Consulent(id, name, surname, hours, hourlyWage);
//
//                    employees.add(e);
//
//                    paychecks.add(new Paycheck(month, year, e));
//                }
//            }
//        }
//
//        for (Paycheck paycheck : paychecks) {
//            //email send ose printer print ne jeten reale
//            System.out.println(paycheck);
//        }

    }
}


















