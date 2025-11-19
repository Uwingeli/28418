package id28418.q1;

public class Supplier extends Category {
    private String supplierName;
    private String supplierEmail;
    private String supplierPhone;

    public Supplier(int id, String c, String u,
                    String wName, String wLoc, String wPhone,
                    String catName, String catCode,
                    String sName, String email, String phone) {
        super(id, c, u, wName, wLoc, wPhone, catName, catCode);

        if (!email.contains("@")) throw new IllegalArgumentException("Invalid email");
        if (phone.length() != 10) throw new IllegalArgumentException("Phone must be 10 digits");

        this.supplierName = sName;
        this.supplierEmail = email;
        this.supplierPhone = phone;
    }
}
