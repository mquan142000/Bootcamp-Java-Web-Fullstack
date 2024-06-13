import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the size of the array: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("The size must be less than 20");
            }
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Enter a mark for student: " + (i + 1) + ":");
            arr[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("List of marks: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
            if (arr[j] >= 5 && arr[j] <= 10) {
                count++;
            }

        }
        System.out.print("The number of students with a mark between 5 and 10: " + count);

    }
}
