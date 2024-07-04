public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        long number = 2;
        while (number <= 100) {
            if (isPrime(number)) {
                System.out.println("Optimized prime factorization " + number + " is a prime number.");
            }
            number++;

            // Optimized prime factorization logic here
            try {
                Thread.sleep(100); // Simulate prime factorization time
            } catch (Exception e) {
                System.out.println("Thread interrupted");
            }
        }
        System.out.println("Optimized prime factorization thread is over");

    }

    public boolean isPrime(long number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
