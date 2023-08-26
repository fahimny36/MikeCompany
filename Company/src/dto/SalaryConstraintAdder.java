package dto;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SalaryConstraintAdder {
    public static void addSalaryConstraint(Connection connection) throws SQLException {
        String addSalaryConstraintSQL = "ALTER TABLE Employee " +
                "ADD CHECK (Employee_Salary BETWEEN 1000 AND 1000000)";
        executeStatement(connection, addSalaryConstraintSQL);
    }

    private static void executeStatement(Connection connection, String sql) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
        }
    }
}
