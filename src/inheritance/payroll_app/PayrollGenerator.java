package inheritance.payroll_app;

import java.util.ArrayList;

public class PayrollGenerator {
    public static void main(String[] args) {
        String fileText = "1,Naim,Sulejmani,programer,2022,1,500,0;" +
                "2,Filan,Fisteku,manager,2022,1,450,10;" +
                "3,Aldi,Krasniqi,consulent,2022,1,90,20;";

        ArrayList<Employee> employees = new ArrayList<>();

        String[] empString = fileText.split(";");

        for (String employeeStr : empString){
            String[] attributes = employeeStr.split(",");
            int id = Integer.parseInt(attributes[0]);
            String name = attributes[1];
            String surname = attributes[2];
            String title = attributes[3].toLowerCase();


            switch (title) {

            }
        }
    }
}









