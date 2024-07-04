public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lrFactorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization prfFactorization = new OptimizedPrimeFactorization();

        Thread thread = new Thread(lrFactorization);
        Thread thread2 = new Thread(prfFactorization);

        thread.start();
        thread2.start();
    }
}