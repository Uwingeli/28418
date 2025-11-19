package id28418.q6;

public class SalaryStructure extends PayrollPeriod {
    private double basicPay; // >=0
    private double transportAllowance; // >=0
    private double housingAllowance; // >=0

    public SalaryStructure(int id, String createdDate, String updatedDate,
                           String orgName, String orgCode, String rssbNumber, String contactEmail,
                           String deptName, String deptCode, String managerName,
                           int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                           int month, int year, String startDate, String endDate,
                           double basicPay, double transportAllowance, double housingAllowance)
            throws RSSBDataException {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
              employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate);
        if (basicPay < 0) throw new RSSBDataException("basicPay must be >=0");
        if (transportAllowance < 0) throw new RSSBDataException("transportAllowance must be >=0");
        if (housingAllowance < 0) throw new RSSBDataException("housingAllowance must be >=0");

        this.basicPay = basicPay;
        this.transportAllowance = transportAllowance;
        this.housingAllowance = housingAllowance;
    }

    public double getGrossSalary() {
        return basicPay + transportAllowance + housingAllowance;
    }
}