package id28418.q1;

public class StockItem extends Product {
    private int quantityAvailable;
    private int reorderLevel;

    public StockItem(int id, String c, String u,
                     String wName, String wLoc, String wPhone,
                     String catName, String catCode,
                     String sName, String email, String phone,
                     String pName, double price, int limit,
                     int qty, int reorder) {
                     
        super(id, c, u, wName, wLoc, wPhone, catName, catCode, sName, email, phone,
              pName, price, limit);

        if (qty < 0 || reorder < 0) throw new IllegalArgumentException("Values must be >= 0");

        this.quantityAvailable = qty;
        this.reorderLevel = reorder;
    }
}
