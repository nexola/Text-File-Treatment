package exercises.application;

import exercises.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {

        String strPath = "C:\\Users\\vitor\\Desktop\\Projetos Java\\LeituraTexto\\src\\exercisepath\\origin.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
            List<Product> products = new ArrayList<>();

            String line = br.readLine();

            // Splitting lines in txt and adding each one to a list of products (name, price, quantity)
            while (line != null) {
                String[] list = line.split(",");
                Product product = new Product(list[0], Double.parseDouble(list[1]), Integer.parseInt(list[2]));
                products.add(product);
                line = br.readLine();
            }

            // Path to create a new folder
            String newPath = "C:\\Users\\vitor\\Desktop\\Projetos Java\\LeituraTexto\\src\\exercisepath";

            // Creating a new folder in the path above
            boolean success = new File(newPath + "\\out").mkdir();
            System.out.println("Directory created succesfully: " + success);

            // Path to create a new CSV file
            String path = "C:\\Users\\vitor\\Desktop\\Projetos Java\\LeituraTexto\\src\\exercisepath\\out\\summary.csv";

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

                // Adding each product item in the list to a new file (name, totalValue(price * quantity))
                for (Product product: products) {
                    bw.write(product.toString());
                    bw.newLine();
                }

                // Exception treatment
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
