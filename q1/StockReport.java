package id28418.q1;

public final class StockReport extends Inventory {
    private String reportDate;
    private String remarks;

    public StockReport(int id, String c, String u,
                       String wName, String wLoc, String wPhone,
                       String catName, String catCode,
                       String sName, String email, String phone,
                       String pName, double price, int limit,
                       int qty, int reorder,
                       String purchaseDate, int purchasedQty, String supplierName,
                       String saleDate, int soldQty, String custName,
                       int totalItems, double stockValue,
                       String reportDate, String remarks) {

        super(id, c, u, wName, wLoc, wPhone, catName, catCode, sName, email, phone,
              pName, price, limit, qty, reorder,
              purchaseDate, purchasedQty, supplierName,
              saleDate, soldQty, custName,
              totalItems, stockValue);

        this.reportDate = reportDate;
        this.remarks = remarks;
    }

    public void generateReport() {
        System.out.println("===== STOCK REPORT ===== " + "28418");
        System.out.println("Total Items: " + getTotalItems());
        System.out.println("Stock Value: " + getStockValue());
        System.out.println("Remarks: " + remarks);
        System.out.println("====End OF REPORT====28418" );
    }
}
