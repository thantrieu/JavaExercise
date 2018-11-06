package java_interface.comparator_interface;

import model.Student;

import java.util.Comparator;

public class SortByMark implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        float res = o1.getStudentAVGMark() - o2.getStudentAVGMark();
        if(res > 0){
            return -1; // do nothing
        }else if(res < 0){
            return 1; // swap o1, o2
        }
        return 0;
    }
}
