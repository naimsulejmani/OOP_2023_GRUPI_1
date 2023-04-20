package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) {
        String fileName = "src/exceptions/ReadingFile.java";
        int lines = countLines(fileName);
        System.out.println("Total rreshta: " + lines);
    }

    public static int countLines(String fileName) {
        int counter = 0;
        Scanner scanner = null;

        try {
            //System.in
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String line;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            counter++;
        }
        return counter;
    }
}