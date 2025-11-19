package id28418.q5;

public class Department extends School {
    private String departmentName;

    public Department(int id, String createdDate, String updatedDate,
                      String schoolName, String location, String email,
                      String departmentName) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, location, email);
        if (departmentName == null || departmentName.isEmpty())
            throw new SchoolDataException("departmentName required");

        this.departmentName = departmentName;
    }
}
