package dto;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeTableCreator {
    public static void createEmployeeTable(Connection connection) throws SQLException {
        String createEmployeeTableSQL = "CREATE TABLE Employee (" +
                "Employee_Id INT PRIMARY KEY," +
                "Employee_Name VARCHAR(255)," +
                "Employee_Address VARCHAR(255)," +
                "Employee_Salary DECIMAL(10, 2)," +
                "Employee_Contact_No VARCHAR(20)," +
                "Department_Id INT," +
                "FOREIGN KEY (Department_Id) REFERENCES Department(Department_ID))";
        executeStatement(connection, createEmployeeTableSQL);
    }

    private static void executeStatement(Connection connection, String sql) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
        }
    }
}

