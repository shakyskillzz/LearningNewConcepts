import java.util.*;
/*
 * This is leetcode 1046
 * It is a very simple usage of a max Heap.
 * Heaps are priority queues in java and by default are min heaps.
 * This leetcode takes the 2 largest values or 'stones' in an int array and takes the difference and puts it back in the heap
 * untill we are left with 1 or no stones.
 * then returns the last ones value
 */

 class lastStone{
    public static void main(String[] args){
        int[] nums = {1,1,4,4,5};
        System.out.println(lastStoneWeight(nums));
    }
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        int x;
        int y;
        for(int i: stones)
        {
            max.offer(i);
        }
        while(max.size() > 1)
        {
            y = max.poll();
            x = max.poll();
            if(x != y){
                y = y-x;
                max.offer(y);
            }
        }
        if(max.size() == 0)
            return 0;
        else
            return max.poll();
    }
 }