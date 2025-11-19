package id28418.q6;

public final class Payslip extends Payroll {
    private String payslipNumber;
    private String issueDate;

    public Payslip(int id, String createdDate, String updatedDate,
                   String orgName, String orgCode, String rssbNumber, String contactEmail,
                   String deptName, String deptCode, String managerName,
                   int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                   int month, int year, String startDate, String endDate,
                   double basicPay, double transportAllowance, double housingAllowance,
                   double rssbContribution, double payeTax, double loanDeduction,
                   double overtimeHours, double overtimeRate, double bonus,
                   String payslipNumber, String issueDate)
            throws RSSBDataException {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
              employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate,
              basicPay, transportAllowance, housingAllowance, rssbContribution, payeTax, loanDeduction,
              overtimeHours, overtimeRate, bonus);
        if (payslipNumber == null || payslipNumber.isEmpty()) throw new RSSBDataException("payslipNumber required");
        if (issueDate == null || issueDate.isEmpty()) throw new RSSBDataException("issueDate required");

        this.payslipNumber = payslipNumber;
        this.issueDate = issueDate;
    }

    public void generatePayslip() {
        System.out.println("=== PAYSLIP === 28418");
        System.out.println("Payslip No: " + payslipNumber + " 28418");
        System.out.println("Issue Date: " + issueDate + " 28418");
        System.out.println("Gross Salary: " + getGrossSalaryValue() + " 28418");
        System.out.println("Total Deductions: " + getTotalDeductionsValue() + " 28418");
        System.out.println("Net Salary: " + getNetSalary() + " 28418");
    }
}
