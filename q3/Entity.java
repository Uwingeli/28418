package id28418.q3;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws TaxDataException {
        if (id <= 0) throw new TaxDataException("id must be > 0");
        if (createdDate == null || updatedDate == null) throw new TaxDataException("dates not null");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
    public String getCreatedDate() { return createdDate; }
    public String getUpdatedDate() { return updatedDate; }
}
