package exceptions;

import java.io.*;

public class SomeResources {
    public static void main(String[] args) {
        //auto-closable

        try (
                BufferedReader in = new BufferedReader(new FileReader("files/some.txt"));
                PrintWriter out = new PrintWriter(new FileWriter("files/some-new.txt"))
        ) {
            String text = in.readLine();
            out.println(text);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
