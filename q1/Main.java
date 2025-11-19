package id28418.q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total items: ");
        int items = sc.nextInt();

        System.out.print("Enter stock value: ");
        double value = sc.nextDouble();

        StockReport report = new StockReport(
            1, "01/01", "01/02",
            "Main Warehouse", "Kigali", "0780000000",
            "Electronics", "ELC123",
            "Samsung Supplier", "sam@gmail.com", "0781111111",
            "Laptop", 1200, 50,
            30, 10,
            "2025-01-01", 10, "Samsung",
            "2025-01-02", 5, "John",
            items, value,
            "2025-01-03", "All Good"
        );

        report.generateReport();
    }
}
