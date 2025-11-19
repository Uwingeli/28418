package id28418.q5;

public class Teacher extends Department {
    private String teacherName;
    private String qualification;

    public Teacher(int id, String createdDate, String updatedDate,
                   String schoolName, String location, String email,
                   String departmentName,
                   String teacherName, String qualification)
            throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, location, email, departmentName);

        if (teacherName == null || teacherName.isEmpty())
            throw new SchoolDataException("teacherName required");
        if (qualification == null || qualification.isEmpty())
            throw new SchoolDataException("qualification required");

        this.teacherName = teacherName;
        this.qualification = qualification;
    }

    public String getTeacherName() { return teacherName; }
}
