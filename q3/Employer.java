package id28418.q3;

public class Employer extends Taxpayer {
    private String employerName;
    private String employerTIN; // 9 digits
    private String contact; // 10-digit phone

    public Employer(int id, String createdDate, String updatedDate,
                    String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address,
                    String employerName, String employerTIN, String contact) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address);
        if (employerTIN == null || employerTIN.length() != 9) throw new TaxDataException("employer TIN must be 9 digits");
        if (contact == null || contact.length() != 10) throw new TaxDataException("contact phone must be 10 digits");
        this.employerName = employerName;
        this.employerTIN = employerTIN;
        this.contact = contact;
    }

    public String getEmployerName() { return employerName; }
}
