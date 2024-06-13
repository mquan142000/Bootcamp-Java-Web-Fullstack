import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000);
        }

        StopWatch stopWatch = new StopWatch();

        stopWatch.start();

        selectionSort(arr);

        stopWatch.stop();

        System.out.println(stopWatch.getElapsedTime());
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}