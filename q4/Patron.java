package id28418.q4;

public class Patron extends Book {
    private String patronName;
    private String cardNumber; // exactly 8 chars
    private String phone; // 10 digits

    public Patron(int id, String createdDate, String updatedDate,
                  String libraryName, String location, String email,
                  String authorName, String nationality,
                  String title, String isbn, int publicationYear,
                  String patronName, String cardNumber, String phone) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, email, authorName, nationality, title, isbn, publicationYear);

        if (patronName == null || patronName.isEmpty()) throw new LibraryDataException("patronName required");
        if (cardNumber == null || cardNumber.length() != 8) throw new LibraryDataException("cardNumber must be 8 chars");
        if (phone == null || phone.length() != 10) throw new LibraryDataException("phone must be 10 digits");

        this.patronName = patronName;
        this.cardNumber = cardNumber;
        this.phone = phone;
    }

    public String getPatronName() { return patronName; }
}
