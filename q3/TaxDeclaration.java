package id28418.q3;

public class TaxDeclaration extends Employee {
    private String declarationMonth; // e.g., "2025-02"
    private double totalIncome; // >= 0

    public TaxDeclaration(int id, String createdDate, String updatedDate,
                          String authorityName, String region, String email,
                          String categoryName, double rate, String code,
                          String tin, String taxpayerName, String address,
                          String employerName, String employerTIN, String contact,
                          String employeeName, double salary, String employeeTIN,
                          String declarationMonth, double totalIncome) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN);
        if (totalIncome < 0) throw new TaxDataException("totalIncome must be >= 0");
        if (declarationMonth == null || declarationMonth.isEmpty()) throw new TaxDataException("declarationMonth required");
        this.declarationMonth = declarationMonth;
        this.totalIncome = totalIncome;
    }

    public double getTotalIncome() { return totalIncome; }
}
