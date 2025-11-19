package id28418.q4;

public class Loan extends Patron {
    private String loanDate;
    private String dueDate;

    public Loan(int id, String createdDate, String updatedDate,
                String libraryName, String location, String email,
                String authorName, String nationality,
                String title, String isbn, int publicationYear,
                String patronName, String cardNumber, String phone,
                String loanDate, String dueDate) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, email, authorName, nationality,
              title, isbn, publicationYear, patronName, cardNumber, phone);

        if (loanDate == null || loanDate.isEmpty()) throw new LibraryDataException("loanDate required");
        if (dueDate == null || dueDate.isEmpty()) throw new LibraryDataException("dueDate required");

        this.loanDate = loanDate;
        this.dueDate = dueDate;
    }
}
