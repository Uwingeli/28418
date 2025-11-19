package id28418.q5;

public class TermPerformance extends Assessment {
    private String termName;
    private double credit; // >0

    public TermPerformance(int id, String createdDate, String updatedDate,
                           String schoolName, String location, String email,
                           String departmentName,
                           String teacherName, String qualification,
                           String studentName, String regNo, String phone,
                           String courseName, String courseCode,
                           String assessmentName, double score,
                           String termName, double credit)
            throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, location, email,
              departmentName, teacherName, qualification,
              studentName, regNo, phone,
              courseName, courseCode,
              assessmentName, score);

        if (termName == null || termName.isEmpty())
            throw new SchoolDataException("termName required");
        if (credit <= 0)
            throw new SchoolDataException("credit must be >0");

        this.termName = termName;
        this.credit = credit;
    }

    public double getCredit() { return credit; }
}
