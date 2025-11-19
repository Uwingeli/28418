package id28418.q6;

public class Deduction extends SalaryStructure {
    private double rssbContribution; // >=0
    private double payeTax; // >=0
    private double loanDeduction; // >=0

    public Deduction(int id, String createdDate, String updatedDate,
                     String orgName, String orgCode, String rssbNumber, String contactEmail,
                     String deptName, String deptCode, String managerName,
                     int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                     int month, int year, String startDate, String endDate,
                     double basicPay, double transportAllowance, double housingAllowance,
                     double rssbContribution, double payeTax, double loanDeduction)
            throws RSSBDataException {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
              employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate,
              basicPay, transportAllowance, housingAllowance);
        if (rssbContribution < 0) throw new RSSBDataException("rssbContribution must be >=0");
        if (payeTax < 0) throw new RSSBDataException("payeTax must be >=0");
        if (loanDeduction < 0) throw new RSSBDataException("loanDeduction must be >=0");

        this.rssbContribution = rssbContribution;
        this.payeTax = payeTax;
        this.loanDeduction = loanDeduction;
    }

    public double getTotalDeductions() {
        return rssbContribution + payeTax + loanDeduction;
    }
}
