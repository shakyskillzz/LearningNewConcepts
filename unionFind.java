import java.util.*;
/* Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4*/

/*The solution uses the concepts of union find so you keep track of the longest streak of consecutive numbers*/

class unionFind{
    public static void main(String[]args)
    {
        int[] nums = {1,5,2,3,9,9,9,9};
        System.out.println(longestConsecutive(nums));
    }
    static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums) set.add(i);

        int max = 0;
        int curr = 1;

        for(int i: set)
        {
            if(!set.contains(i-1))
            {
                curr = 1;
                int x = i;
                while(set.contains(i+1))
                {
                    i++;
                    curr++;
                }
                if(curr > max) max = curr;
            }
        }
        return max;
    }

}