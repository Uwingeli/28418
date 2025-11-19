package id28418.q3;

public class TaxCategory extends TaxAuthority {
    private String categoryName;
    private double rate;
    private String code;

    public TaxCategory(int id, String createdDate, String updatedDate,
                       String authorityName, String region, String email,
                       String categoryName, double rate, String code) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email);
        if (categoryName == null || categoryName.isEmpty()) throw new TaxDataException("categoryName required");
        if (rate <= 0) throw new TaxDataException("rate must be > 0");
        if (code == null || code.length() < 3) throw new TaxDataException("code must be >= 3 chars");
        this.categoryName = categoryName;
        this.rate = rate;
        this.code = code;
    }

    public double getRate() { return rate; }
    public String getCode() { return code; }
}
