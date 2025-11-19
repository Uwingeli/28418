package id28418.q4;

public class Author extends Library {
    private String authorName;
    private String nationality;

    public Author(int id, String createdDate, String updatedDate,
                  String libraryName, String location, String email,
                  String authorName, String nationality) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, email);
        if (authorName == null || authorName.isEmpty()) throw new LibraryDataException("authorName required");
        if (nationality == null || nationality.isEmpty()) throw new LibraryDataException("nationality required");

        this.authorName = authorName;
        this.nationality = nationality;
    }

    public String getAuthorName() { return authorName; }
}
