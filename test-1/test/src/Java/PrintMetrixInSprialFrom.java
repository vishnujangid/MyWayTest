package Java;

public class PrintMetrixInSprialFrom {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        // printSprial(3, 4, arr);
        System.out.println(minimumMoves("0001", 2));

    }

    public static int minimumMoves(String s, int d) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < s.length() - 1; ) {
            int old_i = i;
            for (int j = i; j < s.length() && j < i + d; j++) {
                char c = s.charAt(j);
                if (c == '1') {
                    i = j + 1;
                    break;
                }
            }
            if (old_i == i) {
                i = i+d;
                count++;
            }

        }
        return count;
    }






    public static void printSprial(int row, int col, int[][] arr) {
        int start_r = 0, start_c = 0, last_r = row - 1, last_c = col - 1;

        while (start_r <= last_r && start_c <= last_c) {

            for (int i = start_c; i <= last_c; i++) {
                System.out.print(arr[start_r][i] + " ");
            }
            start_r++;
            for (int i = start_r; i <= last_r; i++) {
                System.out.print(arr[i][last_c] + " ");
            }
            last_c--;

            if (last_c >= start_c) {
                for (int i = last_c; i >= start_c; i--) {
                    System.out.print(arr[last_r][i] + " ");
                }
                last_r--;
            }
            if (last_r >= start_r) {
                for (int i = last_r; i >= start_r; i--) {
                    System.out.print(arr[i][start_c] + " ");
                }
                start_c++;
            }


        }

    }
}
