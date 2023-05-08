package interfaces;

public class Person implements Comparable<Person> {
    private int id;
    private String name;

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
