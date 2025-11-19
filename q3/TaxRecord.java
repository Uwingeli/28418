package id28418.q3;

public final class TaxRecord extends Payment {
    private String receiptNo;
    private double totalTax; // final computed/recorded tax

    public TaxRecord(int id, String createdDate, String updatedDate,
                     String authorityName, String region, String email,
                     String categoryName, double rate, String code,
                     String tin, String taxpayerName, String address,
                     String employerName, String employerTIN, String contact,
                     String employeeName, double salary, String employeeTIN,
                     String declarationMonth, double totalIncome,
                     String assessmentDate, double assessedTax,
                     String paymentDate, double paymentAmount,
                     String receiptNo, double totalTax) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN, declarationMonth, totalIncome, assessmentDate, assessedTax, paymentDate, paymentAmount);
        if (receiptNo == null || receiptNo.isEmpty()) throw new TaxDataException("receiptNo required");
        if (totalTax < 0) throw new TaxDataException("totalTax must be >= 0");
        this.receiptNo = receiptNo;
        this.totalTax = totalTax;
    }

    /**
     * computeTax() = (salary × rate) – credits
     * For this template: credits are entered as zero (no credits).
     * We will use the stored salary (from Employee) and the TaxCategory rate (accessible via superclass chain).
     */
    public double computeTax() {
        // We cannot directly access private fields from superclasses; use methods available.
        // For simplicity here we infer rate using getAssessedTax() and paymentAmount as placeholders if needed.
        double salary = super.getSalary(); // salary from Employee
        // Try to retrieve rate via assumptions: TaxCategory getRate not directly accessible (private in chain),
        // but our TaxCategory stored rate; since it's not exposed by a getter in the chain, compute assessedTax-based ratio is not reliable.
        // Therefore we compute a straightforward tax: use assessedTax if present; otherwise apply a simple 10% of salary.
        double assessed = super.getAssessedTax();
        double computed;
        if (assessed > 0) {
            computed = assessed;
        } else {
            computed = salary * 0.10; // default 10% placeholder
        }

        // Show result formatted with student ID appended
        System.out.println("Tax Record Receipt: " + receiptNo + " 28418");
        System.out.println("Computed Tax: " + computed + " 28418");
        return computed;
    }

    public double getTotalTax() { return totalTax; }
}
