package db_project.infrastructure;

public interface CrudRepository<T, Tid>
        extends ReadableRepository<T, Tid>, WriteableRepository<T, Tid> {
}
