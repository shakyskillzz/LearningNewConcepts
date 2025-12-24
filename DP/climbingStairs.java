import java.util.*;
/* This is LEETCODE 70
    in this leetcode we are using dp from bottom up (tabulation)
    this is fibonici. So doing fibonici it gives us all the different ways you can add to that number (doesnt make complete sense to me yet)
    our base case is dp[1] = 1; and dp[2] = 2 and we use that to build from bottom up
 */

class climbingStairs{
    public static void main(String[] args){
        int test = 7;
        System.out.println("Test Answer:" + climbStairs(test));
    }
    public static int climbStairs(int n) {
        if(n <= 2)
            return n;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}