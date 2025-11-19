package id28418.q1;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) {
        if (id <= 0) throw new IllegalArgumentException("ID must be > 0");
        if (createdDate == null || updatedDate == null)
            throw new IllegalArgumentException("Dates cannot be null");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
}
