import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên: ");
        int number = scanner.nextInt();

        int count = 0;
        int num = 2;

        System.out.println(number + " Số nguyên tố đầu tiên là:");
        while (count < number) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
        scanner.close();
    }
    //Kiem tra so nguyen to
    public static boolean isPrime(int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
