package Sliding_Window_and_Two_Pointer;

import java.util.HashSet;

/*
3. Longest Substring Without Repeating Characters
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given a string s, find the length of the longest substring without duplicate characters.
*/
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}
