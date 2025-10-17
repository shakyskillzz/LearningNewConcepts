import java.util.*;

/*This one is more simpler. It focuses on the two pointer method.
 What makes this one unique is it uses the infamous twoSum solution as a part of this solution. aka the two pointer.
 For each index starting at 0, you use the two pointer method(or twoSum solution) for everything to the right of it to find the THREE SUM.
 */

public class threeSum{
    public static void main(String[]args){
        int[] nums = {-4,-1,4,-5,2,3,0,-2,2};
        List<List<Integer>> newArr = threeSum(nums);
    }
    static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ret = new ArrayList<>();

        for(int i = 0; i < nums.length-2; i++)
        {
            if(i > 0 && nums[i-1] == nums[i]) continue;
            if(nums[i] > 0) break;

            int l = i+1;
            int r = nums.length - 1;
            while(l < r)
            {
                if(nums[i] + nums[l] + nums[r] > 0)
                {
                    r--;
                }
                else if(nums[i] + nums[l] + nums[r] < 0)
                {
                    l++;
                }
                else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    ret.add(temp);
                    r--;;
                    l++;
                    while(l < r && nums[l-1] == nums[l]) l++;
                    while(l < r && nums[r+1] == nums[r]) r--;
                }
            }
        }
        return ret;
    }
}