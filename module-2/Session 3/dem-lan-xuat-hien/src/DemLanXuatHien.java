import java.util.Arrays;
import java.util.Scanner;

public class DemLanXuatHien {
    public static void main(String[] args) {
        String[] arr = {"Hello", "Hien", "Hi", "Quan", "Bai"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi can dem: ");
        String line = sc.nextLine();
        int[] count = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(line)) {
                count[i]++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " xuat hien " + count[i] + " lan");
        }
    }
}
