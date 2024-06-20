public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.addFirst("Andy");
        list.addLast("World");
        list.add(1, "Hello");

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());

        list.remove("Hello");
        System.out.println("After removing: " + list.get(1));

        list.clear();
        System.out.println("List size after clearing: " + list.size());
    }
}
