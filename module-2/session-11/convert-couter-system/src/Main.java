import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        String numberConverterBinary = ConvertCouterSystem.convertBinary(number);
        System.out.println(numberConverterBinary);

    }
}