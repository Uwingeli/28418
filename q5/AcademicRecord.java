package id28418.q5;

public final class AcademicRecord extends TermPerformance {
    private String recordCode;

    public AcademicRecord(int id, String createdDate, String updatedDate,
                          String schoolName, String location, String email,
                          String departmentName,
                          String teacherName, String qualification,
                          String studentName, String regNo, String phone,
                          String courseName, String courseCode,
                          String assessmentName, double score,
                          String termName, double credit,
                          String recordCode)
            throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, location, email,
              departmentName, teacherName, qualification,
              studentName, regNo, phone,
              courseName, courseCode,
              assessmentName, score,
              termName, credit);

        if (recordCode == null || recordCode.isEmpty())
            throw new SchoolDataException("recordCode required");

        this.recordCode = recordCode;
    }

    /** computeGrade() — simple conversion */
    public String computeGrade() {
        double score = getScore();
        String grade;

        if (score >= 80) grade = "A";
        else if (score >= 70) grade = "B";
        else if (score >= 60) grade = "C";
        else if (score >= 50) grade = "D";
        else grade = "F";

        System.out.println("Computed Grade: " + grade + " 28418");
        return grade;
    }
}
