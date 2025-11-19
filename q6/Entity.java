package id28418.q6;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws RSSBDataException {
        if (id <= 0) throw new RSSBDataException("id must be > 0");
        if (createdDate == null || createdDate.isEmpty()) throw new RSSBDataException("createdDate required");
        if (updatedDate == null || updatedDate.isEmpty()) throw new RSSBDataException("updatedDate required");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
}