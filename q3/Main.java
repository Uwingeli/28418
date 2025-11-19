package id28418.q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== Tax Administration System (Q3) === 28293");

            System.out.print("Tax authority name: ");
            String auth = sc.nextLine();

            System.out.print("Region: ");
            String region = sc.nextLine();

            System.out.print("Authority email: ");
            String aemail = sc.nextLine();

            System.out.print("Tax category name: ");
            String catName = sc.nextLine();

            System.out.print("Tax rate (e.g., 0.18): ");
            double rate = Double.parseDouble(sc.nextLine());

            System.out.print("Category code (>=3 chars): ");
            String code = sc.nextLine();

            System.out.print("Taxpayer TIN (9 digits): ");
            String tin = sc.nextLine();

            System.out.print("Taxpayer name: ");
            String tname = sc.nextLine();

            System.out.print("Employer name: ");
            String employer = sc.nextLine();

            System.out.print("Employer TIN (9 digits): ");
            String empTin = sc.nextLine();

            System.out.print("Employee name: ");
            String ename = sc.nextLine();

            System.out.print("Employee salary (>0): ");
            double salary = Double.parseDouble(sc.nextLine());

            // Build a TaxRecord (using reasonable placeholders for many fields)
            TaxRecord tr = new TaxRecord(
                    1, "2025-01-01", "2025-01-02",
                    auth, region, aemail,
                    catName, rate, code,
                    tin, tname, "Some Address",
                    employer, empTin, "0123456789",
                    ename, salary, "111222333",
                    "2025-01", salary,
                    "2025-02-01", salary * rate,
                    "2025-02-10", salary * rate,
                    "RCPT-001", salary * rate
            );

            // computeTax prints the computed tax with 28293 appended
            tr.computeTax();

        } catch (TaxDataException tde) {
            System.out.println("Validation error: " + tde.getMessage() + " 28293");
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage() + " 28293");
        } finally {
            sc.close();
        }
    }
}
