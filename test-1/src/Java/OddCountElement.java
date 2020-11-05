package Java;

/**
 * Created by Vishnu.jangid on 03/04/2020 AD .
 */

public class OddCountElement {
    public static void main(String[] args) {
//        int arr[] = {1, 4, 6, 4, 1, 5};
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i] != -1) {
//                int count = 1;
//                for (int j = i + 1; j < arr.length; j++) {
//                    if (arr[i] == arr[j]) {
//                        count++;
//                    }
//                }
//                if (count % 2 != 0) {
//                    System.out.println(arr[i]);
//
//                }
//                for (int j = i + 1; j < arr.length; j++) {
//                    if (arr[i] == arr[j]) {
//                        arr[j] = -1;
//                    }
//                }
//
//            }
//        }
//    }
        int arr[] = {9, 12, 23, 10, 12, 12,
            15, 23, 14, 12, 15,7,7};
        int n = arr.length;
    
        GFG.printRepeatingEven(arr, n);
    }
}

// Java Program to find the even occurring
// elements in given array
class GFG
{
    
    // Function to find the even occurring
// elements in given array
    static void printRepeatingEven(int arr[],
                                   int n)
    {
        long _xor = 0L;
        long pos;
        
        // do for each element of array
        for (int i = 0; i < n; ++i)
        {
            // left-shift 1 by value of
            // current element
            pos = 1 << arr[i];
            
            // Toggle the bit everytime
            // element gets repeated
            _xor ^= pos;
        }
        
        // Traverse array again and use _xor
        // to find even occurring elements
        for (int i = 0; i < n; ++i)
        {
            // left-shift 1 by value of
            // current element
            pos = 1 << arr[i];
            
            // Each 0 in _xor represents
            // an even occurrence
            if (!((pos & _xor)!=0))
            {
                // print the even occurring numbers
                System.out.print(arr[i] + " ");
                
                // set bit as 1 to avoid
                // printing duplicates
                _xor ^= pos;
            }
        }
    }
    
    // Driver code
   
}

// This code is contributed
// by 29AjayKumar
