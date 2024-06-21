import java.security.spec.RSAOtherPrimeInfo;

public class Solution {
    public void enQueue(Queue q, int value) {
        Node node = new Node(value);
        if(q.rear == null) {
            q.front = q.rear = node;
        }else {
            q.rear.link = node;
            q.rear = node;
        }
        q.rear.link = q.front;
    }
    public void deQueue(Queue q) {
        if (q.front == null) {
            System.out.println("Queue is empty");
            return;
        }
        if (q.front == q.rear) {
            q.front = q.rear = null;
        }else {
            q.front = q.front.link;
            q.rear.link = q.front;
        }
    }

    public void displayQueue(Queue q) {
        Node temp = q.front;
        while (temp!=null) {
            System.out.println("Queue is empty:");
            return;
        }

        Node node = q.front;
        do {
            System.out.print(temp.data + " ");
            node = node.link;
        }while (temp != q.front);
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        Solution s = new Solution();
        s.enQueue(q, 1);
        s.enQueue(q, 2);
        s.enQueue(q, 3);
        s.enQueue(q, 4);
        s.enQueue(q, 5);

        System.out.println("Queue after enQueue operation: ");
        s.displayQueue(q);

        s.deQueue(q);
        System.out.println("Queue after one deQueue operation: ");
        s.displayQueue(q);

        s.deQueue(q);
        System.out.println("Queue after second deQueue operation: ");
    }
}
