package lessons;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lesson01Scanner {
    public static void main(String[] args) {
        // Sets file location
        File file = new File("c:\\temp\\in.txt");
        Scanner sc = null;
        // Initializing a Scanner in try block to avoid exceptions
        try {
            sc = new Scanner(file);
            // While hasNextLine = true, prints itself
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            // IO Exception for scanner
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // If the scanner has not been initiated, the sc.close will not run.
            if (sc != null) {
                sc.close();
            }
        }
    }
}