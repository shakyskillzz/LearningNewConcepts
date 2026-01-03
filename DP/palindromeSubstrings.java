import java.util.*;
/*leetcode 647, find all the palindrome of the substrings, s = "aaa", ret = 6, bc.. "a", "a", "a", "aa", "aa", "aaa"
So this uses DP && Two pointers methods. because we are building from bottom up (tabulation)
it runs O(n^2) and space complexity O(1)
a palindrome starts either as odd "a" or even "aa"
therefore, we start from the middle and if the 'center' is the same letter, then we can expand to the right and left and if it is the same again
then that is ALSO a palindrome
 */

class palindromeSubstrings{
    public static void main(String[] args){
        System.out.println(countSubstrings("aaa"));
    }
    public static int countSubstrings(String s) {
        int left = 0;
        int right = s.length() -1;
        int ret = 0;
        for(int i = 0; i < s.length(); i++)
        {
            ret += expand(s, i, i);
            ret += expand(s, i, i+1);
        }
        return ret;
    }
    public static int expand(String s, int left, int right){
        int count = 0;
        int len = s.length();
        while(left >= 0 && right < len && s.charAt(left) == s.charAt(right)){
            count++;
            right++;
            left--;
        }
        return count;
    }
}