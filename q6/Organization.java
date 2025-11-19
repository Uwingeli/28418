package id28418.q6;

public class Organization extends Entity {
    private String orgName;
    private String orgCode; // >=3 chars
    private String rssbNumber; // exactly 8 digits
    private String contactEmail;

    public Organization(int id, String createdDate, String updatedDate,
                       String orgName, String orgCode, String rssbNumber, String contactEmail)
            throws RSSBDataException {
        super(id, createdDate, updatedDate);
        if (orgName == null || orgName.isEmpty()) throw new RSSBDataException("orgName required");
        if (orgCode == null || orgCode.length() < 3) throw new RSSBDataException("orgCode min 3 chars");
        if (rssbNumber == null || rssbNumber.length() != 8) throw new RSSBDataException("rssbNumber must be 8 digits");
        if (!isValidEmail(contactEmail)) throw new RSSBDataException("invalid email");

        this.orgName = orgName;
        this.orgCode = orgCode;
        this.rssbNumber = rssbNumber;
        this.contactEmail = contactEmail;
    }

    private boolean isValidEmail(String e) {
        return e != null && e.contains("@") && e.contains(".");
    }
}
