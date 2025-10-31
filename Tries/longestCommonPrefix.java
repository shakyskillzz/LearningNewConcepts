import java.util.*;
/*This leetcode is self self explanotory, its in the name.
 * It uses the concepts of tries and uses the first word as a base and uses that to continue comparing to the following strings and
 * creating substrings from that
 */

public class longestCommonPrefix{
    public static void main(String[] args){
        String[] s = {"flower", "flow", "flop", "flo"};
        System.out.println(longestCommonPrefix(s));
    }

    public static String longestCommonPrefix(String[] strs) {

        String s = strs[0];
        int j = 0;
        for(int i = 1; i < strs.length; i++)
        {
            for(j = 0;j < s.length() && j < strs[i].length(); j++)
            {
                if(strs[0].charAt(j) != strs[i].charAt(j))
                {
                    break;
                }
            }
            s = s.substring(0,j);
        }

        return s;
    }
}