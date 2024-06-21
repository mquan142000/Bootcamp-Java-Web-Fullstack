import java.util.Stack;

public class ConvertCouterSystem {
    public static String convertBinary(int number) {
        Stack<Integer> stack = new Stack<>();
        while (number != 0) {
            stack.push(number % 2);
            number = number / 2;
        }
        StringBuilder result = new StringBuilder();
        while (stack.size() > 0) {
            result.append(stack.pop());
        }
        return result.toString();
    }
}
