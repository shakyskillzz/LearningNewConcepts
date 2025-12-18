import java.util.*;
/*This is leetcode 3: Longest Substring without repeating characters
 * this one was a tougher one, we utilize the sliding window
 * again, keeping track of the left and right
 * the left starts at 0 and the right is the index we are at in the for loop
 * we keep putting the character and its index in a hashmap in (character, index) format
 * we only update the left if the hashmap has the letter and that index is at or greater than the "left"
 * then we find the difference by doing right - left + 1
 */

class longestSubstring{

    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("abcaaaadfgb"));
    }
    public static int lengthOfLongestSubstring(String s) {

        int max = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;

        int diff;
        
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(map.containsKey(c) && map.get(c) >= left)
                left = map.get(c) + 1;
            
            map.put(c,i);

            diff = i - left + 1;
            if(diff > max)
                max = diff;
            
        }
        
        
        return max;
    }
}