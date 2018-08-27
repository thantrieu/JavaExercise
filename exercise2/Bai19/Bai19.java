package exercise2;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) throws IOException {
        Scanner inputFromFile = new Scanner(Paths.get("input.txt"),
                "UTF-8");
        PrintWriter printWriter = new PrintWriter("output.txt", "UTF-8");

        String ex;
        while (inputFromFile.hasNextLine()){
            ex = inputFromFile.nextLine();// read all line
            String [] exs = ex.split(" ");
            Arrays.sort(exs);
            for (String s: exs) {
                printWriter.print(s+" ");
            }
//            printWriter.print("\b");
            printWriter.println();
        }
        // dong ket noi voi file
        inputFromFile.close();
        printWriter.close();
    }
}
