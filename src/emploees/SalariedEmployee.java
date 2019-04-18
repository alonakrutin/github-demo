package emploees;

public class SalariedEmployee extends Employee {
    public static double AvgSalary;
    // TODO fix class declaration and declare variables here
    public String employeeId;
    public String name;
    public String socialSecurityNumber;
    public double fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
        // TODO fill in code here
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public SalariedEmployee(String employeeId, String name) {
        super(employeeId, name);
    }

    public String getSocialSecurityNumber() {
        // TODO fill in code here and replace the return statement
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        // TODO fill in code here
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getFixedMonthlyPayment() {
        // TODO fill in code here and replace the return statement
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        // TODO fill in code here
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public void calculatePay() {
        AvgSalary = this.fixedMonthlyPayment;
        System.out.println(AvgSalary);
    }

    public double getAverageMonthlySalary() {
        // TODO fill in code here and replace the return statement
        return AvgSalary;
    }

    // TODO fill in code here

}

