package id28418.q3;

public class TaxAuthority extends Entity {
    private String authorityName;
    private String region;
    private String email;

    public TaxAuthority(int id, String createdDate, String updatedDate,
                        String authorityName, String region, String email) throws TaxDataException {
        super(id, createdDate, updatedDate);
        if (authorityName == null || authorityName.isEmpty()) throw new TaxDataException("authorityName required");
        if (region == null || region.isEmpty()) throw new TaxDataException("region required");
        if (!isValidEmail(email)) throw new TaxDataException("invalid email");
        this.authorityName = authorityName;
        this.region = region;
        this.email = email;
    }

    private boolean isValidEmail(String e) {
        return e != null && e.contains("@") && e.contains(".");
    }

    public String getAuthorityName() { return authorityName; }
}
