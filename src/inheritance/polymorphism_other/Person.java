package inheritance.polymorphism_other;

public class Person {
    private int id;
    private final int ID;
    private static final String NAME;

    static  {
        NAME = "NAIM";
    }

    {
        ID=1;
    }
    public Person(final int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public final void setId(final int id) {
        this.id = id;
    }
}






