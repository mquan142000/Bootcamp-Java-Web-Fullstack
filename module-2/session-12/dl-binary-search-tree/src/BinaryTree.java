public class BinaryTree<E extends Comparable<E>> {
    Node<E> root;

    public boolean delete(E e) {
        Node<E> parent = null;
        Node<E> current = root;

        while (current != null && !current.val.equals(e)) {
            parent = current;
            if (e.compareTo(current.val) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if (current == null) {
            return false;
        }

        if (current.left == null) {
            if (parent == null) {
                root = current.right;
            } else if (e.compareTo(parent.val) < 0) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else {
            Node<E> parentOfRightmost = current;
            Node<E> rightmost = current.right;

            while (rightmost.right != null) {
                parentOfRightmost = rightmost;
                rightmost = rightmost.right;
            }

            current.val = rightmost.val;

            if (parentOfRightmost.right == rightmost) {
                parentOfRightmost.right = rightmost.left;
            } else {
                parentOfRightmost.left = rightmost.left;
            }
        }
        return true;
    }
}
