package id28418.q5;

public class Student extends Teacher {
    private String studentName;
    private String regNo; // exactly 8 characters
    private String phone; // 10 digits

    public Student(int id, String createdDate, String updatedDate,
                   String schoolName, String location, String email,
                   String departmentName,
                   String teacherName, String qualification,
                   String studentName, String regNo, String phone)
            throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, location, email, departmentName,
              teacherName, qualification);

        if (studentName == null || studentName.isEmpty())
            throw new SchoolDataException("studentName required");
        if (regNo == null || regNo.length() != 8)
            throw new SchoolDataException("regNo must be 8 chars");
        if (phone == null || phone.length() != 10)
            throw new SchoolDataException("phone must be 10 digits");

        this.studentName = studentName;
        this.regNo = regNo;
        this.phone = phone;
    }

    public String getStudentName() { return studentName; }
}
