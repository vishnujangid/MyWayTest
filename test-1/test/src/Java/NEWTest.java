package Java;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
class Base{
    public void add(int a){
        System.out.println("From Base");
    }
}
class MyChild extends Base{
    public void add(int a){
        System.out.println("From MyChild");
    }
}
class Three extends MyChild{
    public void add(int a){
        System.out.println("From Three");
    }
}


public class NEWTest {
    public static void main(String[] args) {

        Three o =  new Three();
            o.add(2);


//        int [] arr ={1, 4, 6, 8, 9, 1, 9, 5};
//        find(arr);
//        TestGC();
//        System.gc();
//        Runtime.getRuntime().gc();
//        String str = "Hello is Hello";
//        System.out.println(findMirror( str));

    }

    private static void TestGC() {
        Runtime r = Runtime.getRuntime();
        System.out.println(r.totalMemory());
        System.out.println(r.freeMemory());
        for (int i = 0 ; i<1000000000;i++){
            Date d = new Date();
            d = null;
        }
        r.gc();
        System.out.println(r.totalMemory());
        System.out.println(r.freeMemory());

    }

    public static boolean findMirror(String str){
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

    public static void find(int [] arr){
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
