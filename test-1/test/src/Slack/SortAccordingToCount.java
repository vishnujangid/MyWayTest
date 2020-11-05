package Slack;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortAccordingToCount {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 3, 9, 4, 6, 7, 15, 32};
        List<Integer> list = Arrays.asList(arr);
        list.sort((i1, i2) -> -Integer.compare(Integer.bitCount(i1), Integer.bitCount(i2)));
        System.out.println(3>>1);
        countBits(5);
    }
    static int countBits(int a)
    {
        int count = 0;
        while (a > 0)
        {
            if ((a & 1) > 0)
                count+= 1;
            a = a >> 1;
        }
        return count;
    }
}
