package lessons;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lesson03TryWithResources {
    public static void main(String[] args) {

        String path = "c:\\temp\\in.txt";

        // Clear method, without the 'finally' block
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
