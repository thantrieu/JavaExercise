package object_input_output_stream;

import model.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
    Đọc ghi một đối tượng đơn vào/từ file sử dụng ObjectInput/OutputStream
 */
public class SingleObjectInputOutputStreamExample {
    public static void main(String[] args) {

        Student student  = new Student("B19DCCN123", 4,
                3.21f, "Trieu Van Than");
//        Student student1  = new Student("B19DCCN155", 4,
//                3.29f, "Le Van Hung");
//        Student student2  = new Student("B19DCCN223", 4,
//                3.51f, "Le Van Luong");
//        Student student3  = new Student("B19DCCN523", 4,
//                3.31f, "Ngo Van Tai");
//        Student student4  = new Student("B19DCCN188", 4,
//                3.02f, "Truong Trong Nghia");

        // ghi file:
        try {
            FileOutputStream fos = new FileOutputStream("STUDENT.DAT");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(student);
//            oos.writeObject(student1);
//            oos.writeObject(student2);
//            oos.writeObject(student3);
//            oos.writeObject(student4);

            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
