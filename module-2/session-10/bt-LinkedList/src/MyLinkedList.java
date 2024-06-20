public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    private class Node {
        Node next;
        E data;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public MyLinkedList() {
        head = null;
        numNodes = 0;
    }

    public void add(int index, E element) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + "Size: " + numNodes);
        }
        Node newNode = new Node(element);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        numNodes++;
    }

    public void addFirst(E e) {
        Node newNode = new Node(e);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    public void addLast(E e) {
        Node newNode = new Node(e);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        numNodes++;
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + "Size: " + numNodes);
        }

        Node removedNode = head;
        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            removedNode = current.next;
            current.next = removedNode.next;
        }
        numNodes--;
        return removedNode.data;
    }

    public boolean remove(Object e) {
        if (head == null) {
            return false;
        }
        if (head.data.equals(e)) {
            head = head.next;
            numNodes--;
            return true;
        }
        Node current = head;
        while (current.next != null && current.next.data.equals(e)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
            numNodes--;
            return true;
        }
        return false;
    }

    public E get (int index){
        if (index < 0 || index >= numNodes){
            throw new IndexOutOfBoundsException("Index: " + index + "Size: " + numNodes);
        }
        Node current = head;
        for (int i = 0; i < index; i++){
            current = current.next;
        }
        return current.data;
    }

    public int size(){
        return numNodes;
    }

    public boolean contains(E o){
        Node current = head;
        while (current!= null){
            if (current.data.equals(o)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int indexOf(E o){
        Node current = head;
        int index = 0;
        while (current!= null){
            if (current.data.equals(o)){
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public void clear(){
        head = null;
        numNodes = 0;
    }

    public E getFirst(){
        if (head == null){
            return null;
        }
        return head.data;
    }

    public E getLast(){
        if (head == null){
            return null;
        }
        Node current = head;
        while (current.next!= null){
            current = current.next;
        }
        return current.data;
    }
}
