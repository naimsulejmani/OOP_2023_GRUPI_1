package interfaces.db_example.drivers;

import interfaces.db_example.DbConnection;
import interfaces.db_example.exceptions.SQLException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MssqlDbConnection implements DbConnection {
    private String url;

    public MssqlDbConnection(String url) throws SQLException {
        setUrl(url);
    }

    public MssqlDbConnection() {
    }

    private void setUrl(String url) throws SQLException {
        if (url.split(";").length < 4) {
            throw new SQLException("Url is not correct!");
        }
        this.url = url;
    }

    @Override
    public DbConnection connect(String url) throws SQLException {
        setUrl(url);
        System.out.println("Connection was successfully made");
        return this;
    }

    @Override
    public DbConnection connect() throws SQLException {
        if (this.url == null || this.url.equals(""))
            throw new SQLException("Url is not provided!");
        System.out.println("Connection successfully made");
        return this;
    }

    @Override
    public void disconnect() throws SQLException {
        if (this.url == null || this.url.equals(""))
            throw new SQLException("Cannot disconnect not connected!");
        System.out.println("Disconnected...");
    }

    @Override
    public void close() throws SQLException {
        System.out.println("Successfully closed!");
    }

    @Override
    public void execute(String query) throws SQLException {
        if (query.toLowerCase().startsWith("insert") || query.toLowerCase().startsWith("update") ||
                query.toLowerCase().startsWith("delete")) {
            //DDL(CREATE, ALTER, DROP, TRUNCATE) + DML (INSERT, UPDATE, DELETE) + EXECUTE
            System.out.println(query);
            System.out.println("1 row affected!");
        } else throw new SQLException("Cannot execute the following query command!");
    }

    @Override
    public List<Objects> executeReader(String query) throws SQLException {
        if (query.toLowerCase().startsWith("select"))
            return new ArrayList<>();
        else
            throw new SQLException("Cannot query the follwoing table!");
    }
}
