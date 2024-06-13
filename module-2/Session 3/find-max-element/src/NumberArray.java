import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        int[] arr;
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the size of the array: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("The size of the array must be greater than 20");
            }
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter element: " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < arr.length; j++) {

            System.out.print(arr[j] + "\t");
        }
        int max = arr[0];
        int index = 1;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
