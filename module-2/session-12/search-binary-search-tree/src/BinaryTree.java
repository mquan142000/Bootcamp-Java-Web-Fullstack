public class BinaryTree<E extends Comparable<E>> {
    Node<E> root;

    public boolean search(E e) {
        Node<E> current = root;

        while (current != null) {
            if (e.compareTo(current.val) < 0) {
                current = current.left;
            } else if (e.compareTo(current.val) > 0) {
                current = current.right;
            } else {
                return true;
            }
        }

        return false;
    }

    public void insert(E e) {
        root = insertRec(root, e);
    }

    private Node<E> insertRec(Node<E> current, E e) {
        if (root == null) {
            root = new Node<>(e);
            return root;
        }
        if (e.compareTo(root.val) < 0) {
            root.left = insertRec(root.left, e);
        } else if (e.compareTo(root.val) > 0) {
            root.right = insertRec(root.right, e);
        }
        return root;
    }

    public void inOderTraversal(Node<E> node) {
        if (node == null) {
            inOderTraversal(node.left);
            System.out.print(node.val + " ");
            inOderTraversal(node.right);
        }
    }
}
