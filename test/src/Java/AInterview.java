package Java;

import java.util.HashMap;
import java.util.Map;

public class AInterview {
    public static void main(String[] args) {
        String str1 = "aabc";//0(n)
        String str = "acaf";
        System.out.println(getAnnagram(str1,str));
        Map map = new HashMap();
//        map.put()


    }

    public static boolean getAnnagram(String str1, String str2) {

        if (str1.length() != str2.length())
            return false;
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            boolean flag = false;
            for (int j = 0; j < str2.length(); j++) {
                if (c == str2.charAt(j)) {
                    str2.replaceFirst(c + "", 0 + "");
                    flag = true;
                    break;
                }
            }
            if (!flag) return false;
        }
        return true;
    }

}
