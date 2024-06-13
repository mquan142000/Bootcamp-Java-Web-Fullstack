import java.util.Scanner;

public class VeCacHinh {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. Ve hinh chu nhat");
            System.out.println("2. Ve tam giac vuong o botton-left");
            System.out.println("3. Ve tam giac vuong o top-left");
            System.out.println("0. Thoat");
            System.out.println("Nhap lua chon: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter height: ");
                    int height = scanner.nextInt();
                    System.out.println("Enter weight: ");
                    int width = scanner.nextInt();
                    for (int i = 0; i < height ; i++) {
                        for (int j = 0; j < width ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Enter height: ");
                    int triangleHeight = scanner.nextInt();
                    for (int i = 0; i < triangleHeight ; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Enter height: ");
                    int triangleHeight2 = scanner.nextInt();
                    for (int i = triangleHeight2; i > 0 ; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Thoat");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long nhap lai");
                    break;
            }
        }
    }
}
