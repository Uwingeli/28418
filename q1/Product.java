package id28418.q1;

public class Product extends Supplier {
    private String productName;
    private double unitPrice;
    private int stockLimit;

    public Product(int id, String c, String u,
                   String wName, String wLoc, String wPhone,
                   String catName, String catCode,
                   String sName, String email, String phone,
                   String pName, double price, int limit) {

        super(id, c, u, wName, wLoc, wPhone, catName, catCode, sName, email, phone);

        if (price <= 0) throw new IllegalArgumentException("Unit price must be > 0");
        if (limit < 0) throw new IllegalArgumentException("Stock limit must be >= 0");

        this.productName = pName;
        this.unitPrice = price;
        this.stockLimit = limit;
    }
}
