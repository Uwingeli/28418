package id28418.q6;

public class Allowance extends Deduction {
    private double overtimeHours; // >=0
    private double overtimeRate; // >=0
    private double bonus; // >=0

    public Allowance(int id, String createdDate, String updatedDate,
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
              basicPay, transportAllowance, housingAllowance, rssbContribution, payeTax, loanDeduction);
        if (overtimeHours < 0) throw new RSSBDataException("overtimeHours must be >=0");
        if (overtimeRate < 0) throw new RSSBDataException("overtimeRate must be >=0");
        if (bonus < 0) throw new RSSBDataException("bonus must be >=0");

        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
        this.bonus = bonus;
    }

    public double getOvertimePay() {
        return overtimeHours * overtimeRate;
    }
}