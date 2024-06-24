import java.util.LinkedList;

public class LargestAscendingSeries {
    LinkedList<Character> max = new LinkedList<Character>();

    public LargestAscendingSeries(String str) {
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list = new LinkedList<Character>();
            list.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > list.getLast()) {
                    list.add(str.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
