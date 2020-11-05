package Java;

public class isValid {
    public static void main(String[] args) {
        //      String s = "i am a developer";
        //        System.out.printf(new isValid().reverseOfWord(s));

        int x =10, y = 30;
        x = x^y;
        y = x ^ y;
        x = x ^ y;
        x = (int)Math.sqrt(x);
        System.out.printf("x = "+x);
        System.out.printf("y = "+Math.floor(Math.sqrt(y)));
    }

    private String reverseOfWord(String str) {

//        for(int i=0, j = str.length()-1; i<str.length();i++,j--){
//            char c = str.charAt(i);
//
//        }
        return str;
    }
}
