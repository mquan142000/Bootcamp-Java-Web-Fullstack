public class BinarySearchUsingRecursion {
    public static int binarySearch(int[] array, int left, int right, int value) {
        if (right >= left) {
        }
        int middle = (left + right) / 2;
        if (value == array[middle]) {
            return middle;
        } else if (value > array[middle]) {
            return binarySearch(array, middle + 1, right, value);
        } else {
            return binarySearch(array, left, middle - 1, value);
        }
    }
}
