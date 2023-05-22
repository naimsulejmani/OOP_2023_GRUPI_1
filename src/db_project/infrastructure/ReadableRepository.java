package db_project.infrastructure;

import java.util.List;

public interface ReadableRepository<T, Tid> {
    T findById(Tid id);

    List<T> findAll();
}
