import java.util.*;

/* 
 * This is LeetCode 121
 * It uses the most basic form of sliding window.
 * you have a list of prices on i^th day and have to find the best time to buy then sell to maximize profit
 Our "Sliding window" starts at the first number and loops untill the end or we find a number less than our begining of the window.
 As you are looping through you constantly keep track of the difference and max difference
 If you come acrosss a number lesss than the begining of the sliding window, we make that one the new begining of the window and continue sliding
*/

class buySellStock{

    public static void main(String[] args){
        int[] example = {7,1,5,3,6,4};

        System.out.println("Answer is: " + maxProfit(example));
    }
    static int maxProfit(int[] prices){
        int ret = 0;

        int curr = prices[0];

        if(prices.length == 1)
            return ret;

        for(int i = 1; i < prices.length; i++)
        {
            if(prices[i] < curr){
                curr = prices[i];
                continue;
            }
            if(prices[i] - curr > ret)
                ret = prices[i] - curr;
        }
        return ret;
    }
}