package id28418.q4;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws LibraryDataException {
        if (id <= 0) throw new LibraryDataException("id must be > 0");
        if (createdDate == null || createdDate.isEmpty()) throw new LibraryDataException("createdDate required");
        if (updatedDate == null || updatedDate.isEmpty()) throw new LibraryDataException("updatedDate required");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
    public String getCreatedDate() { return createdDate; }
    public String getUpdatedDate() { return updatedDate; }
}
