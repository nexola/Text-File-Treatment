package lessons;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Lesson04FileWriterBufferedWriter {
    public static void main(String[] args) {
        // String vector containing the phrases
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
        String path = "c:\\temp\\out.txt";

        // Try with resources, instantiating the buffered writer and file writer, if file writer has 'true' parameter, the txt will append more info
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

        // Writing lines in txt based on vector 'lines'
        for (String line: lines) {
            bw.write(line);
            bw.newLine();
        }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
