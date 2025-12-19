import java.util.*;
/*.   leetcode 703, Where we are looking for the kth largest element of the array and adding more numbers and updating the kth largest
 *  we Utilize a min heap where the kth node added to the heap is the kth largest of the array
 */
class kthLargest  {
    public static void main(String[] args){
        int val = 11;
        int[] nums = {1, 5, 2, 9, 4};
        int k = 2;
        KthLargest obj = new KthLargest(k, nums);
        System.out.println(obj.add(val));
    }
    static class KthLargest {
    PriorityQueue<Integer> max;
    int kth;

    public KthLargest(int k, int[] nums) {
        max = new PriorityQueue<>();
        kth = k;
        for(int i: nums)
        {
            if(max.size() < k)
                max.offer(i);
            else
                add(i);
        }   
    }
    
    public int add(int val) {
        if(max.size() < kth)
            max.offer(val);
        else if(max.peek() < val){
            max.poll();
            max.offer(val);
        }
        
        return max.peek();    
    }
}

}
