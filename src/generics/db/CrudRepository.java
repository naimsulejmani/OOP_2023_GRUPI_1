package generics.db;

import java.util.List;

public interface CrudRepository<T, Tid> {
    void add(T item);

    void modify(Tid id, T item);

    void remove(Tid id);

    List<T> findAll();

    T findById(Tid id);

}
