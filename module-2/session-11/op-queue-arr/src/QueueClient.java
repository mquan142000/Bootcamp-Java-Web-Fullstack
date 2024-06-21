public class QueueClient {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.enqueue(10);
        queue.dequeue();
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(50);
        queue.dequeue();
        queue.enqueue(60);
        queue.enqueue(70);
        queue.enqueue(80);
    }
}
