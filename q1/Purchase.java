package id28418.q1;

public class Purchase extends StockItem {
    private String purchaseDate;
    private int purchasedQuantity;
    private String supplierName;

    public Purchase(int id, String c, String u,
                    String wName, String wLoc, String wPhone,
                    String catName, String catCode,
                    String sName, String email, String phone,
                    String pName, double price, int limit,
                    int qty, int reorder,
                    String purchaseDate, int purchasedQuantity, String supplierName) {
                        
        super(id, c, u, wName, wLoc, wPhone, catName, catCode, sName, email, phone,
              pName, price, limit, qty, reorder);

        if (purchaseDate == null) throw new IllegalArgumentException("Date cannot be null");
        if (purchasedQuantity <= 0) throw new IllegalArgumentException("Quantity must be > 0");

        this.purchaseDate = purchaseDate;
        this.purchasedQuantity = purchasedQuantity;
        this.supplierName = supplierName;
    }
}
