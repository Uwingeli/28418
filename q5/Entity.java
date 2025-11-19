package id28418.q5;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws SchoolDataException {
        if (id <= 0) throw new SchoolDataException("id must be > 0");
        if (createdDate == null || createdDate.isEmpty()) throw new SchoolDataException("createdDate required");
        if (updatedDate == null || updatedDate.isEmpty()) throw new SchoolDataException("updatedDate required");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
}
