package lessons;

import java.io.File;
import java.util.Scanner;

public class Lesson05Folder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a folder path: ");
        String strPath = sc.nextLine();

        // Instancing new File object with the directory path
        File path = new File(strPath);

        // Printing each folder
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        // Printing each file
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file : files) {
            System.out.println(file);
        }

        // Creating a new folder
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created succesfully: " + success);

        sc.close();
    }
}
