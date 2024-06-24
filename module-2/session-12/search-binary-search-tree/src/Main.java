public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<Integer>();
        tree.root = new Node<Integer>(27);
        tree.root.left = new Node<Integer>(14);
        tree.root.right = new Node<Integer>(35);
        tree.root.left.left = new Node<Integer>(10);
        tree.root.left.right = new Node<Integer>(19);
        tree.root.right.left = new Node<Integer>(31);
        tree.root.right.right = new Node<Integer>(42);

        System.out.println(tree.search(19));
        System.out.println(tree.search(50));
        System.out.println(tree.search(35));

        tree.inOderTraversal(tree.root);
    }
}