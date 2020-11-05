package Java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

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

//        String[][] str = {{"a", "b"}, {"c", "d"},{"e", "f"},{"g", "h"}};
//
//        Map<String, String> map = new HashMap<>();
//        map = Arrays.stream(str).collect(Collectors.toMap(s -> s[0], s -> s[1]));
//       // map = Arrays.stream(str).collect(Collectors.toMap(s -> s[0], s -> new Order(s[1])));
//        System.out.println(map);
        System.out.println(checkPalindrome("ababba"));
    }
    public static boolean checkPalindrome(String str)
    {
        if(str.length() == 0 || str.length() == 1)
            return true;
        if(str.charAt(0) == str.charAt(str.length() - 1))
            return checkPalindrome(str.substring(1, str.length() - 1));
        return false;
    }

    
    
}
