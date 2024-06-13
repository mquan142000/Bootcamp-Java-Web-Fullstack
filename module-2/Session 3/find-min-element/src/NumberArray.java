import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter the size of the array: ");
            size = scanner.nextInt();
            if (size > 10) {
                System.out.println("The size of the array must be less than 10");
            }
        } while (size > 10);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("The array is: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        int min = arr[0];
        int index = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
                index = j + 1;
            }
        }
        System.out.println("The minimum property value in the list is: " + min + " ,at position " + index);
    }
}
