package model;

public class Student implements Comparable<Student> {
    private String studentID;
    private int studentYears;
    private float studentAVGMark;
    private String studentName;

    public Student(){

    }

    public Student(String studentID){

    }

    public Student(String studentID, int studentYears, float studentAVGMark,
                   String studentName) {
        this.studentID = studentID;
        this.studentYears = studentYears;
        this.studentAVGMark = studentAVGMark;
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getStudentYears() {
        return studentYears;
    }

    public void setStudentYears(int studentYears) {
        this.studentYears = studentYears;
    }

    public float getStudentAVGMark() {
        return studentAVGMark;
    }

    public void setStudentAVGMark(float studentAVGMark) {
        this.studentAVGMark = studentAVGMark;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", studentYears=" + studentYears +
                ", studentAVGMark=" + studentAVGMark +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        String name1 = studentName.substring(studentName.lastIndexOf(" "));
        String name2 = o.studentName.substring(o.studentName.lastIndexOf(" "));
        return name1.compareTo(name2);
        // if return value greater than 0 then swap
    }
}
