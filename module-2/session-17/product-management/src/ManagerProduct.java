package src;

import entity.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerProduct {
    private static String filePath = "product-management/src/data.txt";
    private static File myFile = new File(filePath);
    private static Scanner scanner = new Scanner(System.in);

    public ManagerProduct() {
    }

    public static void addProduct() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new BufferedWriter(new FileWriter(myFile, true)));
            System.out.println("My file: " + myFile.getAbsolutePath());
            System.out.println("---Enter product information---");
            System.out.println("Enter id: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Read newline character after input id
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            System.out.println("Enter price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Read newline character after input
            System.out.println("Enter description: ");
            String description = scanner.nextLine();
            System.out.println("Enter manufacturer: ");
            String manufacturer = scanner.nextLine();

            Product product = new Product(id, name, price, description, manufacturer);
            String dataProduct = product.getId() + "," + product.getName() + "," + product.getPrice() + "," + product.getDescription() + "," + product.getManufacturer();
            bufferedWriter.write(dataProduct);
            bufferedWriter.newLine();
            System.out.println("Add complete product");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void showListProduct() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(myFile))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                int idProduct = Integer.parseInt(data[0]);
                String nameProduct = data[1];
                double price = Double.parseDouble(data[2]);
                String description = data[3];
                String manufacturer = data[4];
                Product pr1 = new Product(idProduct, nameProduct, price, description, manufacturer);
                System.out.println(pr1);
                bufferedReader.close();
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }

    public static void searchProductByName() {
        System.out.println("Enter the ID of the product to search: ");
        int idToSearch = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(myFile))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                int idProduct = Integer.parseInt(data[0]);
                if (idProduct == idToSearch) {
                    String nameProduct = data[1];
                    double price = Double.parseDouble(data[2]);
                    String description = data[3];
                    String manufacturer = data[4];
                    Product pr1 = new Product(idProduct, nameProduct, price, description, manufacturer);
                    System.out.println(pr1);
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                System.out.println("Product with id " + idToSearch + "not found");
            }
        } catch (Exception e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}

