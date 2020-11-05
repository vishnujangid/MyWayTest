package Java.Availity;

import java.util.HashMap;
import java.util.Map;

public class FirstRound {

    public static void main(String[] args) {

        int [] arr ={1, 4, 6, 8, 9, 1, 9, 5};
        findOccurrenceOfElement(arr);
        String str = "Hello is Hello";
        System.out.println(iSMirrorString(str));
    }

    public static boolean iSMirrorString(String str){
        String [] strArr = str.split(" ");
        String finalStr = "";

        for (int i = strArr.length-1; i>=0;i--){
            if(i!=0)
                finalStr=finalStr+strArr[i]+" ";
            else {
                finalStr=finalStr+strArr[i];
            }

        }
        return str.equals(finalStr);


    }

    public static void findOccurrenceOfElement(int [] arr){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int value : arr) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }
        System.out.println(map);
    }
}
