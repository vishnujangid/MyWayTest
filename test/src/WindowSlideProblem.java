import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WindowSlideProblem {
    // Java program to find the smallest window containing
    // all characters of a pattern.
    public static void main(String args[])
    {
        List<Long> list= Arrays.asList(1L,2L);
        Map<Long, Double> kvs =list.stream().collect(Collectors.toMap(x -> x, x -> 0D));
        Map<Long, Double> kvs1 =list.stream().collect(Collectors.toMap(id -> id, id -> 0D, (a, b) -> b));
        System.out.println(kvs);
        System.out.println( kvs1);
        System.out.println( new Date().getTime());


//        String str = "adonutsandwaffylemakemehungrayaayyaayy";
//        System.out.println(System.nanoTime());
//        System.out.println("Smallest window containing all distinct"
//                + " characters is: " + findSubString(str));
//        System.out.println(System.nanoTime());
    }

        static final int MAX_CHARS = 256;

        // Function to find smallest window containing
        // all distinct characters
        static String findSubString(String str)
        {
            int n = str.length();

            // Count all distinct characters.
            int dist_count = 0;

            boolean[] visited = new boolean[MAX_CHARS];
            Arrays.fill(visited, false);
            for (int i = 0; i < n; i++) {
                if (visited[str.charAt(i)] == false) {
                    visited[str.charAt(i)] = true;
                    dist_count++;
                }
            }

            // Now follow the algorithm discussed in below
            // post. We basically maintain a window of characters
            // that contains all characters of given string.
            int start = 0, start_index = -1;
            int min_len = Integer.MAX_VALUE;

            int count = 0;
            int[] curr_count = new int[MAX_CHARS];
            for (int j = 0; j < n; j++) {
                // Count occurrence of characters of string
                curr_count[str.charAt(j)]++;

                // If any distinct character matched,
                // then increment count
                if (curr_count[str.charAt(j)] == 1)
                    count++;

                // if all the characters are matched
                if (count == dist_count) {
                    // Try to minimize the window i.e., check if
                    // any character is occurring more no. of times
                    // than its occurrence in pattern, if yes
                    // then remove it from starting and also remove
                    // the useless characters.
                    while (curr_count[str.charAt(start)] > 1) {
                        if (curr_count[str.charAt(start)] > 1)
                            curr_count[str.charAt(start)]--;
                        start++;
                    }

                    // Update window size
                    int len_window = j - start + 1;
                    if (min_len > len_window) {
                        min_len = len_window;
                        start_index = start;
                    }
                }
            }
            // Return substring starting from start_index
            // and length min_len
            return str.substring(start_index, start_index + min_len);
        }

        // Driver code

    }


