package jdbc_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        String connectionString =
                "jdbc:sqlserver://127.0.0.1:1433;encrypt=false;databaseName=Northwind;username=sa;password=yourStrong(!)Password;";

        try {
            Connection connection = DriverManager.getConnection(connectionString);
            System.out.println("Connection successfully!");
            connection.close();
            System.out.println("Connection closed!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
