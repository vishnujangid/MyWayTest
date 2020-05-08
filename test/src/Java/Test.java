package Java;

import com.sun.xml.internal.ws.util.StringUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Super {
    public int add() {
        System.out.println("super");
        return 0;
    }
    
    public int m1() {
        return 1;
    }
}

class Child extends Super {
    public int add() {
        System.out.println("BASE");
        return 0;
    }
}


public class Test {
    
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String  test = s.nextLine();
//        int u = s.nextInt();
//        System.out.println(test);
//        System.out.println(u);
     String s= "1010";
        System.out.println(Integer.parseInt(s,2));
        int [] i= {1,2,3,4,5};
//        String str = "i am harshit";
//        String arrstr[] = str.split(" ");
//        for (int i = arrstr.length - 1; i >=0; i--) {
//            System.out.print(arrstr[i]+" ");
//        }
    }
    
    
}
