package Java;

public class StringReverse {
    public static void main(String[] args) {
        String str = "i am a Developer";
        String reverseStr = reverseString(str);
        System.out.println(reverseStr);

//        System.out.println(reverseWords(str));
    }

    private static String reverseString(String str) {
        char [] chars = str.toCharArray();
        for(int i = 0,j=chars.length-1 ; i<j;i++,j--){
            char c = chars[i];
            chars[i]=chars[j];
            chars[j] = c;
        }


        int index = 0;
        for(int i =0 ; i<chars.length; i++){
            if(chars[i] == ' ' ){
                for(int j = index, k = i-1;j<k; j++,k--){
                    char c = chars[j];
                    chars[j]=chars[k];
                    chars[k] = c;
                }
                index = i+1;
            }
        }



        return String.valueOf(chars);
    }
    public static String reverseWords(String str)
    {
        char[] chars = str.toCharArray();
        int wstart=0;
        for (int pos=0;;pos++)
        {
            if (pos < chars.length && chars[pos]!=' ')
            {
                continue;
            }
            for (int wend=pos-1; wend>wstart; ++wstart,--wend)
            {
                char t=chars[wstart];
                chars[wstart]=chars[wend];
                chars[wend]=t;
            }
            if (pos>=chars.length)
            {
                break;
            }
            wstart=pos+1;
        }
        return String.valueOf(chars);
    }
}
