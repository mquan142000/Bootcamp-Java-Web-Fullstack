import java.util.Arrays;
import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 8, 12, 24};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vị trí cần thêm: ");
        int index = scanner.nextInt();
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (j == index) {
                System.out.println("Nhập number: ");
                int number = scanner.nextInt();
                newArr[j] = number;
                j++;
            }
            newArr[j] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));

    }
}
