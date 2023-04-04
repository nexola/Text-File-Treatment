package lessons;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lesson02FileAndBufferedReader {
    public static void main(String[] args) {

        String path = "c:\\temp\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Instancing the path in the file reader, then the file reader in buffered reader
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            // Manual treatment
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

    }
}
