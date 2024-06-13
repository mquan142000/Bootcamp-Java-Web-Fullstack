import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen: ");
        int number = scanner.nextInt();
        switch(number) {
            case 1:
                System.out.println("Mot");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bon");
                break;
            case 5:
                System.out.println("Nam");
                break;
            case 6:
                System.out.println("Sau");
                break;
            case 7:
                System.out.println("Bay");
                break;
            case 8:
                System.out.println("Tam");
                break;
            case 9:
                System.out.println("Chin");
                break;
            case 0:
                System.out.println("Khong");
                break;
            default:
                System.out.println("Khong phai so nguyen");
                break;
        }
        switch (number){
        }
    }
}
