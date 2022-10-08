public class Student {
    private int id;
    private String fName;
    private String lName;
    private int registrationYear;

    public Student(int id, String fName, String lName, int registrationYear) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.registrationYear = registrationYear;
    }

    public Student(int id, String fName, String lName) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getRegistrationYear() {
        return registrationYear;
    }

    public void setRegistrationYear(int registrationYear) {
        this.registrationYear = registrationYear;
    }
}
