package id28418.q4;

public final class FinalRecord extends Fine {
    private String recordCode;
    private double daysLate;

    public FinalRecord(int id, String createdDate, String updatedDate,
                       String libraryName, String location, String email,
                       String authorName, String nationality,
                       String title, String isbn, int publicationYear,
                       String patronName, String cardNumber, String phone,
                       String loanDate, String dueDate, String returnDate,
                       double fineAmount, double ratePerDay,
                       String recordCode, double daysLate) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, email,
              authorName, nationality, title, isbn, publicationYear,
              patronName, cardNumber, phone, loanDate, dueDate, returnDate,
              fineAmount, ratePerDay);

        if (recordCode == null || recordCode.isEmpty()) throw new LibraryDataException("recordCode required");
        if (daysLate < 0) throw new LibraryDataException("daysLate >= 0");

        this.recordCode = recordCode;
        this.daysLate = daysLate;
    }

    /** computeFine() = daysLate × ratePerDay */
    public double computeFine() {
        double fine = daysLate * getRatePerDay();
        System.out.println("Computed Fine: " + fine + " 28418");
        return fine;
    }
}
