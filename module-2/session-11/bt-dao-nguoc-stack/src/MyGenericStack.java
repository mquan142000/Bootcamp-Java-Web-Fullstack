import java.util.Stack;

public class MyGenericStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        int stackSize = stack.size();
        for (int i = 0; i < stackSize; i++) {
            System.out.println(stack.pop());
        }
    }
}
