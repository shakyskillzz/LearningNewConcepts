import java.util.*;
/*This is leetcode 22, where you make all possible combinations of valid parenthesis strings based on n
 * it uses DP and backtracking
 * the backtracking is in the reccursive call of the function 'backtrack'
 * The dynamic programming is in building each string step by step.
 */

public class generateParenthesis{
    public static void main(String arg[]){
        List<String> l = generateParenthesis(3);
        System.out.println(l.get(0));
    }
    public static List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        backtrack(ret, "", 0, 0, n);
        return ret;
    }
    public static void backtrack(List<String> ret, String cur, int open, int close, int n)
    {
        if(cur.length() == 2*n){
            ret.add(cur);
            return;
        }
        if(open < n) backtrack(ret, cur + "(", open +1, close, n);
        if(close < open) backtrack(ret, cur + ")", open, close+1, n);
    }
}