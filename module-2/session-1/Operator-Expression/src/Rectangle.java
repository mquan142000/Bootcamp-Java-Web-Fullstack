import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);   //Khai bao doi tuong Scanner

        System.out.println("Nhap chieu rong: ");
        width = scanner.nextFloat();    //Nhap chieu rong

        System.out.println("Nhap chieu cao: ");
        height = scanner.nextFloat();  //Nhap chieu cao

        float area = width * height;
        System.out.println("Dien tich hinh chu nhat la: " + area);
    }
}