package id28418.q5;

public class Course extends Student {
    private String courseName;
    private String courseCode; // 6 chars minimum

    public Course(int id, String createdDate, String updatedDate,
                  String schoolName, String location, String email,
                  String departmentName,
                  String teacherName, String qualification,
                  String studentName, String regNo, String phone,
                  String courseName, String courseCode)
            throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, location, email,
              departmentName, teacherName, qualification,
              studentName, regNo, phone);

        if (courseName == null || courseName.isEmpty())
            throw new SchoolDataException("courseName required");
        if (courseCode == null || courseCode.length() < 6)
            throw new SchoolDataException("courseCode min 6 chars");

        this.courseName = courseName;
        this.courseCode = courseCode;
    }
}
