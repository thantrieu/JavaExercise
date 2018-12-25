package exception;

// try with resource

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class TryWithResoure {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        try (Scanner readFile = new Scanner(
                new File(
                        "C:\\Users\\ASUS\\IdeaProjects\\JavaTutorial2\\src\\exception\\ThrowVSThrows.java"),
                "UTF8");
             PrintWriter printWriter =
                     new PrintWriter(
                             "C:\\Users\\ASUS\\IdeaProjects\\JavaTutorial2\\src\\exception\\ThrowVSThrows.txt",
                             "UTF-8")) {
             while(readFile.hasNextLine()){
                 var input = readFile.nextLine();
                 printWriter.println(input);
             }
        }
    }
}
