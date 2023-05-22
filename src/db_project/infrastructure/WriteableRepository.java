package db_project.infrastructure;

public interface WriteableRepository<T, Tid> {
    void add(T model);

    void modify(Tid id, T model);

    void remove(Tid id);
}
