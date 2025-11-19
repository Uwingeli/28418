package id28418.q4;
import id28418.q4.LibraryDataException;
public class Fine extends Return {
    private double fineAmount; // >=0
    private double ratePerDay; // >0

    public Fine(int id, String createdDate, String updatedDate,
                String libraryName, String location, String email,
                String authorName, String nationality,
                String title, String isbn, int publicationYear,
                String patronName, String cardNumber, String phone,
                String loanDate, String dueDate, String returnDate,
                double fineAmount, double ratePerDay) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, email,
              authorName, nationality, title, isbn, publicationYear,
              patronName, cardNumber, phone, loanDate, dueDate, returnDate);

        if (fineAmount < 0) throw new LibraryDataException("fineAmount >= 0");
        if (ratePerDay <= 0) throw new LibraryDataException("ratePerDay > 0");

        this.fineAmount = fineAmount;
        this.ratePerDay = ratePerDay;
    }

    public double getRatePerDay() { return ratePerDay; }
    public double getFineAmount() { return fineAmount; }
}
