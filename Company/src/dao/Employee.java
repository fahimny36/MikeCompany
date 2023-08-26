package dao;

public class Employee {
    private int employeeId;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeContactNo() {
        return employeeContactNo;
    }

    public void setEmployeeContactNo(String employeeContactNo) {
        this.employeeContactNo = employeeContactNo;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    private String employeeName;
    private String employeeAddress;
    private double employeeSalary;
    private String employeeContactNo;
    private int departmentId;

    // Constructors, getters, setters
}
