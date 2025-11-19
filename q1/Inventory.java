package id28418.q1;

public class Inventory extends Sale {
    private int totalItems;
    private double stockValue;

    public Inventory(int id, String c, String u,
                     String wName, String wLoc, String wPhone,
                     String catName, String catCode,
                     String sName, String email, String phone,
                     String pName, double price, int limit,
                     int qty, int reorder,
                     String purchaseDate, int purchasedQty, String supplierName,
                     String saleDate, int soldQty, String custName,
                     int totalItems, double stockValue) {

        super(id, c, u, wName, wLoc, wPhone, catName, catCode, sName, email, phone,
              pName, price, limit, qty, reorder,
              purchaseDate, purchasedQty, supplierName,
              saleDate, soldQty, custName);

        if (totalItems < 0 || stockValue < 0)
            throw new IllegalArgumentException("Totals must be >= 0");

        this.totalItems = totalItems;
        this.stockValue = stockValue;
    }

    public int getTotalItems() { return totalItems; }
    public double getStockValue() { return stockValue; }
}
