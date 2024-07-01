import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleValidator {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a: ");
            double a = scanner.nextDouble();
            System.out.println("Enter b: ");
            double b = scanner.nextDouble();
            System.out.println("Enter c: ");
            double c = scanner.nextDouble();

            if (a <= 0 || b <= 0 || c <= 0) {
                System.out.println("Các cạnh của tam giác phải lớn hơn 0");
            } else if (a + b > c && a + c > b && b + c > a) {
                System.out.println("Là ba cạnh của một tam giác");
            } else {
                System.out.println("Không phải là ba cạnh của tam giác");
            }
        } catch (InputMismatchException e) {
            System.out.println("Giá trị nhập vào không hợp lệ. Vui lòng thử lại.");
        }
    }
}
