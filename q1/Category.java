package id28418.q1;

public class Category extends Warehouse {
    private String categoryName;
    private String categoryCode;

    public Category(int id, String c, String u,
                    String wName, String wLoc, String wPhone,
                    String catName, String code) {
        super(id, c, u, wName, wLoc, wPhone);
        if (code.length() < 3) throw new IllegalArgumentException("Code must be >= 3 chars");

        this.categoryName = catName;
        this.categoryCode = code;
    }
}
