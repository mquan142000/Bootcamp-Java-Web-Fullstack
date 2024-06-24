public class Node<E> {
    E val;
    Node<E> left, right;

    public Node(E item){
        val = item;
        left = right = null;
    }
}
