package exceptions;

public class AddArguments1 {
    public static void main(String[] args) {

        add("1", "two", "2", "3");
    }

    //varargs
    public static void add(String... args) {
        int sum = 0;
        for (String arg : args) {
            try {
                sum += Integer.parseInt(arg);
            } catch (NumberFormatException ex) {
                System.out.println(arg + " is not a number!");
            }
        }
        System.out.println("Shuma = " + sum);
    }
}
