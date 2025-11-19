package id28418.q4;

public class Library extends Entity {
    private String libraryName;
    private String location;
    private String email;

    public Library(int id, String createdDate, String updatedDate,
                   String libraryName, String location, String email) throws LibraryDataException {
        super(id, createdDate, updatedDate);
        if (libraryName == null || libraryName.isEmpty()) throw new LibraryDataException("libraryName required");
        if (location == null || location.isEmpty()) throw new LibraryDataException("location required");
        if (!isValidEmail(email)) throw new LibraryDataException("invalid email");

        this.libraryName = libraryName;
        this.location = location;
        this.email = email;
    }

    private boolean isValidEmail(String e) {
        return e != null && e.contains("@") && e.contains(".");
    }
}
