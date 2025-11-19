package id28418.q6;

public class PayrollPeriod extends Employee {
    private int month; // 1-12
    private int year; // >=2000
    private String startDate;
    private String endDate;

    public PayrollPeriod(int id, String createdDate, String updatedDate,
                         String orgName, String orgCode, String rssbNumber, String contactEmail,
                         String deptName, String deptCode, String managerName,
                         int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                         int month, int year, String startDate, String endDate)
            throws RSSBDataException {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
              employeeID, fullName, position, baseSalary, rssbRegistered);
        if (month < 1 || month > 12) throw new RSSBDataException("month must be 1-12");
        if (year < 2000) throw new RSSBDataException("year must be >=2000");
        if (startDate == null || startDate.isEmpty()) throw new RSSBDataException("startDate required");
        if (endDate == null || endDate.isEmpty()) throw new RSSBDataException("endDate required");

        this.month = month;
        this.year = year;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}