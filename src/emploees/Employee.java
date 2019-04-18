package emploees;

public abstract class Employee implements Payable {
    public static double AvgSalary;
    public static double getAvgSalary;
    public int sum;
    String format = "%.2f";
    private String employeeId;
    private String name;
    private double fixedMonthlyPayment;
    private String socialSecurityNumber;
    // public static double count;

    // TODO fix class declaration and declare variables here

    public Employee(String employeeId, String name) {
        // TODO fill in code here
        this.employeeId = employeeId;
        this.name = name;
        //  count++;
    }

    public Employee() {

    }

    public Employee(String employeeId, String name, String socialSecurityNumber) {
        this.employeeId = employeeId;
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getEmployeeId() {
        // TODO fill in code here and replace the return statement
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        // TODO fill in code here
        this.employeeId = employeeId;
    }

    public String getName() {
        // TODO fill in code here and replace the return statement
        return name;
    }

    public void setName(String name) {
        // TODO fill in code here
        this.name = name;
    }

    public double getAverageMonthlySalary() {
        // TODO fill in code here and replace the return statement

        return AvgSalary;
    }

    @Override
    public String toString() {
        // TODO fill in code here and replace the return statement, be sure to format double value
        String s = String.format(format, this.getAverageMonthlySalary());
        return "Employee [Name = " + getName() + ", employee ID  " + this.getEmployeeId() + " Average Salary " + s + "]";
    }
}
