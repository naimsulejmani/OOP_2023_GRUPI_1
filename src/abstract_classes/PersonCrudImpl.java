package abstract_classes;

public class PersonCrudImpl extends PersonCrud{
    public PersonCrudImpl(int id) {
        super(id);
    }

    @Override
    public void create(String name) {

    }

    @Override
    public String read(int id) {
        return null;
    }

    @Override
    public void update(int id, String name) {

    }

    @Override
    public void delete(int id) {

    }
}
