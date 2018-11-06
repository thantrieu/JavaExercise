package java_interface.comparable_interface;

/*
    Sử dụng Comparable interface
 */

import model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComparableExample {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        //String studentID, int studentYears, float studentAVGMark,
        //                   String studentName
        list.add(new Student("B19DCCN123", 4, 3.25f,
                "Tran Van Hung"));
        list.add(new Student("B19DCCN789", 4, 3.55f,
                "Nguyen Van Nam"));
        list.add(new Student("B19DCCN012", 4, 3.20f,
                "Le Van An"));
        list.add(new Student("B19DCCN339", 4, 3.19f,
                "Hoang Van Ngo"));
        list.add(new Student("B19DCCN412", 4, 3.89f,
                "Ngo Van Tung"));

        System.out.println("Truoc sap xep: ");
        for(var x: list){
            System.out.println(x);
        }

        System.out.println("Sau khi sap xep: ");
        Collections.sort(list);// sap xep theo tieu chi duoc dua ra o pt
        for(var x: list){
            System.out.println(x);
        }
    }
}
