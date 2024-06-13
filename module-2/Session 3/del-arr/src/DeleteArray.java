import java.util.Arrays;
import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 9, 7, 4, 3};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                index = i;
                System.out.println("Số cần xoá là: " + number + " ở vị trí " + index);
            }
        }
        int[] newArray = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (arr[i] == number){
                continue;
            }
            newArray[k++] = arr[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
