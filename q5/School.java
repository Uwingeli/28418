package id28418.q5;

public class School extends Entity {
    private String schoolName;
    private String location;
    private String email;

    public School(int id, String createdDate, String updatedDate,
                  String schoolName, String location, String email)
            throws SchoolDataException {
        super(id, createdDate, updatedDate);
        if (schoolName == null || schoolName.isEmpty()) throw new SchoolDataException("schoolName required");
        if (location == null || location.isEmpty()) throw new SchoolDataException("location required");
        if (!isValidEmail(email)) throw new SchoolDataException("invalid email");

        this.schoolName = schoolName;
        this.location = location;
        this.email = email;
    }

    private boolean isValidEmail(String e) {
        return e != null && e.contains("@") && e.contains(".");
    }
}
