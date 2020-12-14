import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {
        try {
            PrintWriter fw = new PrintWriter("hello.txt");
            fw.println("Hello World!");
            fw.close();

            File fr = new File("hello.txt");
            Scanner sc = new Scanner(fr);
            while (sc.hasNext())
                System.out.printf(sc.next() + " ");
        } catch (FileNotFoundException e) {
            System.out.println("Invalid file");
        }
    }
}
