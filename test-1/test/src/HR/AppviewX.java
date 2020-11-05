package HR;

import java.math.BigInteger;
class A {
    public void m1(){
        System.out.println("A");
    }
    public void m2(int i){
        System.out.println("A : "+i);
    }
}
class B extends A{
    public void m1(){
        System.out.println("B");
    }
    public void m2(long i){
        System.out.println("B : "+i);
    }

    public void s(Object o){
        System.out.println("Object");
    }
    public void s(String o){
        System.out.println("String");
    }

}



public class AppviewX implements Cloneable {
    public static void main(String[] args) {

        B b = new B();
        b.s("null");

//        A a = new B();
//        a.m1();
//        a.m2(1);
//
//        B b = new B();
//        A a1 =  (A)b;
//        a1.m1();
//        a1.m2(1);

//        System.out.println(second(111));

//        forst();
    }

//    private static void forst() {
//
//
//
//        class Result {
//
//            /*
//             * Complete the 'perfectSubstring' function below.
//             *
//             * The function is expected to return an INTEGER.
//             * The function accepts following parameters:
//             *  1. STRING s
//             *  2. INTEGER k
//             */
//            static int MAX_CHAR = 10;
//            static boolean check(int freq[], int k)
//            {
//                for (int i = 0; i < MAX_CHAR; i++)
//                    if (freq[i] !=0 && freq[i] != k)
//                        return false;
//                return true;
//            }
//            public static int perfectSubstring(String s, int k) {
//                int res = 0;
//                for (int i = 0; i< s.length(); i++)
//                {
//
//                    int freq[] = new int[MAX_CHAR];
//
//                    for (int j = i; j<s.length(); j++)
//                    {
//
//
//                        int index = s.charAt(j) - '0';
//                        freq[index]++;
//
//
//                        if (freq[index] > k)
//                            break;
//
//
//                        else if (freq[index] == k &&
//                                check(freq, k) == true)
//                            res++;
//                    }
//                }
//                return res;
//
//            }
//
//        }
//        public class Solution {
//    }
//    }

    private static long second(long number) {


            /*
             * Complete the 'minOperations' function below.
             *
             * The function is expected to return a LONG_INTEGER.
             * The function accepts LONG_INTEGER n as parameter.
             */

                // Write your code here
                int bit = number < 0 ? 1 : 0;
                BigInteger result = BigInteger.valueOf(bit);
                for (int i = 0; i < 63; i++) {
                    number = number << 1;
                    int sign = number < 0 ? 1 : 0;
                    bit = (bit + sign) % 2;
                    result = result.shiftLeft(1).add(BigInteger.valueOf(bit));
                }
                return result.longValue();

        }

}
