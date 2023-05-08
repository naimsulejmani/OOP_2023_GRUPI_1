package interfaces.db_example;

import interfaces.db_example.drivers.MssqlDbConnection;
import interfaces.db_example.drivers.MysqlDbConnection;
import interfaces.db_example.drivers.OracleDbConnection;
import interfaces.db_example.exceptions.SQLException;

public class Main {
    private static DbConnection connection = null;

    // {"mysql","Server=myServerAddress;Database=myDataBase;Uid=myUsername;Pwd=myPassword;}
    public static void main(String[] args) throws SQLException {
        args = new String[]
                {"mssql", "Server=myServerAddress;Database=myDataBase;Uid=myUsername;Pwd=myPassword"};

        if (args.length == 2) {
            switch (args[0]) {
                case "mssql" -> connection = new MssqlDbConnection(args[1]);
                case "mysql" -> connection = new MysqlDbConnection(args[1]);
                case "orcale" -> connection = new OracleDbConnection();
                default -> connection = new MysqlDbConnection(args[1]);
            }
        }

        connection.connect();
        connection.execute("INSERT INTO tblUser values(1,'naim')");
        var reader = connection.executeReader("SELECT * FROM tblTest");


    }
}
