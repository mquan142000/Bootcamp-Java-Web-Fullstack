import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Quan", "Nguyen", "Manh", "Kien", "Khoi", "Hoang"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (input_name.equals(students[i])) {
                System.out.println("Position of the students in the list " + input_name + " is " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println(input_name + " is not in the list");
        }
    }
}
