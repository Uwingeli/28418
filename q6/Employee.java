package id28418.q6;
public class Employee extends Department {
    private int employeeID; // >=1000
    private String fullName;
    private String position;
    private double baseSalary; // >0
    private boolean rssbRegistered;

    public Employee(int id, String createdDate, String updatedDate,
                   String orgName, String orgCode, String rssbNumber, String contactEmail,
                   String deptName, String deptCode, String managerName,
                   int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered)
            throws RSSBDataException {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName);
        if (employeeID < 1000) throw new RSSBDataException("employeeID must be >=1000");
        if (fullName == null || fullName.isEmpty()) throw new RSSBDataException("fullName required");
        if (position == null || position.isEmpty()) throw new RSSBDataException("position required");
        if (baseSalary <= 0) throw new RSSBDataException("baseSalary must be >0");

        this.employeeID = employeeID;
        this.fullName = fullName;
        this.position = position;
        this.baseSalary = baseSalary;
        this.rssbRegistered = rssbRegistered;
    }

    public double getBaseSalary() { return baseSalary; }
}