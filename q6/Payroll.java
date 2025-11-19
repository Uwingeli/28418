package id28418.q6;

public class Payroll extends Allowance {
    private double grossSalary;
    private double totalDeductions;
    private double netSalary;

    public Payroll(int id, String createdDate, String updatedDate,
                   String orgName, String orgCode, String rssbNumber, String contactEmail,
                   String deptName, String deptCode, String managerName,
                   int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                   int month, int year, String startDate, String endDate,
                   double basicPay, double transportAllowance, double housingAllowance,
                   double rssbContribution, double payeTax, double loanDeduction,
                   double overtimeHours, double overtimeRate, double bonus)
            throws RSSBDataException {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
              employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate,
              basicPay, transportAllowance, housingAllowance, rssbContribution, payeTax, loanDeduction,
              overtimeHours, overtimeRate, bonus);

        this.grossSalary = getGrossSalary() + getOvertimePay() + bonus;
        this.totalDeductions = getTotalDeductions();
        this.netSalary = grossSalary - totalDeductions;

        if (netSalary < 0) throw new RSSBDataException("netSalary cannot be negative");
    }

    public double getNetSalary() { return netSalary; }
    public double getGrossSalaryValue() { return grossSalary; }
    public double getTotalDeductionsValue() { return totalDeductions; }
}