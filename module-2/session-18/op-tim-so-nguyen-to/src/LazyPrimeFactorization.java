public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        // Implement prime factorization logic here
        try {
            for (int i = 2; i < 100; i++) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println("Lazy prime factorization " + i + " is a prime number.");
                }
            }
        } catch (Exception e) {
            System.out.println("Thread interrupted");
        }
        System.out.println("Lazy prime factorization thread is over");
    }
}
