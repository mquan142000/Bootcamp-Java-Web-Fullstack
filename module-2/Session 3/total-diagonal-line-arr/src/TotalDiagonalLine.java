public class TotalDiagonalLine {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 2, 5},
                {4, 7, 6},
                {2, 8, 9}
        };
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            sum1 += arr[i][arr.length - 1];
        }
        System.out.println("Total Diagonal Line: " + sum);
        System.out.println("Total Diagonal Line: " + sum1);
    }
}
