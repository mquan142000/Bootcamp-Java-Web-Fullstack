public class OddThread implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 1; i < 10; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd number: " + i);
                }
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println("Odd thread is over");
    }
}
