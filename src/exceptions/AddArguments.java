package exceptions;

public class AddArguments {
    public static void main(String[] args) {
        add("1", "two", "2", "3");
    }

    //varargs
    public static void add(String... args) {
        try {
            int sum = 0;
            for (String arg : args) {
                sum += Integer.parseInt(arg);
            }
            System.out.println("Shuma = " + sum);
        } catch (NumberFormatException ex) {
            System.out.println("Keni dhene argument jo-numer!");
        }
    }
}
