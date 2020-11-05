package Slack;

import java.util.Scanner;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
//        int [] arr = {1,2,3,4,5,6,7,8,9,10};
//        int k = 15;
//        printIndex(arr, k);
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int c =0;c<tc;c++){
            int arrlen =  sc.nextInt();

            int k= sc.nextInt();
            int [] arr = new int[arrlen];
            for(int i =0 ;i<arrlen;i++){
                arr[i]=sc.nextInt();
            }

            if(!printIndex(arr, k))
                System.out.println("-1");

        }
    }
    static boolean printIndex(int [] arr , int k ){
        int l= arr.length;
        boolean flag= false;
        for(int i =0;i<l; i++){
            int sum =0;
            for(int j = i;j<l;j++){
                sum +=arr[j];
                if (sum >= k) {
                    if (sum == k) {
                        System.out.println(++i + " " + ++j);
                        flag = true;
                    }
                    break;
                }

            }
            if(flag)return flag;
        }
        return flag;

    }
}
