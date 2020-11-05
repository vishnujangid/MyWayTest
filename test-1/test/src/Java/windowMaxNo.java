package Java;

/**
 * Created by Vishnu.jangid on 06/05/2020 AD .
 */

public class windowMaxNo {
    public static void main(String[] args) {
        int [] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int k = 3;
        new windowMaxNo().windowMax(arr, k);
    }
    
    private void windowMax(int [] arr, int k ) {
        int max =0;
        for(int i =  0; i<arr.length; i++){
            max = max>=arr[i]?max:arr[i];
            if(i>=k-1) System.out.print(max+" ");
        }
    }
    
}
