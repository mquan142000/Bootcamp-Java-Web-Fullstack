public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1, 4);

        System.out.println("List after additions: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "");
        }

        System.out.println("List after additions: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + "");
        }

        System.out.println("\nSize of list: " + list.size());

        list.remove(2);

        System.out.println("List after removal: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\nList contains 2: " + list.contains(2));
        System.out.println("Index of 3: " + list.indexOf(3));

        list.clear();
        System.out.println("List after clear: ");
        System.out.println("Size of list: " + list.size());
    }
}

