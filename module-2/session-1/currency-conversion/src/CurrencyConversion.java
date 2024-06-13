import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double vnd = 23000;
        double  usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter USD: ");
        usd = scanner.nextDouble();
        double result = usd * vnd;
        System.out.println(usd + " USD = " + result + " VND");
    }
}
