package inheritance.polymorphism_other;

import associations_realtionships.PersonTest;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3, 4, 5, 6, 7, 9));
        System.out.println(add(10, -1, 10));
        System.out.println(add());
        int shuma = sum((byte) 3, (byte) 4);
    }
    public static int sum(byte a, byte b) {
        return a + b;
    }

    public static int sum(byte a, int b) {
        return a + b;
    }
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}









