import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {

        String str = "Xin chao cac ban!";
        Stack<String> stack = new Stack<>();
        String[] words = str.split(" ");
        for (String word : words) {
            stack.push(word);
        }
        StringBuilder reversedStr = new StringBuilder();
        int stackSize = stack.size();
        for (int i = 0; i < stackSize; i++) {
            reversedStr.append(stack.pop());
            if (i < stackSize - 1) {
                reversedStr.append(" ");
            }
        }
        System.out.println(reversedStr.toString());
    }
}
