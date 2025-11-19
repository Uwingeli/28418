package id28418.q5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("-----School Management System -----28418");

            System.out.print("School name: ");
            String school = sc.nextLine();

            System.out.print("Location: ");
            String loc = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Department name: ");
            String dept = sc.nextLine();

            System.out.print("Teacher name: ");
            String teacher = sc.nextLine();

            System.out.print("Qualification: ");
            String qual = sc.nextLine();

            System.out.print("Student name: ");
            String student = sc.nextLine();

            System.out.print("RegNo (8 chars): ");
            String reg = sc.nextLine();

            System.out.print("Phone (10 digits): ");
            String phone = sc.nextLine();

            System.out.print("Course name: ");
            String course = sc.nextLine();

            System.out.print("Course code (>= 6 chars): ");
            String code = sc.nextLine();

            System.out.print("Assessment name: ");
            String assess = sc.nextLine();

            System.out.print("Score (0–100): ");
            double score = Double.parseDouble(sc.nextLine());

            System.out.print("Term name: ");
            String term = sc.nextLine();

            System.out.print("Credit (>0): ");
            double credit = Double.parseDouble(sc.nextLine());

            AcademicRecord ar = new AcademicRecord(
                1, "2025-01-01", "2025-01-02",
                school, loc, email,
                dept,
                teacher, qual,
                student, reg, phone,
                course, code,
                assess, score,
                term, credit,
                "REC-001"
            );

            ar.computeGrade();

        } catch (SchoolDataException sde) {
            System.out.println("Validation error: " + sde.getMessage() + " 28418");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + " 28418");
        }

        sc.close();
    }
}
