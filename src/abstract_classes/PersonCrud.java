package abstract_classes;

public abstract class PersonCrud {
    private int id;

    public PersonCrud(int id) {
        this.id = id;
    }

    public abstract void create(String name);

    public abstract String read(int id);

    public abstract void update(int id, String name);

    public abstract void delete(int id);

    public void print() {
        System.out.println("Hello I am print method on Abstract Class PersonCrud!");
    }
}
