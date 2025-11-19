package id28418.q4;

public class Book extends Author {
    private String title;
    private String isbn; // exactly 13 chars
    private int publicationYear; // > 0

    public Book(int id, String createdDate, String updatedDate,
                String libraryName, String location, String email,
                String authorName, String nationality,
                String title, String isbn, int publicationYear) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, email, authorName, nationality);

        if (title == null || title.isEmpty()) throw new LibraryDataException("title required");
        if (isbn == null || isbn.length() != 13) throw new LibraryDataException("ISBN must be 13 chars");
        if (publicationYear <= 0) throw new LibraryDataException("publicationYear must be > 0");

        this.title = title;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
    }

    public String getTitle() { return title; }
    public String getIsbn() { return isbn; }
}
