package id28418.q1;

public class Sale extends Purchase {
    private String saleDate;
    private int soldQuantity;
    private String customerName;

    public Sale(int id, String c, String u,
                String wName, String wLoc, String wPhone,
                String catName, String catCode,
                String sName, String email, String phone,
                String pName, double price, int limit,
                int qty, int reorder,
                String purchaseDate, int purchasedQuantity, String supplierName,
                String saleDate, int soldQty, String custName) {

        super(id, c, u, wName, wLoc, wPhone, catName, catCode, sName, email, phone,
              pName, price, limit, qty, reorder,
              purchaseDate, purchasedQuantity, supplierName);

        if (soldQty <= 0) throw new IllegalArgumentException("Sold quantity must be > 0");

        this.saleDate = saleDate;
        this.soldQuantity = soldQty;
        this.customerName = custName;
    }
}
