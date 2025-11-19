package id28418.q1;

public class Warehouse extends Entity {
    private String warehouseName;
    private String location;
    private String contactNumber;

    public Warehouse(int id, String c, String u,
                     String name, String location, String phone) {
        super(id, c, u);
        if (phone.length() != 10) throw new IllegalArgumentException("Phone must be 10 digits");

        this.warehouseName = name;
        this.location = location;
        this.contactNumber = phone;
    }
}
