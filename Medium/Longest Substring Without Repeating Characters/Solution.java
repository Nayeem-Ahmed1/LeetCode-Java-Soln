
/*

Problem: https://leetcode.com/problems/longest-substring-without-repeating-characters
Difficulty: Medium
Date Solved: 2025-07-25

Note : Two pointers approach.Iterating through the string until i find a character that repeats and if it repeats i can move startindex further or else endIndex just moves,startIndex doesn't change;

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

            char ch = s.charAt(endIndex);
            
            if(map.containsKey(ch)  && map.get(ch) >= startIndex){

                startIndex = map.get(ch) + 1 ;
            }

                map.put(ch,endIndex);
                endIndex++;
                 

            length = (endIndex-startIndex) ;

            if(length > maxLength){

                maxLength = length;

            }          
        }   

        return maxLength;     
    }
}