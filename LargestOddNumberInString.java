import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 
 */
public class LargestOddNumberInString {


    /**
     * You are given a string num, representing a large integer. 
     * Return the largest-valued odd integer (as a string) that is 
     * a non-empty substring of num, 
     * or an empty string "" if no odd integer exists.
     * 
     * A substring is a contiguous sequence of characters within a string.
     * 
     * Time: O(n)  Space: O(n)
     * 
     * Runtime: 1 ms, faster than 99.97% of Java online submissions.
     * Memory Usage: 40 MB, less than 72.50% of Java online submissions.
     */
    static String largestOddNumber(String num) {
        
        // **** sanity check(s) ****
        if (num.length() == 0 || num.equals("0")) return "";

        // **** look for odd digit (right to left) ****
        for (int i = num.length() - 1; i >= 0; i--) {

            // **** check if odd ****
            if (num.charAt(i) % 2 == 1)
                return num.substring(0, i + 1);
        }

        // **** odd substring not found ****
        return "";
    }


    /**
     * Test scaffold.
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        
        // **** open buffered reader ****
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // **** read num string ****
        String num = br.readLine().trim();

        // **** close buffered reader ****
        br.close();

        // ???? ????
        System.out.println("main <<< num ==>" + num + "<==");

        // **** call function of interest and display result ****
        System.out.println("main <<< largestOddNumber ==>" + largestOddNumber(num) + "<==");
    }
}