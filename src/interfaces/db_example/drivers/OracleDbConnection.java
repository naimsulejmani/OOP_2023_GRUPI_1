package interfaces.db_example.drivers;

import interfaces.db_example.DbConnection;
import interfaces.db_example.exceptions.SQLException;

import java.util.List;
import java.util.Objects;

public class OracleDbConnection implements DbConnection {
    @Override
    public DbConnection connect(String url) throws SQLException {
        return null;
    }

    @Override
    public DbConnection connect() throws SQLException {
        return null;
    }

    @Override
    public void disconnect() throws SQLException {

    }

    @Override
    public void close() throws SQLException {

    }

    @Override
    public void execute(String query) throws SQLException {

    }

    @Override
    public List<Objects> executeReader(String query) throws SQLException {
        return null;
    }
}
