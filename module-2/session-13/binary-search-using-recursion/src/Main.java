import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị: ");
        int number = scanner.nextInt();
        System.out.println(BinarySearchUsingRecursion.binarySearch(array, 0, array.length - 1, number));
    }
}