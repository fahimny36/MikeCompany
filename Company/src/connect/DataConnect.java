package connect;

import dto.DepartmentTableCreator;
import dto.EmployeeTableCreator;
import dto.SalaryConstraintAdder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


class DataConnect {

    public static void main(String[] args) {
        // Database connection parameters
        String jdbcUrl = "jdbc:mysql://localhost:3306/Company";
        String username = "root";
        String password = "Fahim5938";


        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish database connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Create Department table
            DepartmentTableCreator.createDepartmentTable(connection);

            // Create Employee table
            EmployeeTableCreator.createEmployeeTable(connection);

            // Add salary constraint
            SalaryConstraintAdder.addSalaryConstraint(connection);

            // Close the connection
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

