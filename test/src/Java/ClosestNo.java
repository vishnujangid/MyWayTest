package Java;

/**
 * Created by Vishnu.jangid on 06/05/2020 AD .
 */

public class ClosestNo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 6, 8, 9, 11, 49, 48};
        int k = 11;
        System.out.println("Closest value is :" + new ClosestNo().closest(arr, k));
    }
    
    public int closest(int[] arr, int k) {
        int min = k < arr[0] ? k - arr[0] : arr[0] - k;
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            int cDiff = k < arr[i] ? k - arr[i] : arr[i] - k;
            if (min < cDiff) {
                min = cDiff;
                index = i;
            }
        }
        return arr[index];
    }
}
