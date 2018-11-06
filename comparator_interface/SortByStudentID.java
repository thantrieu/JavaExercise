package java_interface.comparator_interface;

import model.Student;

import java.util.Comparator;

public class SortByStudentID implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getStudentID().compareTo(o2.getStudentID());
    }
}
