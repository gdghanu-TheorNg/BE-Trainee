package OOP;

public class Student extends People {
    private String studentID;
    private String major;

    public Student() {

    }

    public Student(String name, String studentID, String major) {
        super(name);
        this.studentID = studentID;
        this.major = major;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    void job() {
        System.out.println("Student like studying");
    }

    @Override
    public String toString() {
        return "Student [studentID=" + studentID + ", major=" + major + "]";
    }

}
