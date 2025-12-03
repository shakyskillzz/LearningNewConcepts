import java.util.*;
/*
 This is leetcode 153, and this one utilizes binaary search in an ascending array where it was rotated/shifted to the right x number of times
 by using Binary search it runs in logn time and finds the minimum num in the array.
 */

class min_in_rotated_array{

    public static void main(String[] args){
        int[] nums = {7,8,1,2,3,4};
        System.out.println(findMin(nums));
    }

    static public int findMin(int[] nums) {
        
        int left = 0;
        int right = nums.length-1;
        
        while(left < right)
        {
            int mid = (left + right) / 2;

            if(nums[mid] > nums[right])
            {
                left = mid + 1;
            }
            else{
                right = mid;
            }

        }
        return nums[left];
    }
}