import java.util.*;
/*STACKS
 * uses monotonic stack, which is using a stack while maintaining increasing or decreasing order.
 * in this leetcode 739, we the stack to keep track of the decreasing order of temperatures untill we get to a temperature is increasing.
 * then we write the difference in amount of spaces in between
 */
public class monotonicStack{
    public static void main(String[] args){
        int[] temps = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] ans = dailyTemperatures(temps);
        for(int i: ans)
            System.out.println(i);
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Deque<Integer> st = new ArrayDeque<>(); 

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) 
            {
                int j = st.pop();
                ans[j] = i - j;
            }
            st.push(i);
        }
        return ans;
    }
}