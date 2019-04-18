package emploees;

public class EmployeeMain {
    public static void main(String[] args) {
        SalariedEmployee employee1 = new SalariedEmployee("1", "Ivanov", "S1");
        System.out.println(employee1.getSocialSecurityNumber());
        employee1.setFixedMonthlyPayment(1000);
        employee1.calculatePay();
        System.out.println("Salary " + employee1.getAverageMonthlySalary());
        System.out.println(employee1.toString());

        ContractedEmployee employee2 = new ContractedEmployee("2", "Sidorov", "Tax1");
        System.out.println(employee2.getFederalTaxId());
        employee2.setHourlyRate(1.5);
        employee2.setNumberOfHoursWorked(20);
        employee2.calculatePay();

        System.out.println("Salary " + employee2.getAverageMonthlySalary());
        System.out.println(employee2.toString());
    }
}