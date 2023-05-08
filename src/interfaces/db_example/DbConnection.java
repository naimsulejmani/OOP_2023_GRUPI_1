package interfaces.db_example;

import interfaces.db_example.exceptions.SQLException;

import java.util.List;
import java.util.Objects;

public interface DbConnection {
    DbConnection connect(String url) throws SQLException;

    DbConnection connect() throws SQLException;

    void disconnect() throws SQLException;

    void close() throws SQLException;

    void execute(String query) throws SQLException;

    List<Objects> executeReader(String query) throws SQLException;

}









