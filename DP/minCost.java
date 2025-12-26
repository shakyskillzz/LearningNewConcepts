import java.util.*;
/* Leetcode 746, the minimum cost of getting to that step where cost[i] is the cost of that step, and we can move 1 step or 2
We use tabulation (bottom up) and although we could do this in space complexity O(1) not O(n), its easier for me to understand using dp[n+1]
dp[i] is the cost is takes to get to that point, so we set the first two steps at 0 since u can start at either or
we start at i=2 and constantly update what the minimum cost it takes to get to that step 
the final answer would be dp[n], since that represents the top aka 1 index past cost array
*/
class minCost{
    public static void main(String[] args){
        int[] nums = {1,100,2};
        System.out.println(minCostClimbingStairs(nums));
    }
    public static int minCostClimbingStairs(int[] cost) {
        
        int n = cost.length;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2; i <= n; i++)
        {
            dp[i] = Math.min(dp[i-1] + cost[i-1], dp[i-2] + cost[i-2]);
        }
        return dp[n];
    }
}
