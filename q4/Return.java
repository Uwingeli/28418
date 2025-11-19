package id28418.q4;

public class Return extends Loan {
    private String returnDate;

    public Return(int id, String createdDate, String updatedDate,
                  String libraryName, String location, String email,
                  String authorName, String nationality,
                  String title, String isbn, int publicationYear,
                  String patronName, String cardNumber, String phone,
                  String loanDate, String dueDate,
                  String returnDate) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, email, authorName, nationality,
              title, isbn, publicationYear, patronName, cardNumber, phone,
              loanDate, dueDate);

        if (returnDate == null || returnDate.isEmpty()) throw new LibraryDataException("returnDate required");
        this.returnDate = returnDate;
    }

    public String getReturnDate() { return returnDate; }
}
