package Java;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class MaxOcc {
    public static void main(String[] args) {
        int [] arr = {-1,1,2,3,2,4,5,2,3};
        int k =3;
//        for(int i =0; i<arr.length;i++){
//            int v = arr[i];
//            int find = k-v;
//            for(int j = 0;j<arr.length;j++){
//                if(find == arr[j]){
//                    System.out.println(+arr[i]+" "+arr[j] );
//                }
//
//            }
//
//        }








        Map<Integer, Integer> map = new HashMap<>();
        for (int i =0; i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int v = map.get(arr[i]);
                map.put(arr[i],++v);
            }
            else {
                map.put(arr[i],1);
            }
        }

        System.out.println(map);



//        2-3
//        3-2
//        5-1
//        4-1
//        1-1

    }
}

