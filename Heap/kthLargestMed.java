import java.util.*;
/*
 * This is leetcode 215 where you find the kth largest integer including duplicates
 * We use a min heap and keeep it at size k where the top of the heap will be the kth largest element
 */
class kthLargestMed{
    public static void main(String[] args){

    }
    public int findKthLargest(int[] nums, int k){

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int j = 0;
        while(heap.size() < k)
        {
            heap.offer(nums[j]);
            j++;
        }
        for(int i = j; i < nums.length; i++)
        {
            if(nums[i] < heap.peek())
                continue;
            heap.poll();
            heap.offer(nums[i]);
        }
        return heap.peek();
    }
}