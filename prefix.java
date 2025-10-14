import java.util.*;

/* This is me learning about prefix. Prefix sum is making an additional array that keeps track of the sum of all numbers up until that index.
 
Here is leetcode 238, where you find the multiplication of the whole array except that index. Ex.)
    nums = {1,2,3,4}
    retArray = {24,12,8,6}

    We use the concept of prefix by keeping track of the product of everything to the left of the index, and of the right of the index.
    so you multiply the product of the left and right side of that basically. First we get the product of the left side till we reach the end,
    then we back track and keep track of the product of the right.
 */

class prefix {

    public static void main(String[] args){
        
        int[] numbers = {1,2,3,4,5};

        int[] r = productExceptSelf(numbers);

        for(int i = 0; i < r.length; i++)
        {
            System.out.println(r[i]);
        }

    }

    static int[] productExceptSelf(int[] nums) 
    {
        int[] ret = new int[nums.length];
        ret[0] = 1;

        for(int i = 1; i < nums.length; i++) ret[i] = nums[i-1] * ret[i-1];

        int right = 1;
        for(int i = nums.length - 1; i >= 0; i--)
        {
            ret[i] *= right;
            right *= nums[i];
        }

        return ret;
    }

}
