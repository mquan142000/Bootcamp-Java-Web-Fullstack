public class TestBST {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("George");
        tree.insert("John");
        tree.insert("Mary");
        tree.insert("Peter");
        tree.insert("Linda");
        tree.insert("Ann");
        tree.insert("Kate");
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
