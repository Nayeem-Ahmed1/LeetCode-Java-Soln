
/*

Problem: https://leetcode.com/problems/longest-substring-without-repeating-characters
Difficulty: Medium
Date Solved: 2025-07-25

 */

import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> map = new HashMap<>();

        int startIndex =0;
        int endIndex = 0;

        int length = 0;
        int maxLength = 0;

        while(endIndex < s.length()){
            
            if(map.containsKey(s.charAt(endIndex))  && map.get(s.charAt(endIndex)) >= startIndex){

                startIndex = map.get(s.charAt(endIndex)) + 1 ;
            }

                map.put(s.charAt(endIndex),endIndex);
                endIndex++;
                 

            length = (endIndex-startIndex) ;

            if(length > maxLength){

                maxLength = length;

            }          
        }   

        return maxLength;     
    }
}