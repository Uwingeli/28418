package id28418.q5;

public class Assessment extends Course {
    private String assessmentName;
    private double score; // 0–100

    public Assessment(int id, String createdDate, String updatedDate,
                      String schoolName, String location, String email,
                      String departmentName,
                      String teacherName, String qualification,
                      String studentName, String regNo, String phone,
                      String courseName, String courseCode,
                      String assessmentName, double score)
            throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, location, email,
              departmentName, teacherName, qualification,
              studentName, regNo, phone,
              courseName, courseCode);

        if (assessmentName == null || assessmentName.isEmpty())
            throw new SchoolDataException("assessmentName required");
        if (score < 0 || score > 100)
            throw new SchoolDataException("score must be 0–100");

        this.assessmentName = assessmentName;
        this.score = score;
    }

    public double getScore() { return score; }
}

