package db_project.infrastructure;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ToObjectAble<T> {
    T toObject(ResultSet resultSet) throws SQLException;
}
