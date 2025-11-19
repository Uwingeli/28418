package id28418.q6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== RSSB Payroll Management System (Q6) === 28293");

            System.out.print("Organization name: ");
            String org = sc.nextLine();

            System.out.print("Org code (>=3 chars): ");
            String orgCode = sc.nextLine();

            System.out.print("RSSB number (8 digits): ");
            String rssb = sc.nextLine();

            System.out.print("Contact email: ");
            String email = sc.nextLine();

            System.out.print("Department name: ");
            String dept = sc.nextLine();

            System.out.print("Dept code (>=3 chars): ");
            String deptCode = sc.nextLine();

            System.out.print("Manager name: ");
            String manager = sc.nextLine();

            System.out.print("Employee ID (>=1000): ");
            int empID = Integer.parseInt(sc.nextLine());

            System.out.print("Full name: ");
            String name = sc.nextLine();

            System.out.print("Position: ");
            String position = sc.nextLine();

            System.out.print("Base salary (>0): ");
            double base = Double.parseDouble(sc.nextLine());

            System.out.print("RSSB registered (true/false): ");
            boolean registered = Boolean.parseBoolean(sc.nextLine());

            System.out.print("Month (1-12): ");
            int month = Integer.parseInt(sc.nextLine());

            System.out.print("Year (>=2000): ");
            int year = Integer.parseInt(sc.nextLine());

            System.out.print("Start date: ");
            String start = sc.nextLine();

            System.out.print("End date: ");
            String end = sc.nextLine();

            System.out.print("Basic pay (>=0): ");
            double basic = Double.parseDouble(sc.nextLine());

            System.out.print("Transport allowance (>=0): ");
            double transport = Double.parseDouble(sc.nextLine());

            System.out.print("Housing allowance (>=0): ");
            double housing = Double.parseDouble(sc.nextLine());

            System.out.print("RSSB contribution (>=0): ");
            double rssbCont = Double.parseDouble(sc.nextLine());

            System.out.print("PAYE tax (>=0): ");
            double paye = Double.parseDouble(sc.nextLine());

            System.out.print("Loan deduction (>=0): ");
            double loan = Double.parseDouble(sc.nextLine());

            System.out.print("Overtime hours (>=0): ");
            double otHours = Double.parseDouble(sc.nextLine());

            System.out.print("Overtime rate (>=0): ");
            double otRate = Double.parseDouble(sc.nextLine());

            System.out.print("Bonus (>=0): ");
            double bonus = Double.parseDouble(sc.nextLine());

            System.out.print("Payslip number: ");
            String psNumber = sc.nextLine();

            System.out.print("Issue date: ");
            String issue = sc.nextLine();

            Payslip ps = new Payslip(
                1, "2025-01-01", "2025-01-02",
                org, orgCode, rssb, email,
                dept, deptCode, manager,
                empID, name, position, base, registered,
                month, year, start, end,
                basic, transport, housing,
                rssbCont, paye, loan,
                otHours, otRate, bonus,
                psNumber, issue
            );

            ps.generatePayslip();

        } catch (RSSBDataException rde) {
            System.out.println("Validation error: " + rde.getMessage() + " 28293");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + " 28293");
        }

        sc.close();
    }
}