public class BinarySearch {
    static int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
    static int binarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (high >= low) {
            int mid = (high + low) / 2;
            if (value < array[mid]) {
                high = mid - 1;
            } else if (value == array[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
