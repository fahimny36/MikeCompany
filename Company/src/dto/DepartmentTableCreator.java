package dto;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DepartmentTableCreator {
    public static void createDepartmentTable(Connection connection) throws SQLException {
        String createDepartmentTableSQL = "CREATE TABLE Department (" +
                "Department_ID INT PRIMARY KEY," +
                "Department_Name VARCHAR(255)," +
                "Department_Head VARCHAR(255)," +
                "Department_Description VARCHAR(255))";
        executeStatement(connection, createDepartmentTableSQL);
    }

    private static void executeStatement(Connection connection, String sql) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
        }
    }
}
