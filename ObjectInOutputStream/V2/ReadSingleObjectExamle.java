//package object_input_output_stream;

import model.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadSingleObjectExamle {
    public static void main(String[] args) {
        // doc file ObjectInputStream:
//        Object obj = null;
        try {
            FileInputStream fis = new FileInputStream("STUDENT.DAT");
            ObjectInputStream ois = new ObjectInputStream(fis);
            // doc doi tuong ra:
            while(fis.available() > 0){
                Student obj = (Student) ois.readObject();
                System.out.println(obj);
            }

            ois.close();
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

//        if(obj  == null){
//            System.out.println("Nothing");
//        }else{
//            System.out.println(obj);
//        }

    }
}
