import src.ManagerProduct;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("---Enter choice number---");
                System.out.println("1: Add product");
                System.out.println("2: Show list product");
                System.out.println("3: Search product");
                System.out.println("4: Exit");

                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 4) {
                    break;
                }
                switch (choice) {
                    case 1:
                        ManagerProduct.addProduct();
                        break;
                    case 2:
                        ManagerProduct.showListProduct();
                        break;
                    case 3:
                        ManagerProduct.searchProductByName();
                        break;

                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
