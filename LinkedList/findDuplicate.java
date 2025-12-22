import java.util.*;
/*  Leetcode 287, Find duplicate number in nums array with CONSTANT SPACE
 * This was an AMAZING EXPERIENCE of a leetcode
 * The turtle and the hare is one that is used to detect a cycle
 * the turtle takes 1 step and the hare takes 2 steps, eventualy they WILL meet at SOME point in the cycle
 * This nums array can be thought as a linked list bc the nums[i] is the index of the next value such as node.next = nums[nums[i]];
 * once you find that ONE meeting point in the cycle you start another pointer at the head and move both 1 step forward and eventually
 * they will meet at the entrance of the cycle which IS the DUPLICATE 
 */
class findDuplicate{
    public static void main(String[] args){
        int[] arr = {1,3,4,2,2};

        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] nums){
        int turtle = 0;
        int hare = 0;

        do{
            turtle = nums[turtle];
            hare = nums[nums[hare]];
        }while(turtle != hare);
        int pt1 = 0;
        int pt2 = turtle;
        while(pt1 != pt2){
            pt1 = nums[pt1];
            pt2 = nums[pt2];
        }
        return pt2;
    }
}