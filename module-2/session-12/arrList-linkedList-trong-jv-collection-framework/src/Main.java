import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();

        while (true) {
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo id");
            System.out.println("3. Xóa sản phẩm theo id");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm");
            System.out.println("7. Thoát");
            System.out.print("Chọn một lựa chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Nhập id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá: ");
                    double price = scanner.nextDouble();
                    productManager.addProduct(new Product(id, name, price));
                    break;
                case 2:
                    System.out.print("Nhập id: ");
                    int idEdit = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Nhập tên mới: ");
                    String nameEdit = scanner.nextLine();
                    System.out.print("Nhập giá mới: ");
                    double priceEdit = scanner.nextDouble();
                    productManager.editProduct(idEdit, nameEdit, priceEdit);
                    break;
                case 3:
                    System.out.print("Nhập id: ");
                    int idDelete = scanner.nextInt();
                    productManager.deleteProduct(idDelete);
                    break;
                case 4:
                    System.out.println("Danh sách sản phẩm:");
                    productManager.displayProducts();
                    break;
                case 5:
                    System.out.print("Nhập tên sản phẩm cần tìm: ");
                    String searchName = scanner.nextLine();
                    System.out.println("Kết quả tìm kiếm:");
                    for (Product product : productManager.searchProductByName(searchName)) {
                        System.out.println(product);
                    }
                    break;
                case 6:
                    System.out.println("1. Sắp xếp tăng dần theo giá");
                    System.out.println("2. Sắp xếp giảm dần theo giá");
                    System.out.print("Chọn một lựa chọn: ");
                    int sortChoice = scanner.nextInt();
                    if (sortChoice == 1) {
                        productManager.sortProductsByPriceAscending();
                    } else if (sortChoice == 2) {
                        productManager.sortProductsByPriceDescending();
                    }
                    System.out.println("Danh sách sản phẩm sau khi sắp xếp:");
                    productManager.displayProducts();
                    break;
                case 7:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
