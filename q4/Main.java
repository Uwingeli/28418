package id28418.q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== Library Management System (Q4) === 28293");

            System.out.print("Library name: ");
            String lib = sc.nextLine();

            System.out.print("Location: ");
            String loc = sc.nextLine();

            System.out.print("Library email: ");
            String email = sc.nextLine();

            System.out.print("Author name: ");
            String author = sc.nextLine();

            System.out.print("Author nationality: ");
            String nat = sc.nextLine();

            System.out.print("Book title: ");
            String title = sc.nextLine();

            System.out.print("ISBN (13 chars): ");
            String isbn = sc.nextLine();

            System.out.print("Publication year: ");
            int year = Integer.parseInt(sc.nextLine());

            System.out.print("Patron name: ");
            String patron = sc.nextLine();

            System.out.print("Card number (8 chars): ");
            String card = sc.nextLine();

            System.out.print("Phone (10 digits): ");
            String phone = sc.nextLine();

            System.out.print("Loan date: ");
            String loan = sc.nextLine();

            System.out.print("Due date: ");
            String due = sc.nextLine();

            System.out.print("Return date: ");
            String ret = sc.nextLine();

            System.out.print("Days late: ");
            double daysLate = Double.parseDouble(sc.nextLine());

            System.out.print("Rate per day: ");
            double rate = Double.parseDouble(sc.nextLine());

            FinalRecord fr = new FinalRecord(
                1, "2025-01-01", "2025-01-02",
                lib, loc, email,
                author, nat,
                title, isbn, year,
                patron, card, phone,
                loan, due, ret,
                0, rate, // fineAmount is computed
                "REC-001", daysLate
            );

            fr.computeFine();

        } catch (LibraryDataException lde) {
            System.out.println("Validation error: " + lde.getMessage() + " 28293");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + " 28293");
        }

        sc.close();
    }
}
