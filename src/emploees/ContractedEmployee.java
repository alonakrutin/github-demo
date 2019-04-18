package emploees;

public class ContractedEmployee extends Employee {
    private String federalTaxId;
    private double hourlyRate;
    private double numberOfHoursWorked;
    private double AvgSalary;

    // TODO fix class declaration and declare variables here


    public ContractedEmployee(String employeeId, String name, String federalTaxId) {
        super(employeeId, name, federalTaxId);
        this.federalTaxId = federalTaxId;
        // count++;
        // TODO fill in code here
    }

    public ContractedEmployee(double numberOfHoursWorked, double hourlyRate) {
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public String getFederalTaxId() {
        // TODO fill in code here and replace the return statement
        return federalTaxId;
    }

    public void setFederalTaxId(String federalTaxId) {
        this.federalTaxId = federalTaxId;
        // TODO fill in code here
    }

    public double getHourlyRate() {
        // TODO fill in code here and replace the return statement
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        // TODO fill in code here
        this.hourlyRate = hourlyRate;
    }

    public double getNumberOfHoursWorked() {
        // TODO fill in code here and replace the return statement

        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
        // TODO fill in code here
    }

    @Override
    public void calculatePay() {
        this.AvgSalary = this.hourlyRate * this.numberOfHoursWorked;
        System.out.println(AvgSalary);
    }

    public double getAverageMonthlySalary() {
        // TODO fill in code here and replace the return statement
        return this.AvgSalary;
    }

    // TODO fill in code here
}
