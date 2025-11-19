package id28418.q6;

public class Department extends Organization {
    private String deptName;
    private String deptCode; // >=3 chars
    private String managerName;

    public Department(int id, String createdDate, String updatedDate,
                      String orgName, String orgCode, String rssbNumber, String contactEmail,
                      String deptName, String deptCode, String managerName)
            throws RSSBDataException {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail);
        if (deptName == null || deptName.isEmpty()) throw new RSSBDataException("deptName required");
        if (deptCode == null || deptCode.length() < 3) throw new RSSBDataException("deptCode min 3 chars");
        if (managerName == null || managerName.isEmpty()) throw new RSSBDataException("managerName required");

        this.deptName = deptName;
        this.deptCode = deptCode;
        this.managerName = managerName;
    }
}